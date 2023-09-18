/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package commands;

/**
 * Command interface
 * @author aanto
 */
public interface ICommand {
    public void Execute();
    public void Undo();
}
