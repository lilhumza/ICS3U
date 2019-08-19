package u2_a3_ast2;

import java.util.Scanner; //Import for input scanner

/**
 * @author Humza Khokhar
 * Date: July 24, 2019
 * Title: Cosine Law
 * Purpose: Calculate the third side of a Triangle using cosine law
 */
public class U2_A3_AST2_CosineLaw {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in); //Declare keyboard input scanner
        
        System.out.print("Enter the length of the first side: "); //Ask for sideA as input
        double dblSideA = input.nextDouble(); //Assign value from input to variable
        
        System.out.print("\nEnter the length of the second side: "); //Ask for sideB as input
        double dblSideB = input.nextDouble(); //Assign value from input to variable
        
        System.out.print("\nEnter the angle in degrees: "); //Ask for angleC as input
        double dblAngleC = input.nextDouble(); //Assign value from input to variable
        
        
        double dblSideC = Math.pow((Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - (2*dblSideA*dblSideB) * Math.cos(Math.toRadians(dblAngleC))), 0.5);
        //Calculate the sideC using cosine law, Math class operators used for exponents, and degrees to radians conversion
        // (a^2+b^2 -2abcosC)^0.5
        
        System.out.println("\nThe length of side C is: "+dblSideC+" units.");
        //Print final statement of side length
        
    }
    
}
