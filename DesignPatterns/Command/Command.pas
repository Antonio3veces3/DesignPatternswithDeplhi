unit Command;

interface
type
  ICommand = interface['{6AA957FE-7D10-45DB-8345-97ABA6A44A38}']
    procedure Execute();
    function GetNombre: String;
  end;

implementation

end.
