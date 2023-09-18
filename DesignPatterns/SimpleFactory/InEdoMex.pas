{***********************************************************}
{                                                           }
{    unit InEdoMex                                          }
{    Is an interface to encapsulate the different ways to   }
{    calculate ISR in the Mexico states.                    }
{    This is the Product of pattern Simple Factary          }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit InEdoMex;

interface
  type
    /// <summary>
    ///   Interface to encapsulate the different ways to calculate ISR
    /// </summary>
    IEdoMex = interface['{02451DF3-23A6-45C6-B41B-4DD09FA4DF47}']
      /// <summary>
      ///   Calculate the ISR according to the laws of Mexico States
      /// </summary>
      /// <param name="AnAmmount">
      ///   Importe gravable
      /// </param>
      /// <returns>
      ///   Returns the total ISR
      /// </returns>
      function CalcularIsr(AnAmmount: Double): Double;
    end;

implementation

end.
