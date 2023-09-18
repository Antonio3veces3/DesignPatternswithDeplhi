/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testopp;

/**
 *  
 * @author aanto
 */
public class CalculatorIsrApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double ammount = 1363.63;
       MexState mexState = new MexState();
       // ESTADO COAHUILA
       mexState.SetMexState(new IsrCoahuila());
       System.out.println(Double.toString(mexState.CalculateIsr(ammount)));  
       
       // ESTADO DURANGO
       mexState.SetMexState(new IsrDurango());
       System.out.println(Double.toString(mexState.CalculateIsr(ammount)));  
       
       // ESTADO ZACATECAS
       mexState.SetMexState(new IsrZacatecas());
       System.out.println(Double.toString(mexState.CalculateIsr(ammount)));  
       
    }
    
}
