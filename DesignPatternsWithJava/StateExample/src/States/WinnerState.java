/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package States;

import States.State;
import stateexample.GumballMachine;

/**
 *
 * @author aanto
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving your gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you've already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning more, don't give you more gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Congratulation, you are a WINNER, you will get two gumballs");
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() == 0) {
            System.out.println("Opps, out of gumballs");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        } else {
            this.gumballMachine.releaseBall();
            if (this.gumballMachine.getCount() > 0) {
                this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Opps, out of gumballs");
                this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            }
        }
    }

}
