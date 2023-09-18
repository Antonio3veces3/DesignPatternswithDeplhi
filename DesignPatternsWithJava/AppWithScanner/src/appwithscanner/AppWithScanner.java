/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appwithscanner;

import java.util.Scanner;

/**
 *
 * @author aanto
 */
public class AppWithScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to App with Scaner");
        System.out.println("---------------");
        System.out.println("Type your general information");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Year of birth: ");
        int year = scanner.nextInt();
        System.out.print("Married: ");
        boolean married = scanner.nextBoolean();
        System.out.println("Height (meters): ");
        double height = scanner.nextDouble();
        
        System.out.println("Welcome ["+name+"]");
        System.out.println("Year of birht   -------------- "+year);
        System.out.println("Is married?     -------------- "+married);
        System.out.println("Height (meters) -------------- "+height);
    }
    
}
