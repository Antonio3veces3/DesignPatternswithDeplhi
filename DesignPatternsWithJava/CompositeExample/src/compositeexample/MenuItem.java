/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositeexample;

import Iterators.NullIterator;
import java.util.Iterator;

/**
 *
 * @author aanto
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price){
        this.name = name;
        this.description = description;
        this.vegetarian= vegetarian;
        this.price = price;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    
    @Override 
    public Iterator createIterator(){
        return new NullIterator();
    }
    
    @Override
    public void print(){
        System.out.print(" " + this.getName());
        if(this.isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(", "+this.getPrice());
        System.out.println("   -- " + this.getDescription());
    }
    
}
