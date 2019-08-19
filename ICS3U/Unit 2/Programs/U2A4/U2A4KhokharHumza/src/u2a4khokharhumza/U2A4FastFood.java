package u2a4khokharhumza;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Humza Khokhar
 * Date: July 25
 * Program: Fast Food Cost Calculator
 * Purpose: Work with numeric operators and user inputs
 */
public class U2A4FastFood {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); //Declare scanner for input
        
        System.out.print("Enter the number of Burgers: "); //Ask user for number of burgers
        int intBurgers = input.nextInt(); //Assign value to variable
        
        System.out.print("Enter the number of Fries: "); //Ask user for number of fries
        int intFries = input.nextInt(); //Assign value to variable
        
        System.out.print("Enter the number of Soft Drinks: "); //Ask user for number of drinks
        int intDrinks = input.nextInt(); //Assign value to variable
        
        DecimalFormat cents = new DecimalFormat("###.00"); //Declare and define deciaml formatter to two decimal places for cents
        
        double dblTotal = (intBurgers * 2.49) + (intFries * 1.89) + (intDrinks * 0.99); //Calculate total cost before taxes and assign to variable
        System.out.println("Total before taxes: $"+dblTotal); //Print total cost before taxes
        
        double dblTax = dblTotal * 0.13; //Calculate tax and assign to variable
        System.out.println("Tax: $"+cents.format(dblTax)); //print total tax, formatted to cents
        
        double dblFinalTotal = dblTax + dblTotal; //Calculate total including taxes and assign to variable
        System.out.println("Final Total: $"+cents.format(dblFinalTotal)); //Print formatted to cents value of total cost with taxes
        
        System.out.print("Enter amount tendered: $"); //Promt for amount tenderd
        double dblTendered = input.nextDouble(); //assign value to variable
        
        double dblChange = dblTendered - Double.parseDouble(cents.format(dblFinalTotal));
        //Calculate change from tendered - final total including taxes
        
        System.out.println("Change: $"+cents.format(dblChange)); //Print out change formatted to cents
        
    }
    
}
