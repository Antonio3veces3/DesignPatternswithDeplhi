/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratorexample;

/**
 * App
 * @author aanto
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Menu lunchMenu = new LunchMenu();
        Waitress waitress = new Waitress(dinerMenu, lunchMenu);
        
        waitress.printMenu();
    }
}
