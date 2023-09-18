{***********************************************************}
{                                                           }
{    unit EdoMexCoahuila                                    }
{    Calcula el ISR conforme las leyes de Durango, Mexico  }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit EdoMexDurango;

interface
uses InEdoMex, System.Math;
  type
  /// <summary>
  ///   Clase que calcula el ISR conforme las leyes de Durango, Mexico
  /// </summary>
  TEdoMexDurango = class(TInterfacedObject, IEdoMex)
    /// <summary>
    ///   Calcula el ISR aplicando la logica de Durango
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

function TEdoMexDurango.CalcularIsr(AnAmmount: Double): Double;
begin
  // Formula para calcular ISR en Durango
  Result := Round(10 + AnAmmount * 0.15);
end;
end.
