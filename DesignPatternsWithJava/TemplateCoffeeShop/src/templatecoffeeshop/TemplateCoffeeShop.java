/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatecoffeeshop;

/**
 *
 * @author aanto
 */
public class TemplateCoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to COFFEE - SHOP\n");
        
        System.out.println("I want a coffee!");
        CaffaineBeverage coffee = new Coffee();
        coffee.PrepareRecipe();
                
        System.out.println("\nI want a tea!");
        CaffaineBeverage tea = new Tea();
        tea.PrepareRecipe();
    }
    
}
