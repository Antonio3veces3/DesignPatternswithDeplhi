program ProjectCommandApp;

uses
  Vcl.Forms,
  CommandFrm in 'CommandFrm.pas' {Form1},
  Command in 'Command.pas',
  Receiver in 'Receiver.pas',
  SaludarCommand in 'SaludarCommand.pas',
  FechaYHoraCommand in 'FechaYHoraCommand.pas',
  FrmRojaCommand in 'FrmRojaCommand.pas',
  FrmNegraCommand in 'FrmNegraCommand.pas',
  TerminarCommand in 'TerminarCommand.pas',
  Invoker in 'Invoker.pas',
  IntReceiver in 'IntReceiver.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
