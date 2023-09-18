program ProjectObserver;

uses
  Vcl.Forms,
  ObserverApp in 'ObserverApp.pas' {Form1},
  Subject in 'Subject.pas',
  Observer in 'Observer.pas',
  UserData in 'UserData.pas',
  Sum in 'Sum.pas',
  NoItems in 'NoItems.pas',
  BiggestNumber in 'BiggestNumber.pas',
  SmallestNumber in 'SmallestNumber.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
