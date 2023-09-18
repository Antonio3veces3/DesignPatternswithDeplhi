/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

/**
 *
 * @author aanto
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean isVegetarian(){
        return this.vegetarian;
    }
}
