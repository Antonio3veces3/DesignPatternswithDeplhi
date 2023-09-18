/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffeeshop;

/**
 *
 * @author aanto
 */
public class Tea extends CaffaineBeverage{
     @Override
    void Brew() {
        System.out.println("Steeping the teabag in the water...");
    }

    @Override
    void AddCondiments() {
        System.out.println("Adding lemon ...");
    }
    
    @Override
    Boolean CustomerWantsCondiments(){
        return false;
    }
}
