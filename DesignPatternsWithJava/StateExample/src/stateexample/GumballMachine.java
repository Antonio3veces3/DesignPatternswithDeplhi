/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stateexample;

import States.State;
import States.HasQuarterState;
import States.NoQuarterState;
import States.SoldOutState;
import States.SoldState;
import States.WinnerState;

/**
 * Gumball Machine is the context
 * @author aanto
 */
public class GumballMachine {
    //States variables
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;
    
    State state = soldOutState;
    public int count = 0;
    
    // state variable
    
    public GumballMachine(int gumballs){
        this.noQuarterState= new NoQuarterState(this);
        this.hasQuarterState= new HasQuarterState(this);
        this.soldOutState= new SoldOutState(this);
        this.soldState= new SoldState(this);
        this.winnerState= new WinnerState(this);
        this.count = gumballs;
        if(gumballs>0)
            this.state = noQuarterState;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void insertQuarter(){
        this.state.insertQuarter();
    }
    public void ejectQuarter(){
        this.state.ejectQuarter();
    }
    public void turnCrank(){
        this.state.turnCrank();
        this.state.dispense();
    }
    
    public int getCount(){
        return this.count;
    }
    
    public State getNoQuarterState(){
        return this.noQuarterState;
    }
    public State getHasQuarterState(){
        return this.hasQuarterState;
    }
    public State getSoldOutState(){
        return this.soldOutState;
    }
    public State getSoldState(){
        return this.soldState;
    }
    public State getWinnerState(){
        return this.winnerState;
    }
    
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(this.count != 0)
            this.count = this.count -1;
    }
}
