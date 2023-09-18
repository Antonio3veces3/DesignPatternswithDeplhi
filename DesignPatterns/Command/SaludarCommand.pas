unit SaludarCommand;

interface
uses Vcl.Forms, Command, IntReceiver;
type
  TSaludarCommand = class(TInterfacedObject, ICommand)
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

constructor TSaludarCommand.Create(AForm: IReceiver);
begin
  FForm := AForm;
  FNombre := 'Saludar';
end;

procedure TSaludarCommand.Execute;
begin
  FForm.Saludar;
end;

function TSaludarCommand.GetNombre: string;
begin
  Result := FNombre;
end;
end.
