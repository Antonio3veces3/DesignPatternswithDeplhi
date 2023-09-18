/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandwebstore;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Invoker, it takes de command from the client.
 * This is the setCommand()
 * @author aanto
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    private Order cancelOrder;
    
    public void takeOrder(Order newOrder){
        this.orderList.add(newOrder);
        this.cancelOrder = newOrder;
    }
    
    public void placeOrders(){
        for(Order order : orderList){
            order.Execute();
        }
        orderList.clear();
    }
    
    public void cancelOrder(){
        cancelOrder.Cancel();
    }
}
