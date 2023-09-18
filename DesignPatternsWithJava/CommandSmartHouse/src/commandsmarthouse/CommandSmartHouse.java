/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandsmarthouse;

import commands.LightOnCommand;
import commands.StereoOnWithCDCommand;
import commands.NoCommand;
import commands.LightOffCommand;
import commands.ICommand;
import Receivers.Stereo;
import Receivers.Light;

/**
 * Client
 *
 * @author aanto
 */
public class CommandSmartHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Invoker
        //SimpleRemoteControl controlRemote = new SimpleRemoteControl();
        // Create Receiver
        //Light roomLight = new Light("Room Light");
        // Create Command
        //LightOnCommand lightOn = new LightOnCommand(roomLight);
        // Take order
        //controlRemote.SetCommand(lightOn);
        // Create Request
        //controlRemote.ButtonPress();

        RemoteControl remoteControl = new RemoteControl();
        // devices, receivers
        Light roomLight = new Light("Tony Room");
        Light kitchenLight = new Light("Kitchen");

        Stereo livingRoomStereo = new Stereo("Living room");
        Stereo roomStereo = new Stereo("Tony Room ");

        // Commands - orders.
        ICommand noCommand = new NoCommand();
        LightOnCommand roomLightOn = new LightOnCommand(roomLight);
        LightOffCommand roomLightOff = new LightOffCommand(roomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOnWithCDCommand liRoomStereoOnCD = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOnWithCDCommand roomStereoOnCD = new StereoOnWithCDCommand(roomStereo);

        remoteControl.SetCommand(0, roomLightOn, roomLightOff);
        remoteControl.SetCommand(1, kitchenLightOn, kitchenLightOff);

        remoteControl.SetCommand(2, liRoomStereoOnCD, noCommand);
        remoteControl.SetCommand(3, roomStereoOnCD, noCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onBtnPress(0);
        //remoteControl.offBtnPress(0);
        remoteControl.undoBtnPress(0);

        remoteControl.onBtnPress(1);
        //remoteControl.offBtnPress(1);
        remoteControl.undoBtnPress(1);

        remoteControl.onBtnPress(2);
        remoteControl.onBtnPress(3);

    }

}
