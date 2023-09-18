{***********************************************************}
{                                                           }
{    unit IsrDur                                            }
{    Calculates the ISR according to the                    }
{    laws in Durango, Mexico                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit EdoMexDurango;

interface
uses InEdoMex, System.Math;
  type
  /// <summary>
  ///   Class to calculate the ISR according Durango laws.
  /// </summary>
  TEdoMexDurango = class(TInterfacedObject, IEdoMex)
    function CalcularIsr(AnAmmount: Double): Double;
  end;

implementation

function TEdoMexDurango.CalcularIsr(AnAmmount: Double): Double;
begin
  // Formula to calculate ISR
  Result := Round(10 + AnAmmount * 0.15);
end;
end.
