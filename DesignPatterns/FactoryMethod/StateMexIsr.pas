{***********************************************************}
{                                                           }
{    unit IsrDur                                            }
{    Calculates the ISR according to the                    }
{    laws in Durango, Mexico                                }
{                                                           }
{    Copyright (c) 1986,2023 Microsip                       }
{                                                           }
{***********************************************************}
unit StateMexIsr;

interface
uses Vcl.Dialogs, InEdoMex, CreatorEdoMexIsr;
type
  TStateMexIsr = class(TObject)

  private
    FEdoMexStr : String;
    FCreator : TEdoMexIsrCreator;
    procedure SetEdoMex(ANombreEdoMex: String);
    procedure SetCreator(ACreator: TEdoMexIsrCreator);
  public
    property edoMex : String read FEdoMexStr write SetEdoMex;
    property creator : TEdoMexIsrCreator read FCreator write SetCreator;
    function CalcularEdoMexIsr(AnAmmount: Double): Double;
  end;

implementation

procedure TStateMexIsr.SetCreator(ACreator: TEdoMexIsrCreator);
begin
  FCreator := ACreator;
end;

procedure TStateMexIsr.SetEdoMex(ANombreEdoMex: String);
begin
  FEdoMexStr := ANombreEdoMex;
end;

function TStateMexIsr.CalcularEdoMexIsr(AnAmmount: Double): Double;
begin
  Result := FCreator.CalcularIsr(AnAmmount, FEdoMexStr);
end;
end.
