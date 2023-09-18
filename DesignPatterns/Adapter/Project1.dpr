program Project1;

uses
  Vcl.Forms,
  UForm1 in 'UForm1.pas' {Form1},
  SumInteger in 'SumInteger.pas',
  CalcSumDouble in 'CalcSumDouble.pas',
  CalcSumInteger in 'CalcSumInteger.pas',
  AdapterSumDouble in 'AdapterSumDouble.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
