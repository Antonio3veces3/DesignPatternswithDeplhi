{***********************************************************}
{                                                           }
{    unit BiggestNumber                                     }
{    Control que muestra el numero mayor que ha agregado el }
{    usuario                                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit BiggestNumber;

interface
uses Subject, Observer, Vcl.StdCtrls, System.SysUtils,Vcl.Dialogs;

type
  /// <summary>
  ///   Clase que se encarga de almacenar el numero mayor que ha ingresado el
  ///   usuario.
  /// </summary>
  TBiggestNum= class(TInterfacedObject, IObserver)
    private
      // Referencia al Observable que es de tipo ISubject.
      FSubject : ISubject;
      // Referencia al control visual para mostrar el numero mayor.
      FControl : TStaticText;
      // Numero mayor agregado por el usuario.
      FBiggestNum : Integer;
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
    ///   Componente visual para mostrar el numero mayor.
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
constructor TBiggestNum.Create(ASubject: ISubject; AControl: TStaticText);
begin
  inherited Create;
  FSubject := ASubject;
  FControl := AControl;
  FBiggestNum := 0;
  FSubject.Subscribe(Self);     //Se suscribe al Subject recibido.
end;

procedure TBiggestNum.Update(ANewNumber: Integer);
begin
  // El -1 es el indicador para resetear el control.
  if ANewNumber = -1 then
    FBiggestNum := 0
  else
    // Si el nuevo numero es mayor al numero mayor actual, entonces el nuevo
    // numero se convierte en el numero mayor.
    if ANewNumber > FBiggestNum then
      FBiggestNum := ANewNumber;


  Display();
end;

procedure TBiggestNum.Display;
begin
  FControl.Caption := IntToStr(FBiggestNum);
end;
end.
