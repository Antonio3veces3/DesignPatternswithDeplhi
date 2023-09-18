/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package States;

import java.util.Random;
import stateexample.GumballMachine;

/**
 * Concrete State
 *
 * @author aanto
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Return quarter...");
        // set state to NoQuarterState
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank...");
        // Go to SoldState
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && this.gumballMachine.getCount() > 1)
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        else
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
