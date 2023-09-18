/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositeexample;

import java.util.Iterator;

/**
 *
 * @author aanto
 */
public abstract class MenuComponent {
    // Composite methods
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    
    // Menu item methods (operation methods)
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }
    
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
    
    public void resetIterator(){
        throw new UnsupportedOperationException();
    }
}
