/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import commands.ICommand;
import Receivers.Stereo;

/**
 * Concrete Command
 * @author aanto
 */
public class StereoOnWithCDCommand implements ICommand {
    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void Execute() {
        this.stereo.On();
        this.stereo.SetCD();
        this.stereo.SetVolume(50);
    }

    @Override
    public void Undo() {}
}
