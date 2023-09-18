{***********************************************************}
{                                                           }
{    unit IsrDur                                            }
{    Calculates the ISR according to the                    }
{    laws in Durango, Mexico                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit MexState;

interface
uses ICalculatorIsr;
type
  /// <summary>
  ///   Represents the different states in Mexico.
  ///   Is the context on the design pattern strategy
  /// </summary>
  TStateMexIsr= class(TObject)

  private
    // Create reference to the Strategy
    // With this reference we can access to the different wayt to calculate ISR
    FIsrCalculator: IIsrCalculator;
    procedure SetState(AState: IIsrCalculator);
  public
    property MexState: IIsrCalculator write SetState;
    function Calculate(AnAmmount: Double): Double;
    /// <summary>
    ///   Update the state selected to calculate ISR according to the new State
    /// </summary>
    /// <param name="aState">
    ///   Is the new state selected.
    /// </param>

  end;

implementation
function TStateMexIsr.Calculate(AnAmmount: Double): Double;
  begin
    // Calls the method calculate through the interface.
   Result:= FIsrCalculator.Calculate(AnAmmount);
  end;

procedure TStateMexIsr.SetState(AState: IIsrCalculator);
  begin
    // update the state selected
    FIsrCalculator:= AState;
  end;
end.
