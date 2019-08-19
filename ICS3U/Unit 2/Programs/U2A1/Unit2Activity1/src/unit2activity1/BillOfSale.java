package unit2activity1;

import java.lang.Math.*; 
//Math Package Import, used to import Math.round

/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Bill of Sale
 * Purpose: Intro to NetBeans, Find Total Cost and Print out Bill of Sale
 */
public class BillOfSale {

    public static void main(String[] args) {
        
        double dblCost, dblTendered, dblTax, dblTotal, dblChange;
        //Declare variable for cost price, cash given, taxes, total with tax, and change
        
        dblCost = 12.49; //assign $12.49 as cost of shirt to variable
        dblTendered = 20; //assign $20 as cash tendered for purchase to variable
        dblTax = 0.13; //assign 13% tax as a decimal to variable
        
        dblTotal = (1+dblTax) * dblCost; //Caluculate Total cost including Tax
        dblTotal = Math.round((dblTotal) * 100.0) / 100.0; //Round total cost to two decimal places for cents
        
        dblChange = Math.round((dblTendered-dblTotal) * 100.0) / 100.0;
        //Amount Tendered - Total Cost to get change, rounded two two decimal places for cents assigned to variable dblChange
        
        System.out.println("\nBill of Sale:\nCost: $12.49\nAmount Tendered: $20\nTax: 13%\nTotal Cost: $"+dblTotal+"\nChange: $"+dblChange);
        //Print out final bill of sale
        
      
    }
    
}
