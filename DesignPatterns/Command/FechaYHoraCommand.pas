unit FechaYHoraCommand;

interface

uses Vcl.Forms, Command, Receiver, IntReceiver;
type
  TFechaYHoraCommand = class(TInterfacedObject, ICommand)
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

constructor TFechaYHoraCommand.Create(AForm: IReceiver);
begin
  FForm := AForm;
  FNombre := 'Fecha y hora';
end;

procedure TFechaYHoraCommand.Execute;
begin
  FForm.VerFechaYHora;
end;

function TFechaYHoraCommand.GetNombre: string;
begin
  Result := FNombre;
end;

end.
