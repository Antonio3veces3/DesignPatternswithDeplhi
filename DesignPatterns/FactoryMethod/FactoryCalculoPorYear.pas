{***********************************************************}
{                                                           }
{    unit FactoryCalculoPorYear                             }
{    Cotiene la logica para crear las fabricas que calculan }
{    el ISR de un a�o en especifico                         }
{                                                           }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit FactoryCalculoPorYear;

interface
uses System.SysUtils, StrUtils, CreatorEdoMexIsr ,EdoMexIsr2021, EdoMexIsr2022, EdoMexIsr2023;
type
  /// <summary>
  ///   Clase encargada de crear las fabricas calculadoras de ISR
  ///   conforme a un a�o especifico.
  /// </summary>
  TCalculoPorYearFactory = class(TObject)
    public
      /// <summary>
      ///   Se encarga de crear las fabricas que calculan ISR de a�os
      ///   especificos
      /// </summary>
      /// <param name="AYear">
      ///   Nombre del a�o, ejemplo "2023"
      /// </param>
      /// <returns>
      ///   Regresa la fabrica encargada de calcular ISR en el a�o dado.
      /// </returns>
      function CrearCalculoPorYear(AYear: String): TEdoMexIsrCreator;
  end;

implementation

function TCalculoPorYearFactory.CrearCalculoPorYear(AYear: string): TEdoMexIsrCreator;
begin
    // Por el momento solo se tienen 3 a�os para calcular ISR: 2021, 2022 y 2023.
    // Segun el a�o que se reciba es la fabrica que se crea.
    case AnsiIndexStr(AYear, ['2021', '2022', '2023']) of
        0:
          begin
            Result := TEdoMexIsr2021.Create;
          end;
        1:
          begin
            Result := TEdoMexIsr2022.Create;
          end;
        2:
          begin
            Result := TEdoMexIsr2023.Create;
          end;
    end;

end;
end.
