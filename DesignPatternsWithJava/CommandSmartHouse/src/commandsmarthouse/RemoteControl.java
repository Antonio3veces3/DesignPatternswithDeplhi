/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandsmarthouse;

import commands.NoCommand;
import commands.ICommand;

/**
 * Invoker
 * Control with buttons to IoT devices
 * @author aanto
 */
public class RemoteControl {
    // OnCommands list
    private ICommand[] onCommands;
    // OffCommands list
    private ICommand[] offCommands;
    private ICommand undoCommand;
    
    // Constructor
    public RemoteControl(){
        // set size of the Array
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];
        // Empty command
        ICommand noCommand = new NoCommand();
        //  Fill array with empty commands to initialize
        for(var i = 0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    /**
     * Set concrete command - Request 
     * @param slot Slot of control
     * @param onCommand concrete command
     * @param offCommand concrete command
     */
    public void SetCommand(int slot, ICommand onCommand, ICommand offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
    
    /**
     * on press button ON
     * @param slot slot button number
     */
    public void onBtnPress(int slot){
        if(this.onCommands[slot] != null)
            this.onCommands[slot].Execute();
        
        this.undoCommand = this.onCommands[slot];
    }
    
    public void undoBtnPress(int slot){
        this.undoCommand.Undo();
    }
    /**
     * on press button OFF
     * @param slot slot button number
     */
    public void offBtnPress(int slot){
        if(this.offCommands[slot] != null)
            this.offCommands[slot].Execute();
        
        this.undoCommand = this.offCommands[slot];
    }
    
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuff.append("Slot ["+i+"] "+onCommands[i].getClass().getName()
                              + "   "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
    
}
