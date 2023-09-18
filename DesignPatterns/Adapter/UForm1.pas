unit UForm1;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants,
  System.Classes, Vcl.Graphics, Vcl.Controls, Vcl.Forms, Vcl.Dialogs,
  Vcl.StdCtrls, SumInteger, CalcSumInteger, AdapterSumDouble, CalcSumDouble;

type
  TForm1 = class(TForm)
    edtNumA: TEdit;
    edtNumB: TEdit;
    GroupBox1: TGroupBox;
    btnSumar: TButton;
    StaticText1: TStaticText;
    StaticText2: TStaticText;
    GroupBox2: TGroupBox;
    stxtResult: TStaticText;
    procedure btnSumarClick(Sender: TObject);
    procedure FormCreate(Sender: TObject);
    procedure FormDestroy(Sender: TObject);
  private
    FAdapterSumDouble : ISumInt;
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}


procedure TForm1.btnSumarClick(Sender: TObject);
var
  result : integer;
begin
  result := FAdapterSumDouble.Add(StrToInt(edtNumA.Text), StrToInt(edtNumB.Text));
  stxtResult.Caption := IntToStr(result);
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  FAdapterSumDouble := TAdapterSumDouble.Create(TCalcSumDouble.Create);
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
  //FAdapterSumDouble := nil;
end;

end.
