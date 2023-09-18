/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffeeshop;

/**
 *
 * @author aanto
 */
public class Coffee extends CaffaineBeverage {

    @Override
    void Brew() {
        System.out.println("Dripping coffee trhough filter...");
    }

    @Override
    void AddCondiments() {
        System.out.println("Adding sugar and milk ...");
    }
}
