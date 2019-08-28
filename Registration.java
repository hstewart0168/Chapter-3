/**
 * Echos information for Registration back at User.
 *
 * Hunter Stewart
 * 1.0
 */

import java.util.Scanner;

public class Registration
{
    public static void main(String [] args){
        //Variables
        String fName;
        String lName;
        int year;
        String number;
        
        //Object Initialization
        Scanner scanboi = new Scanner(System.in);
        
        //Input
        System.out.print("Please enter your first name: ");
        fName = scanboi.nextLine();
        System.out.print("Last name: ");
        lName = scanboi.nextLine();
        System.out.print("Class year: ");
        year = scanboi.nextInt();
        scanboi.nextLine();
        System.out.print("Campus phone: ");
        number = scanboi.nextLine();
        
        //Output
        System.out.println("Last name: " + lName);
        System.out.println("First name: " + fName);
        System.out.println("Class year: " + year);
        System.out.println("Campus phone: " + number);
        System.out.println("Thank you for your cooperation!");
        
        //Calculation
        
        //Output
        
    }
}
