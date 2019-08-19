package unit2activity1;

import java.util.Scanner; //Scanner for keyboard input
/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Divide & Mode
 * Purpose: Intro to NetBeans, Use Modulus & Integer Division, Print Results
 */
public class DivideAndMode {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Scanner input for user input
        
        int intInput1, intInput2;
        //Declare variable for integre inputs, output for integer division & modulus division
        
        System.out.print("Enter an integer: ");
        intInput1 = input.nextInt();
        //Ask for user input and assign first integer to variable
        
        System.out.print("Enter a second integer: ");
        intInput2 = input.nextInt();
        //Ask for user input and assign second integer to variable
        
        System.out.println("\n"+intInput1+" / "+intInput2+" = " + intInput1/intInput2); 
        //Print Integer division of input1 / input2
        System.out.println(intInput1+" % "+intInput2+" = " + intInput1%intInput2); 
        //Print Modulus division of input 1 % input2
        
        System.out.println("\n"+intInput2+" / "+intInput1+" = " + intInput2/intInput1);
        //Pring Integer division of input2 / input1
        System.out.println(intInput2+" % "+intInput1+" = " + intInput2%intInput1); 
        //Print Modulus division of input2 % input1
        
    }
    
}
