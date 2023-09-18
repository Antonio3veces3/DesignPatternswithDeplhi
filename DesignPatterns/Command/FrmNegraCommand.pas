unit FrmNegraCommand;

interface
uses Vcl.Forms, Command, Receiver, IntReceiver;
type
  TFrmNegraCommand = class(TInterfacedObject, ICommand)
    private
      FForm : IReceiver;
      FNombre: String;
    public
      function GetNombre : String;
      constructor Create(AForm : IReceiver);
      procedure Execute;
  end;

implementation

constructor TFrmNegraCommand.Create(AForm: IReceiver);
begin
  FForm := AForm;
  FNombre := 'Forma negra';
end;

procedure TFrmNegraCommand.Execute;
begin
  FForm.SetFrmNegra;
end;

function TFrmNegraCommand.GetNombre: string;
begin
  Result := FNombre;
end;

end.
