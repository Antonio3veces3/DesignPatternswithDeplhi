/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandsmarthouse;

import commands.ICommand;
import commands.ICommand;

/**
 * Invoker
 * @author aanto
 */
public class SimpleRemoteControl {
    ICommand slot;
    
    /**
     * 
     * @param command  Is a concreteCommand
     */
    public void SetCommand(ICommand command){
        this.slot = command;
    }
    
    public void ButtonPress(){
        this.slot.Execute();
    }
}
