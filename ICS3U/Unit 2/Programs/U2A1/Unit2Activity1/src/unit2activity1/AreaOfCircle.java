package unit2activity1;

import java.lang.Math.*; 
//Math Package Import, used to import PI constant
/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Area of a Circle
 * Purpose: Intro to NetBeans, Find Area of Circle and Print out Statement
 */
public class AreaOfCircle {
    
    public static void main(String[] args) {
   
        int intRadius; //declare a variable Radius
        double dblArea; // declare a variable Area
        
        intRadius = 15; //assign 15 cm as radius to variable
        dblArea = (intRadius * intRadius)* Math.PI; //calculate area of circle and assign to varoable
        
        System.out.println("The Area of a circle with a 15 cm radius is "+dblArea+" cm^2");
        //Print out final calculated area
        
    }
    
}
