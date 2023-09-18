/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Receivers;

/**
 * Receiver
 * @author aanto
 */
public class Light {
    String name;
    
    /**
     * 
     * @param name Name of the light 
     */
    public Light(String name){
        this.name = name;
    }
    
    public void On(){
        System.out.println("Light ["+this.name+" ] - ON");
    }
    
    public void Off(){
        System.out.println("Light ["+this.name+" ] - OFF");
    }
}
