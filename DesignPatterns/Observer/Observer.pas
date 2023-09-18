{***********************************************************}
{                                                           }
{    unit Observer                                          }
{    Contiene la interface del Observer utilizado en el     }
{    patron Observer                                        }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit Observer;

interface

type
   /// <summary>
  ///   Sirve para recibir el nuevo estado del Subject y actualizarse a si mismo
  ///   con esa nueva informacion.
  /// </summary>
  IObserver= interface['{4AA8AE05-FE4D-46AF-85E9-A87A7E6B6653}']
    /// <summary>
    ///   Sirve para recibir el nuevo estado y actualizar el objeto que lo
    ///   recibe.
    /// </summary>
    ///  <param name="ANewNumber">
    ///    Se refiere a un nuevo numero entero que indica un cambio de estado.
    ///  </param>
    procedure Update(ANewNumber: Integer);
  end;
implementation

end.
