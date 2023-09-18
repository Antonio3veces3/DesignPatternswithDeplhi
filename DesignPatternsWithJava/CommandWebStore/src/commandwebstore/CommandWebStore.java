/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandwebstore;

/**
 * This is de client App
 * 
 * @author aanto
 */
public class CommandWebStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Here are the guitars
        Guitar acusticGuitar = new Guitar("Acustic Black",6);
        Guitar electricGuitar = new Guitar("Electric Brown", 9);
        Guitar classicGuitar = new Guitar("Classic Blue",3);
        
        // Here is the concrete command for each guitar
        // Buy concrete commands
        Order buyOrderAcustic = new BuyGuitar(acusticGuitar);
        Order buyOrderElectric = new BuyGuitar(electricGuitar);
        Order buyOrderClassic = new BuyGuitar(classicGuitar);
        
        // Sell concrete commands
        Order sellOrderAcustic = new SellGuitar(acusticGuitar);
        Order sellOrderElectric = new SellGuitar(electricGuitar);
        Order sellOrderClassic = new SellGuitar(classicGuitar);
        
        // Create new Broker to can do saling and shopping
        Broker broker = new Broker();
        
        // Here is the Broker taking orders to buys
        broker.takeOrder(buyOrderAcustic);
        broker.takeOrder(buyOrderElectric);
        broker.takeOrder(buyOrderClassic);
        broker.cancelOrder();
        
        // Sales
        broker.takeOrder(sellOrderAcustic);
        broker.cancelOrder();
        broker.takeOrder(sellOrderElectric);
        broker.takeOrder(sellOrderClassic);
        
        // Here we place the orders;
        broker.placeOrders();
    }
    
}
