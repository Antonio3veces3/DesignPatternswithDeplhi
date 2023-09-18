/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package States;

import stateexample.GumballMachine;

/**
 * Concrete State
 * @author aanto
 */
public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there´s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("Tou need to pay fisrt");
    }
    
}
