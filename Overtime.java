
/**
 * Calculates a weekly payment along with daily payments based on wage, hours, and overtime hours.
 *
 * Hunter Stewart
 * 2.0
 */

import java.util.Scanner;

public class Overtime
{
   public static void main(String [] args){
       //Variable Initialization
       double rWage;
       double oWage;
       double rHours1;
       double oHours1;
       double rHours2;
       double oHours2;
       double rHours3;
       double oHours3;
       double rHours4;
       double oHours4;
       double rHours5;
       double oHours5;
       double rPay1;
       double oPay1;
       double dPay1;
       double rPay2;
       double oPay2;
       double dPay2;
       double rPay3;
       double oPay3;
       double dPay3;
       double rPay4;
       double oPay4;
       double dPay4;
       double rPay5;
       double oPay5;
       double dPay5;
       double tPay;
       
       //Object Initialization
       Scanner scanboi = new Scanner(System.in);
       
       //Input
       System.out.print("Hourly Wage: ");
       rWage = scanboi.nextDouble();
       System.out.print("Regular Hours of Day 1: ");
       rHours1 = scanboi.nextDouble();
       System.out.print("Overtime Hours of Day 1: ");
       oHours1 = scanboi.nextDouble();
       System.out.print("Regular Hours of Day 2: ");
       rHours2 = scanboi.nextDouble();
       System.out.print("Overtime Hours of Day 2: ");
       oHours2 = scanboi.nextDouble();
       System.out.print("Regular Hours of Day 3: ");
       rHours3 = scanboi.nextDouble();
       System.out.print("Overtime Hours of Day 3: ");
       oHours3 = scanboi.nextDouble();
       System.out.print("Regular Hours of Day 4: ");
       rHours4 = scanboi.nextDouble();
       System.out.print("Overtime Hours of Day 4: ");
       oHours4 = scanboi.nextDouble();
       System.out.print("Regular Hours of Day 5: ");
       rHours5 = scanboi.nextDouble();
       System.out.print("Overtime Hours of Day 5: ");
       oHours5 = scanboi.nextDouble();
       
       //Calculation
       oWage = rWage * 1.5;
       oPay1 = oWage * oHours1;
       rPay1 = rWage * rHours1;
       dPay1 = oPay1 + rPay1;
       oPay2 = oWage * oHours2;
       rPay2 = rWage * rHours2;
       dPay2 = oPay2 + rPay2;
       oPay3 = oWage * oHours3;
       rPay3 = rWage * rHours3;
       dPay3 = oPay3 + rPay3;
       oPay4 = oWage * oHours4;
       rPay4 = rWage * rHours4;
       dPay4 = oPay4 + rPay4;
       oPay5 = oWage * oHours5;
       rPay5 = rWage * rHours5;
       dPay5 = oPay5 + rPay5;
       tPay = dPay1 + dPay2 + dPay3 + dPay4 + dPay5;
       
       //Output
       System.out.println("On day one, you earned $" + dPay1 + ".");
       System.out.println("On day two, you earned $" + dPay2 + ".");
       System.out.println("On day three, you earned $" + dPay3 + ".");
       System.out.println("On day four, you earned $" + dPay4 + ".");
       System.out.println("On day five, you earned $" + dPay5 + ".");
       System.out.println("You've earned $" + tPay + " in total!");
    }
}