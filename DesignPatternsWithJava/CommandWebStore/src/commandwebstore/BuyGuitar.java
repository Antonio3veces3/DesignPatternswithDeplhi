/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandwebstore;

/**
 * This is the Concrete Command
 * @author aanto
 */
public class BuyGuitar implements Order{
    private Guitar guitar;
    
    public BuyGuitar(Guitar newGuitar){
        this.guitar = newGuitar;
    }
    
    @Override
    public void Execute(){
        this.guitar.Buy();  
    }

    @Override
    public void Cancel() {
        this.guitar.Cancel();
    }
}
