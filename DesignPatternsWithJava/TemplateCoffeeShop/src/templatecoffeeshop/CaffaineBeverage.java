/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffeeshop;

/**
 *
 * @author aanto
 */
public abstract class CaffaineBeverage {
    public final void PrepareRecipe(){
        this.BoilWater();
        this.Brew();
        this.pourInCup();
        if( this.CustomerWantsCondiments() )
            this.AddCondiments();
        System.out.println("Beverage finished !!!");
    }
    
    abstract void Brew();
    abstract void AddCondiments();
    
    void BoilWater(){
        System.out.println("Boiling water ...");
    }
    
    void pourInCup(){
        System.out.println("Pouring into a cup");
    }
    
    Boolean CustomerWantsCondiments(){
        return true;
    }
}   
