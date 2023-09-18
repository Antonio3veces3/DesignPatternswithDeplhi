/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stateexample;

/**
 *
 * @author aanto
 */
public class StateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Gumball Machine
        GumballMachine gumbalMachine = new GumballMachine(5);
        
        System.out.println("Current gumballs: [" + gumbalMachine.getCount() + "]");
        gumbalMachine.insertQuarter();
        gumbalMachine.ejectQuarter();
        
        System.out.println("Current gumballs: [" + gumbalMachine.getCount() + "]");
        System.out.println("\nTurn 1------------------------");
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        System.out.println("\nTurn 2------------------------");
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        System.out.println("\nTurn 3------------------------");
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        System.out.println("\nTurn 4------------------------");
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        System.out.println("\nTurn 5------------------------");
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        
        System.out.println("Current gumballs: [" + gumbalMachine.getCount() + "]");
    }
    
}
