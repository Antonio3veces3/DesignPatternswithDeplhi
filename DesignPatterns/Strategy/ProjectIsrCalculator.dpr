program ProjectIsrCalculator;

uses
  Vcl.Forms,
  StrategyIsrCalculatorFrm in 'StrategyIsrCalculatorFrm.pas' {Form1},
  ICalculatorIsr in 'ICalculatorIsr.pas',
  IsrCoa in 'IsrCoa.pas',
  IsrDur in 'IsrDur.pas',
  IsrZac in 'IsrZac.pas',
  MexState in 'MexState.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
