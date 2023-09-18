/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositeexample;

import Iterators.CompositeIterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aanto
 */
public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private Iterator iterator = null;
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return (MenuComponent) this.menuComponents.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Iterator createIterator() {
        //if(this.iterator == null)
        this.iterator = new CompositeIterator(this.menuComponents.iterator());
        return this.iterator;
    }

    @Override
    public void print() {
        System.out.print("\n " + this.getName());
        System.out.println(", " + this.getDescription());
        System.out.println("--------------------------------");

        // Para utilizar el Iterator propio del ArrayList , descomentar la linea siguiente.
        
        //IIteratorComposite iterator = this.createIterator();
        while (this.iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) this.iterator.next();
            menuComponent.print();
        }
    }
    
    @Override
    public void resetIterator(){
        this.iterator = null;
    }
}
