
/**
 * Calculates a weekly payment based on wage, hours, and overtime hours.
 *
 * Hunter Stewart
 * 1.0
 */

import java.util.Scanner;

public class Pay
{
   public static void main(String [] args){
       //Variable Initialization
       double rWage;
       double oWage;
       double rHours;
       double oHours;
       double rPay;
       double oPay;
       double wPay;
       
       //Object Initialization
       Scanner scanboi = new Scanner(System.in);
       
       //Input
       System.out.print("Hourly Wage: ");
       rWage = scanboi.nextDouble();
       System.out.print("Regular Hours: ");
       rHours = scanboi.nextDouble();
       System.out.print("Overtime Hours: ");
       oHours = scanboi.nextDouble();
       
       //Calculation
       oWage = rWage * 1.5;
       oPay = oWage * oHours;
       rPay = rWage * rHours;
       wPay = oPay + rPay;
       
       //Output
       System.out.print("Congratulations! You've earned $" + wPay + "!");
       
       
       
    }
}
