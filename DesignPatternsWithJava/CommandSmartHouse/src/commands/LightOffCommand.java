/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import commands.ICommand;
import Receivers.Light;

/**
 * Concrete Command
 * @author aanto
 */
public class LightOffCommand implements ICommand{
    Light light;
    
    /**
     * 
     * @param light  Instance of a house light type Light
     */
    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void Execute() {
        this.light.Off();
    }    

    @Override
    public void Undo() {
        this.light.On();
    }
}
