{***********************************************************}
{                                                           }
{    unit ObserverApp                                       }
{    Contiene la funcionalidad de agrgar numeros enteros    }
{    positivos y mostrar la suma, cantidad de numeros       }
{    agregados, numero menor y mayor.                       }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit ObserverApp;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants,
  System.Classes, Vcl.Graphics, Vcl.Controls, Vcl.Forms, Vcl.Dialogs,
  Vcl.StdCtrls, Vcl.Buttons, Vcl.NumberBox, UserData, Sum, NoItems, BiggestNumber, SmallestNumber;

type
  TForm1 = class(TForm)
    btnRestart : TBitBtn;
    StaticText1 : TStaticText;
    GroupBox1 : TGroupBox;
    GroupBox2 : TGroupBox;
    GroupBox3 : TGroupBox;
    GroupBox4 : TGroupBox;
    stxtSum : TStaticText;
    stxtNoItems : TStaticText;
    stxtMayor : TStaticText;
    stxtMenor : TStaticText;
    mmoNumbers : TMemo;
    /// <summary>
    ///   Se ejecuta cuando se crea el Form de la aplicacion
    /// </summary>
    /// <param name="Sender">
    ///   Se refiere al componente Form de la aplicacion.
    /// </param>
    procedure FormCreate(Sender: TObject);
    /// <summary>
    ///   Se ejecuta cuando se destruye el Form de la aplicacion
    /// </summary>
    /// <param name="Sender">
    ///   Se refiere al componente Form de la aplicacion.
    /// </param>
    procedure FormDestroy(Sender: TObject);
    /// <summary>
    ///   Sirve para reiniciar el estado de los controles.
    /// </summary>
    /// <param name="Sender">
    ///   Recibe el Objeto al que se dio clic.
    /// </param>
    procedure btnRestartClick(Sender: TObject);
    /// <summary>
    ///   Sirve para detectar cuando el usuario agrega un numero
    ///   al Memo y da enter para dar un salto de linea.
    /// </summary>
    /// <param name="Sender">
    ///   Se refiere al componente Form de la aplicacion.
    /// </param>
    procedure mmoNumbersKeyPress(Sender: TObject; var Key: Char);

  private
    // SSubject que notifica los cambios de etado. (Nuevos numeros agregados)
    FUserData : TUserData;
    // Observador que recibe el nuevo numero y calcula la suma total.
    FSum : TSum;
    // Observador que cuenta cuantos numeros a añadido el usuario.
    FNoItems : TNoItems;
    // Observador que calcula el numero mayor de los numeros agregados.
    FBiggestNumber : TBiggestNum;
    // Observador que calcula el numero menor de los numeros agregados.
    FSmallestNumber : TSmallestNum;
  public
    { Public declarations }
  end;

var
  Form1 : TForm1;

implementation

{$R *.dfm}



procedure TForm1.btnRestartClick(Sender: TObject);
begin
  FUserData.Reset;    // Metodo para reiniciar los controles y el estado.
  mmoNumbers.Clear;   // Eliminamos las lineas el componente.
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  FUserData := TUserData.Create;
  FSum := TSum.Create(FUserData, stxtSum);
  FNoItems := TNoItems.Create(FUserData, stxtNoItems);
  FBiggestNumber := TBiggestNum.Create(FUserData, stxtMayor);
  FSmallestNumber := TSmallestNum.Create(FUserData, stxtMenor);
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
   FreeAndNil(FSum);
   FreeAndNil(FNoItems);
   FreeAndNil(FBiggestNumber);
   FreeAndNil(FSmallestNumber);
   FreeAndNil(FUserData);
end;

procedure TForm1.mmoNumbersKeyPress(Sender: TObject; var Key: Char);
var lLine : Integer;
begin
    // Si la tecla presionada es ENTER, entonces.
    if Key = #13 then
    begin
      // Obtiene el numero de linea actual en el Memo.
      lLine := mmoNumbers.Perform(EM_LINEFROMCHAR, mmoNumbers.SelStart, 0);

      //Validacion para saber si el numero ingresado al Memo es positivo.
      if StrToInt(mmoNumbers.Lines[lLine]) >= 0 then
        // El Subject Notifica a sus observadores el nuevo numero
        FUserData.AddNewNumber(StrToInt(mmoNumbers.Lines[lLine]))
      else
        ShowMessage('Solo se admiten numeros enteros postivos')
    end;
end;
end.
