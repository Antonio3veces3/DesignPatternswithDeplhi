{***********************************************************}
{                                                           }
{    unit IsrCalculatorFrm                                  }
{    Contains the capture to calculate the ISR in           }
{    different states on Mexico.                            }
{                                                           }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit StrategyIsrCalculatorFrm;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes,
  Vcl.Graphics, Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.NumberBox, StrUtils,
  Vcl.Mask, MexState, IsrCoa, IsrDur, IsrZac;

type
  /// <summary>
  ///   TForm1 contains the visual components to calculate ISR.
  ///   WELCOME TO STRATEGY
  /// </summary>
  TForm1 = class(TForm)
    cmbxMexState: TComboBox;
    nmbxAmmount: TNumberBox;
    StaticText1: TStaticText;
    StaticText2: TStaticText;
    GroupBox1: TGroupBox;
    txtResult: TStaticText;
    /// <summary>
    ///   Detect when  States combo box change its selected item.
    /// </summary>
    /// <param name="Sender">
    ///   Pointer to State combo box
    /// </param>
    procedure cmbxMexStateChange(Sender: TObject);
    /// <summary>
    ///   Detect when  TForm1 is created
    /// </summary>
    /// <param name="Sender">
    ///   Pointer to Form Object
    /// </param>
    procedure FormCreate(Sender: TObject);
    /// <summary>
    ///   Detect when user exits from Ammount input
    /// </summary>
    /// <param name="Sender">
    ///   Pointer to Ammount number box  Object
    /// </param>
    procedure nmbxAmmountExit(Sender: TObject);
    /// <summary>
    ///   Free the classes we create throughout the runtime.
    /// </summary>
    procedure FormDestroy(Sender: TObject);

  private
    // Reference to client that implement factory methods and calculate the
    // ISR about different Mexico states.
    FStateMexIsr: TStateMexIsr;
    /// <summary>
    ///   Get the current values and refresh the ISR calculate.
    /// </summary>
    procedure RefreshCalculate;
    procedure ShowResult(AnAmmount: Double);

  end;

var
  Form1: TForm1;


implementation

{$R *.dfm}

procedure TForm1.RefreshCalculate;
var lAmmount: Double;
begin
  lAmmount:=  StrToFloat(nmbxAmmount.Text);
  // If Ammount is less equal than 0.00 the result will be 0 or negative.
  if(lAmmount >= 0.00) then
    begin
      // Create the concreteStrategy according to the Mexico State selected.
      case AnsiIndexStr(cmbxMexState.Text, ['Coahuila', 'Durango', 'Zacatecas']) of
        0: FStateMexIsr.MexState := TIsrCoa.Create;
        1 :FStateMexIsr.MexState := TIsrDur.Create;
        2: FStateMexIsr.MexState := TIsrZac.Create;
        end;
      ShowResult(FStateMexIsr.Calculate(lAmmount))
    end
  else
    begin
      ShowMessage('El importe no puede ser una cantidad negativa')
    end;
end;

procedure TForm1.cmbxMexStateChange(Sender: TObject);
begin
  // Refresh the ISR result when state combo box changes the item selected,
  Form1.RefreshCalculate;
end;


procedure TForm1.nmbxAmmountExit(Sender: TObject);
begin
  // Refresh the ISR result when the value of Ammount changes,
  Form1.RefreshCalculate;
end;

procedure TForm1.ShowResult(AnAmmount: Double);
begin
  txtResult.Caption := FloatToStr(AnAmmount);
end;


procedure TForm1.FormCreate(Sender: TObject);
begin
  // Create the instance of Mex State class when the form is created.
  FStateMexIsr := TStateMexIsr.Create;
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
  // To liberate the class
  FreeAndNil(FStateMexIsr);
end;

end.
