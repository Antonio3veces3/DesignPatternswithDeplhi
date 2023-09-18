{***********************************************************}
{                                                           }
{    unit InEdoMex                                          }
{    Es una interfaz que encapsula la forma de calcular     }
{    el ISR en los diferentes estados de Mexico             }
{    Es la abstraccion de Producto del patron Factory       }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit InEdoMex;

interface
  type
    /// <summary>
    ///   Interfaz que encapsula la forma de calcular ISR
    /// </summary>
    IEdoMex = interface['{02451DF3-23A6-45C6-B41B-4DD09FA4DF47}']
      /// <summary>
      ///   Calcula rl total de ISR
      /// </summary>
      /// <param name="AnAmmount">
      ///   Importe gravable
      /// </param>
      /// <returns>
      ///   Regresa el total de ISR
      /// </returns>
      function CalcularIsr(AnAmmount: Double): Double;
    end;

implementation

end.
