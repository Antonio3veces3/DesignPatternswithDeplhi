unit CommandFrm;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants,
  System.Generics.Collections, System.Classes, Vcl.Graphics, Vcl.Controls,
  Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, StrUtils, Invoker, Receiver, Command,
  SaludarCommand, FechaYHoraCommand, FrmRojaCommand, FrmNegraCommand,
  IntReceiver, TerminarCommand;

type
  TForm1 = class(TForm)
    lstbxCommands: TListBox;
    btnCommand: TButton;
    StaticText1: TStaticText;
    StaticText2: TStaticText;
    StaticText3: TStaticText;
    procedure btnCommandDragOver(Sender, Source: TObject; X, Y: Integer;
      State: TDragState; var Accept: Boolean);
    procedure btnCommandDragDrop(Sender, Source: TObject; X, Y: Integer);
    procedure FormCreate(Sender: TObject);
    procedure FormDestroy(Sender: TObject);
    procedure btnCommandClick(Sender: TObject);
  private
    FInvoker : TInvoker;
    FReceiver : IReceiver;
  public

  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}


procedure TForm1.btnCommandClick(Sender: TObject);
begin
  FInvoker.Execute(btnCommand.Caption);
end;

procedure TForm1.btnCommandDragDrop(Sender, Source: TObject; X, Y: Integer);
begin
  btnCommand.Caption := lstbxCommands.Items[lstbxCommands.ItemIndex];
end;

procedure TForm1.btnCommandDragOver(Sender, Source: TObject; X, Y: Integer;
  State: TDragState; var Accept: Boolean);
begin
  Accept := true;
end;


procedure TForm1.FormCreate(Sender: TObject);
begin
  FInvoker := TInvoker.Create;
  FReceiver := TReceiver.Create(Form1);
  FInvoker.SetCommand(TSaludarCommand.Create(FReceiver));
  FInvoker.SetCommand(TFechaYHoraCommand.Create(FReceiver));
  FInvoker.SetCommand(TFrmNegraCommand.Create(FReceiver));
  FInvoker.SetCommand(TFrmRojaCommand.Create(FReceiver));
  FInvoker.SetCommand(TTerminarCommand.Create(FReceiver));
  FInvoker.FillListBox(lstbxCommands);
end;

procedure TForm1.FormDestroy(Sender: TObject);
begin
  FreeAndNil(FInvoker);
  FReceiver := nil;
end;
end.
