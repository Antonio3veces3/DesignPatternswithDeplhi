/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import commands.ICommand;

/**
 *
 * @author aanto
 */
public class NoCommand implements ICommand{
    public void Execute(){}

    @Override
    public void Undo() {}
}
