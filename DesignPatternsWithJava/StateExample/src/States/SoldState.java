/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package States;

import stateexample.GumballMachine;

/**
 * Is the Concrete State
 *
 * @author aanto
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we´re already givin you gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning don't give you more gumballs");
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if(this.gumballMachine.getCount() > 0){
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Opps, out of gumballs");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }

}
