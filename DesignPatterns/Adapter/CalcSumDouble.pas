unit CalcSumDouble;

interface

type
  TCalcSumDouble = class(TObject)
    function Add(ANumA: Double; ANumB: Double): Double;
  end;

implementation

function TCalcSumDouble.Add(ANumA: Double; ANumB: Double): Double;
begin
  Result := ANumA + ANumB;
end;
end.
