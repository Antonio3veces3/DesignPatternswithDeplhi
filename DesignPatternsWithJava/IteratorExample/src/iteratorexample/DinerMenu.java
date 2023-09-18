/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

import java.util.HashSet;
import java.util.Set;

/**
 * Concrete Aggregate
 * @author aanto
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu(){
        this.menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato", true , 3.23);
        addItem("Tacos", "Pastor, Adobada y Asada", false , 0.8);
        addItem("Gringa", "Adobada y asada", false , 1.20);
    }
    
    public Iterator createIterator(){
        return new DinerMenuIterator(this.menuItems);
    }
    
    public void addItem(String name,
                    String description,
                    boolean vegetarian,
                    double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is Full!!!");
        }else{
            this.menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems +  1;
        }
    }
    
    public MenuItem[] getMenuItems(){
        return this.menuItems;
    }
}
