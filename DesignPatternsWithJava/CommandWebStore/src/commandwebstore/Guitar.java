/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandwebstore;

/**
 * This is the Receiver.
 * @author aanto
 */
public class Guitar {
    String name;
    int quantity;
    
    public Guitar(String name, int quantity){
       this.name = name;
       this.quantity = quantity;
    }
    
    public void Buy(){
        System.out.println("Guitar [ Name: "+this.name+", quantity: "+this.quantity+"] - BOUGHT");
    }
    
    public void Sell(){
        System.out.println("Guitar [ Name: "+this.name+", quantity: "+this.quantity+"] - SOLD");
    }
    
    public void Cancel(){
        System.out.println("Guitar [ Name: "+this.name+", quantity: "+this.quantity+"] - CANCELED");
    }
}
