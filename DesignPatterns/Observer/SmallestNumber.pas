
{***********************************************************}
{                                                           }
{    unit SmallestNumber                                    }
{    Control que muestra el numero menor que ha agregado el }
{    usuario                                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit SmallestNumber;

interface
uses Subject, Observer, Vcl.StdCtrls, System.SysUtils,Vcl.Dialogs;

type
  /// <summary>
  ///   Clase que se encarga de almacenar el numero menor que ha ingresado el
  ///   usuario.
  /// </summary>
  TSmallestNum= class(TInterfacedObject, IObserver)
    private
      // Referencia al Observable que es de tipo ISubject.
      FSubject : ISubject;
      // Referencia al control visual para mostrar el total de la suma.
      FControl : TStaticText;
      // Numero menor agregado por el usuario.
      FSmallestNum : Integer;
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
    ///   Componente visual para mostrar el numero menor.
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
constructor TSmallestNum.Create(ASubject: ISubject; AControl: TStaticText);
begin
  inherited Create;
  FSubject := ASubject;
  FControl := AControl;
  FSmallestNum := High(Integer) - 1;   // Numero maximo de Integer
  FSubject.Subscribe(Self);     //Se suscribe al Subject recibido.
end;

procedure TSmallestNum.Update(ANewNumber: Integer);
begin
  // El -1 es el indicador para resetear el control.
  if ANewNumber = -1 then
    FSmallestNum := High(Integer) - 1
  else
      if ANewNumber < FSmallestNum then
        FSmallestNum := ANewNumber;
  Display();
end;

procedure TSmallestNum.Display;
begin
  if FSmallestNum = High(Integer) -1 then
    FControl.Caption := '0'
  else
    FControl.Caption := IntToStr(FSmallestNum);
end;
end.
