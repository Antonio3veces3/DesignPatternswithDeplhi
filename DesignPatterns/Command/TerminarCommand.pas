unit TerminarCommand;

interface

uses Vcl.Forms, Command, Receiver, IntReceiver;
type
  TTerminarCommand = class(TInterfacedObject, ICommand)
    private
      FForm : IReceiver;
      FNombre: String;
      function GetNombre : String;
    public
      constructor Create(AForm : IReceiver);
      procedure Execute;
      property nombre : String read GetNombre;
  end;

implementation

constructor TTerminarCommand.Create(AForm: IReceiver);
begin
  FForm := AForm;
  FNombre := 'Terminar';
end;

procedure TTerminarCommand.Execute;
begin
  FForm.Terminar;
end;

function TTerminarCommand.GetNombre: string;
begin
  Result := FNombre;
end;

end.
