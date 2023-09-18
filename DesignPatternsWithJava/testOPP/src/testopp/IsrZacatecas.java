/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testopp;

import java.io.*;

/**
 *
 * @author aanto
 */
public class IsrZacatecas implements ICalculatorIsr{
    /*
    if(AnAmmount <= 1000) then
      Result:= 100
  else
      if(AnAmmount <=5000) then
          Result:= 200
      else
          Result:= 300;
    */
   public Double CalculateIsr(Double Ammount){
       if(Ammount <= 1000){
           return 100.0;
       }else{
           if(Ammount <= 5000){
               return 200.0;
           }else{
               return 300.0;
           }
       }
   }
   
}
