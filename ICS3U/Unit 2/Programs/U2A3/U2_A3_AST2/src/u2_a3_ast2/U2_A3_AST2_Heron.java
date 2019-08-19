package u2_a3_ast2;

import java.util.Scanner; //Import for input scanner

/**
 * @author Humza Khokhar
 Date: July 24, 2019
 Title: Heron's Formula
 Purpose: Calculate the area of a triangle using Heron's Formula
 */
public class U2_A3_AST2_Heron {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); //Declare Keyboard input scsnner
        
        System.out.println("Heron's Formula Calculator\n****************************\n");
        
        System.out.print("Enter the length of the first side: "); //Ask for sideA as input
        double dblSideA = input.nextDouble(); //Assign value from input to variable
        
        System.out.print("\nEnter the length of the second side: "); //Ask for sideB as input
        double dblSideB = input.nextDouble(); //Assign value from input to variable
        
        System.out.print("\nEnter the length of the third side: "); //Ask for sideC as input
        double dblSideC = input.nextDouble(); //Assign value from input to variable
        
        double dblPerimeter = dblSideA + dblSideB + dblSideC; //Caculate perimeter and assign value to variable
        double dblVarS = dblPerimeter/2; //Declare variable for 's' from Heron's Fromula = 1/2 * perimeter
        
        double dblArea = Math.pow((dblVarS*(dblVarS-dblSideA)*(dblVarS-dblSideB)*(dblVarS-dblSideB)),0.5);
        //Calculate Area of Triangle using Heron's Formula
        
        System.out.println("\nThe area of the triangle is "+dblArea+" units^2");
        //Print out final area of triangle
        
    }
    
}
