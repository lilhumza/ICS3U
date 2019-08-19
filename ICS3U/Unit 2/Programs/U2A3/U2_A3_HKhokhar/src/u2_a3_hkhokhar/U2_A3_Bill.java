package u2_a3_hkhokhar;

import java.text.DecimalFormat; //import decimal formatter

/**
 * @author Humza Khokhar
 * Date: July 24, 2019
 * Title: Bill Calculator
 * Purpose: Calculate the bill of an order at a restaurant
 */
public class U2_A3_Bill {

    public static void main(String[] args) {
        
        //Declare variables for cost, taxes and total
        double dblCost, dblTax, dblTotal;
        
        dblCost = 8.95; //Assign value of $8.95 to variable
        dblTax = 0.13 * dblCost; //Assign value of 13% tax * cost to variable
        dblTotal = dblCost + dblTax; //Assign calculated total cost to variable
        
        DecimalFormat cents = new DecimalFormat("###.##");
        
        System.out.println("Restaurant Bill\n********************\n");
        System.out.println("Meal: \t$"+dblCost); //Print out meal cost
        System.out.println("HST: \t$"+cents.format(dblTax)); //Print out total HST
        System.out.println("Total: \t$"+cents.format(dblTotal)); //Print out total cost with tax
      
    }
    
}
