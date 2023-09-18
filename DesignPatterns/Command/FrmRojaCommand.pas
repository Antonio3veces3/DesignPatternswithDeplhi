unit FrmRojaCommand;

interface

uses Vcl.Forms, Command, Receiver, IntReceiver;
type
  TFrmRojaCommand = class(TInterfacedObject, ICommand)
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

constructor TFrmRojaCommand.Create(AForm: IReceiver);
begin
  FForm := AForm;
  FNombre := 'Forma roja';
end;

procedure TFrmRojaCommand.Execute;
begin
  FForm.SetFrmRoja;
end;

function TFrmRojaCommand.GetNombre: string;
begin
  Result := FNombre;
end;

end.
