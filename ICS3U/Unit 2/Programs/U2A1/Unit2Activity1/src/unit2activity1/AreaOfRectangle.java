package unit2activity1;

/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Area of a Rectangle
 * Purpose: Intro to NetBeans, Find Area of Rectangle and Print out Statement
 */
public class AreaOfRectangle {

    public static void main(String[] args) {
        
        double dblLength, dblWidth, dblArea;
        //declare Length, Width & Area variables
        
        dblLength = 5.7; //assign 5.7 cm as length to variable
        dblWidth = 4.8; //assign 4.8 cm  as width to variable
        dblArea = dblLength * dblWidth; 
        //calculate area: length * width assign to variable
        
        System.out.println("The area of the rectangle with length 5.7 cm & width 4.8 cm is "+dblArea+" cm^2");
        //Print out final area of rectangle
        
        
        
    }
    
}
