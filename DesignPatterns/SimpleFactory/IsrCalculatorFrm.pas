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
unit IsrCalculatorFrm;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes,
  Vcl.Graphics, Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.NumberBox, StrUtils,
  Vcl.Mask, StateMexIsr, FactoryEdoMexIsr;

type
  /// <summary>
  ///   TForm1 contains the visual components calculate ISR APP.
  /// </summary>
  TForm1 = class(TForm)
    cmbxState: TComboBox;
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
    procedure cmbxStateChange(Sender: TObject);
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
    // Reference to client that implement Simple Factory methods and
    // Create the Mexico states to calculate its ISR.
    FStateMexIsr: TStateMexIsr;
    FEdoMexFactory : TEdoMexFactory;
    /// <summary>
    ///   Get the current values and refresh the ISR calculate.
    /// </summary>
    procedure RefreshCalculate;
    /// <summary>
    ///   Show the total ISR
    /// </summary>
    /// <param name="AnAmmount">
    ///   Total ISR
    /// </param>
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
    // Update the current Mexico State Selected through de Factory class.
    // Then, calculate and show the total ISR.
    FStateMexIsr.nombreEdoMex := cmbxState.Text;
    ShowResult(FStateMexIsr.CalcularEdoMexIsr(lAmmount));
  end
  else
  begin
    ShowMessage('El importe no puede ser una cantidad negativa')
  end;
end;

procedure TForm1.cmbxStateChange(Sender: TObject);
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
  // Create the instance of client class.
  FStateMexIsr := TStateMexIsr.Create(FEdoMexFactory);
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
  // Destroy in safe way the client class
  FreeAndNil(FStateMexIsr);
end;

end.
