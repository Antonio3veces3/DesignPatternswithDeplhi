/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testopp;

/**
 *
 * @author aanto
 */
public class MexState {
    private ICalculatorIsr mexState;
    
    public void SetMexState(ICalculatorIsr newMexState){
        this.mexState = newMexState;
    }
    
    public Double CalculateIsr(Double Ammount){
        return this.mexState.CalculateIsr(Ammount);
    }
    
}
