unit AdapterSumDouble;

interface
uses SumInteger, CalcSumDouble;

type
  TAdapterSumDouble = class(TInterfacedObject, ISumInt)
    private
      FSumDouble : TCalcSumDouble;
    public
      constructor Create(ASumDouble: TCalcSumDouble);
      function Add(ANumA: integer; ANumB: integer): integer;
  end;

implementation

constructor TAdapterSumDouble.Create(ASumDouble: TCalcSumDouble);
begin
  FSumDouble :=  ASumDouble;
end;

function TAdapterSumDouble.Add(ANumA: Integer; ANumB: Integer): Integer;
begin
  Result := Round(FSumDouble.Add(ANumA, ANumB));
end;

end.
