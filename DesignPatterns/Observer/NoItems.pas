{***********************************************************}
{                                                           }
{    unit NoItems                                           }
{    Control que muestra cuantos numeros a agregado el user }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit NoItems;

interface
uses Observer, Subject, Vcl.StdCtrls, System.SysUtils,Vcl.Dialogs;

type
  /// <summary>
  ///   Clase que se encarga de llevar el conteo de los numeros que ha agregado
  ///   el usuario.
  /// </summary>
  TNoItems= class(TInterfacedObject, IObserver)
  private
    // Contador de numero agregados
    FCount : Integer;
    // Referencia al Observable que es de tipo ISubject.
    FSubject : ISubject;
    // Referencia al control visual para mostrar contador.
    FControl : TStaticText;
  public
    /// <summary>
    ///  Inicializa la clase y crea las referencias al Subject y a su control
    ///  visual.
    /// </summary>
    /// <param name="ASubject">
    ///   Clase Observable a la que se suscribe TNoItems para recibir
    ///   notificaciones.
    /// </param>
    /// <param name="AControl">
    ///   Componente visual para mostrar el contador de numeros agregados.
    /// </param>
    constructor Create(ASubject: ISubject; AControl: TStaticText);
    /// <summary>
    ///  Actualiza el contador de numeros agregados.
    /// </summary>
    /// <param name="ASubject">
    ///   Nuevo numero agregado por el usuario.
    /// </param>
    procedure Update(ANewNumber: Integer);
    /// <summary>
    ///   Muestra en el componente visual el contador.
    /// </summary>
    procedure Display;
  end;

implementation
constructor TNoItems.Create(ASubject: ISubject; AControl: TStaticText);
begin
  inherited Create;
  FSubject := ASubject;
  FControl := AControl;
  FCount := 0;
  FSubject.Subscribe(Self);     //Se suscribe al Subject recibido.
end;

procedure TNoItems.Update(ANewNumber: Integer);
begin
    // El -1 es el indicador para resetear el control.
    if(ANewNumber = -1) then
     FCount := 0
    else
     FCount := FCount + 1;


   Display();
end;

procedure TNoItems.Display;
begin
    // Muestra en el control visual el contador.
    FControl.Caption := IntToStr(FCount);
end;

end.
