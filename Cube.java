
/**
 * Takes an input side length for a cube and calculates the surface area.
 *
 * Hunter Stewart
 * 1.0
 */

import java.util.Scanner;

public class Cube
{
    public static void main(String [] args){
        //Variables
        int cEdge;
        int cSA;
       
        //Object Initialization
        Scanner scanboi = new Scanner(System.in);
        
        //Input
        System.out.print("What is the length of the cube? ");
        cEdge = scanboi.nextInt();
        
        //Calculation
        cSA = (cEdge * cEdge) * 6;
        
        //Output
        System.out.println("The Surface Area is " + cSA);
    }
}
