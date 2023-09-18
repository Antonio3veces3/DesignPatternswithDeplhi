object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'ISR Calculator'
  ClientHeight = 242
  ClientWidth = 534
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -13
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  OnCreate = FormCreate
  OnDestroy = FormDestroy
  PixelsPerInch = 96
  TextHeight = 16
  object cmbxMexState: TComboBox
    Left = 96
    Top = 62
    Width = 145
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'Tahoma'
    Font.Style = []
    ParentFont = False
    TabOrder = 0
    TextHint = 'Selecciona un estado'
    OnChange = cmbxMexStateChange
    Items.Strings = (
      'Coahuila'
      'Durango'
      'Zacatecas')
  end
  object nmbxAmmount: TNumberBox
    Left = 320
    Top = 62
    Width = 121
    Height = 24
    DoubleBuffered = True
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'Tahoma'
    Font.Style = []
    Mode = nbmFloat
    ParentDoubleBuffered = False
    ParentFont = False
    TabOrder = 1
    OnExit = nmbxAmmountExit
  end
  object StaticText1: TStaticText
    Left = 96
    Top = 39
    Width = 47
    Height = 20
    Caption = 'Estado:'
    TabOrder = 2
  end
  object StaticText2: TStaticText
    Left = 320
    Top = 39
    Width = 107
    Height = 20
    Caption = 'Importe gravable:'
    TabOrder = 3
  end
  object GroupBox1: TGroupBox
    Left = 130
    Top = 128
    Width = 263
    Height = 97
    Caption = 'Total ISR'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'Tahoma'
    Font.Style = []
    ParentFont = False
    TabOrder = 4
  end
  object txtResult: TStaticText
    Left = 219
    Top = 161
    Width = 4
    Height = 4
    Alignment = taCenter
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -27
    Font.Name = 'Tahoma'
    Font.Style = []
    ParentFont = False
    TabOrder = 5
  end
end
