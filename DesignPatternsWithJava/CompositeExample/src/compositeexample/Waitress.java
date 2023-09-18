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
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }

    public void printMenuComposite() {
        Iterator iterator = this.allMenus.createIterator();
        System.out.println("ALL MENUS");
        System.out.println("--------------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    public void printVeggieMenu() {
        Iterator iterator = this.allMenus.createIterator();
        System.out.println("\nVEGGETARIAN MENU");
        System.out.println("--------------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }

}
