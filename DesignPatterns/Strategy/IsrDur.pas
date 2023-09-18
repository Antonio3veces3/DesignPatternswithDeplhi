{***********************************************************}
{                                                           }
{    unit IsrDur                                            }
{    Calculates the ISR according to the                    }
{    laws in Durango, Mexico                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit IsrDur;

interface
uses ICalculatorIsr, System.Math;
  type
  /// <summary>
  ///   Class to calculate the ISR according Durango laws.
  /// </summary>
  TIsrDur= class(TInterfacedObject, IIsrCalculator)
    function Calculate(AnAmmount: Double): Double;
  end;
implementation
  function TIsrDur.Calculate(AnAmmount: Double): Double;
  begin
    // Formula to calculate ISR
    Result:= Round(10+AnAmmount*0.15);
  end;
end.
