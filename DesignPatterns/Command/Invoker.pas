unit Invoker;

interface
uses Vcl.Forms, Vcl.Graphics, Vcl.Controls, Vcl.Dialogs, Vcl.StdCtrls,
     System.Generics.Collections, System.SysUtils, StrUtils, Command,
     SaludarCommand, FechaYHoraCommand, FrmRojaCommand, FrmNegraCommand,
     TerminarCommand, Receiver;
type
 TInvoker = class(TObject)
   private
    FListaComandos : TList<ICommand>;
    function GetListaComandos : TList<ICommand>;
   public
    constructor Create;
    property listaComandos : TList<ICommand> read GetListaComandos;
    procedure Execute(ANombreComando: String);
    procedure SetCommand(AComando: ICommand);
    procedure FreeComandos;
    procedure FillListBox(AListBox: TListBox);
 end;

implementation

constructor TInvoker.Create;
begin
  FListaComandos := TList<ICommand>.Create;
end;

procedure TInvoker.Execute(ANombreComando: String);
begin
  for var i := 0 to FListaComandos.Count - 1 do
    if FListaComandos[i].GetNombre = ANombreComando then
      FListaComandos[i].Execute;

end;

procedure TInvoker.SetCommand(AComando: ICommand);
begin
  FListaComandos.Add(AComando);
end;

procedure TInvoker.FreeComandos;
begin
  for var i := 0 to FListaComandos.Count - 1 do
    FListaComandos[i] := nil;
end;

procedure TInvoker.FillListBox(AListBox: TListBox);
begin
  for var i := 0 to FListaComandos.Count - 1 do
    AListBox.Items.Add(FListaComandos[i].GetNombre);
end;

function TInvoker.GetListaComandos: System.Generics.Collections.TList<ICommand>;
begin
  Result := FListaComandos;
end;
end.
