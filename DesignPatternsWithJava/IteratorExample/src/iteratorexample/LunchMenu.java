/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

import java.util.ArrayList;

/**
 *
 * @author aanto
 */
public class LunchMenu implements Menu{
    ArrayList<MenuItem> menuItems;
    
    public LunchMenu(){
        this.menuItems = new ArrayList<MenuItem>();
        
        addItem("Chocomilk", "Bien frio", false , 1.10);
        addItem("Sandiwch", "Panela y verdura", true , 12);
        addItem("Chilaquiles", "Con huevo y frijoles", false , 1.80);
    }
    
    public Iterator createIterator(){
        // Retornar LunchMenuIterator
        return new LunchMenuIterator(this.menuItems);
    }
    
    public void addItem(String name,
                    String description,
                    boolean vegetarian,
                    double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }
    
    public ArrayList getMenuItems(){
        return this.menuItems;
    }
}
