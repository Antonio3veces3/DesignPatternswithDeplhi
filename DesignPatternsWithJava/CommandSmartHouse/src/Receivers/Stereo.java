/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Receivers;

/**
 * Receiver
 * @author aanto
 */
public class Stereo {
    String name;
    /**
     * 
     * @param name Stereo name
     */
    public Stereo(String name){
        this.name = name;
    }
    
    public void On(){
        System.out.println("Stereo ["+this.name+"] - ON");
    }
    
    public void Off(){
            System.out.println("Stereo ["+this.name+"] - OFF");
    }
    
    public void SetCD(){
        System.out.println("Stereo ["+this.name+"] - SET CD");
    }
    /**
     * 
     * @param volume Level of volumen 0 - 100
     */
    public void SetVolume(int volume){
        System.out.println("Stereo ["+this.name+"] - SET VOLUME to ["+volume+"]");
    }
}
