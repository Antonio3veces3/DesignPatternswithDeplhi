{***********************************************************}
{                                                           }
{    unit Subject                                           }
{    Contiene la interface del Subject utilizado en el      }
{    patron Observer                                        }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit Subject;

interface
uses Observer;
type
  /// <summary>
  ///   Sirve para enviar notificaciones a otros objetos cuando este Subject
  ///   a cambiado de estado.
  /// </summary>
  ISubject= interface['{72F93F1A-006C-4796-86B6-40162E538638}']
    /// <summary>
    ///   Sirve para agregar observadores a la lista de este Subject
    ///   para que puedan ser notificados de los cambios de estado.
    /// </summary>
    /// <param name="AnObserver">
    ///   Se refiere al observador que se subscribe a este Subject
    /// </param>
    procedure Subscribe(AnObserver: IObserver);
    /// <summary>
    ///   Sirve para eliminar observadores a la lista de este Subject.
    ///   Cuando se eliminan, esos objetos ya no reciben notificaciones de
    ///   este Subject.
    /// </summary>
    /// <param name="AnObserver">
    ///   Se refiere al observador que quiere desubscribirse de este Subject
    /// </param>
    procedure UnSubscribe(AnObserver: IObserver);
    /// <summary>
    ///   El subject notifica a todos los observadores que tiene suscritos que
    ///   a cambiado de estado.
    /// </summary>
    procedure Notify();
  end;

implementation

end.
