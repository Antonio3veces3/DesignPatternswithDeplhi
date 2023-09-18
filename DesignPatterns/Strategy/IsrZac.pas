{***********************************************************}
{                                                           }
{    unit IsrZac                                            }
{    Calculates the ISR according to the                    }
{    laws in Zacatecas, Mexico                              }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit IsrZac;

interface

uses ICalculatorIsr;
  type
  /// <summary>
  ///   Class to calculate the ISR according Zacatecas laws.
  /// </summary>
  TIsrZac= class(TInterfacedObject, IIsrCalculator)
    function Calculate(AnAmmount: Double): Double;
  end;

implementation
function TIsrZac.Calculate(AnAmmount: Double): Double;
begin
  // Conditions to calculate the ISR.
  if(AnAmmount <= 1000) then
      Result:= 100
  else
      if(AnAmmount <=5000) then
          Result:= 200
      else
          Result:= 300;
end;
end.

