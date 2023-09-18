unit Receiver;

interface
uses Vcl.Forms, Vcl.Dialogs, System.SysUtils, Vcl.Graphics, IntReceiver;
type
  TReceiver = class(TInterfacedObject, IReceiver)
    private
    FForm : TForm;
    FFecha : TDateTime;
    public
      constructor Create(AForm : TForm);
      procedure Saludar;
      procedure VerFechaYHora;
      procedure SetFrmRoja;
      procedure SetFrmNegra;
      procedure Terminar;
  end;

implementation

constructor TReceiver.Create(AForm: TForm);
begin
  FForm := AForm;
end;

procedure TReceiver.Saludar;
begin
  ShowMessage('Hola!');
end;

procedure TReceiver.VerFechaYHora;
begin
  FFecha := Now;
  ShowMessage('Fecha: ' + DateToStr(FFecha)+ ' Hora: '+ TimeToStr(FFecha));
end;

procedure TReceiver.SetFrmRoja;
begin
  FForm.Color := clMaroon;
end;

procedure TReceiver.SetFrmNegra;
begin
  FForm.Color := clGray;
end;

procedure TReceiver.Terminar;
begin
  FForm.Close;
  FForm.Destroy;
end;
end.
