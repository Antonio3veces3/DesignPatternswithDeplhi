/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testopp;

import java.io.*;
import java.text.DecimalFormat;  


/**
 *
 * @author aanto
 */
public class IsrCoahuila implements ICalculatorIsr{
    private static final DecimalFormat df = new DecimalFormat("0.00");  
    public Double CalculateIsr(Double Ammount){
        // Result:= RoundTo((AnAmmount * 0.20),-2);
        return Double.valueOf(df.format(Ammount * 0.20));
    }
}
