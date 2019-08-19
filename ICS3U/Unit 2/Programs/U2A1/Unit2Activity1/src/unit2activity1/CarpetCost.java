package unit2activity1;

import java.lang.Math.*; 
//Math Package Import, used to import Math.round
/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Carpet Cost
 * Purpose: Intro to NetBeans, Find Cost Per Meter Square of Carpet and Print out Statement
 */
public class CarpetCost {

    public static void main(String[] args) {
        
        double dblLength, dblWidth, dblArea, dblCost, dblTotalCost;
        //Declare variables for length, width, area, cost per area, total cost;
        
        dblLength = 8.5; //assign 8.5 m as length to variable
        dblWidth = 6; //assign 6 m as width to variable
        dblArea = dblLength * dblWidth; //Calculate area = length * width & assign to variable
        dblCost = 19.95; //assign $19.95 cost per meter square of carpet to variable
        
        dblTotalCost = dblCost * dblArea; //Calculate total cost of carpet & assign to variable
        dblTotalCost = Math.round(dblTotalCost * 100.0) / 100.0; //Round Total Cpst to two decimal places for cents
        
        System.out.println("The cost of the carpet with length 8.5 m, width 6 m, area "+dblArea+
                " m^2, at a cost of $19.95 per m^2 is $"+dblTotalCost); //Print out total rounded cost
      
    }
    
}
