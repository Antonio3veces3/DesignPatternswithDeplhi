/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

/**
 * Client
 * @author aanto
 */
public class Waitress {
    Menu dinerMenu;
    Menu lunchMenu;
    
    public Waitress(Menu dinerMenu, Menu lunchMenu){
        this.dinerMenu = dinerMenu;
        this.lunchMenu = lunchMenu;
    }
    
    public void printMenu(){
        Iterator dinerIterator = this.dinerMenu.createIterator();
        Iterator lunchIterator = this.lunchMenu.createIterator();
        System.out.println("MENU\n----\nDINNER\n");
        printMenu(dinerIterator);
        System.out.println("\nMENU\n----\nLUNCH\n");
        printMenu(lunchIterator);
    }
    
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
