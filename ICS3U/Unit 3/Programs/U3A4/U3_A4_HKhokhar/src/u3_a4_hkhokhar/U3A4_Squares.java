package u3_a4_hkhokhar;
import java.util.ArrayList;

/**
 * @author Humza Khokhar
 * Date: August 6
 * Program: Squares ArrayList
 * Purpose: Intro to Arrays and ArrayLists
 */
public class U3A4_Squares {

    public static void main(String[] args) {
       
        ArrayList <Integer> intArray = new ArrayList(); //Declare an inreger arrayList for the squared values
        
        System.out.println("Squares ArrayList\n**********************"); //Print out a welcome statement
       
        for (int i=0; i < 10; i++){ //For loop to run through 10 indexes
            
            intArray.add(i*i); //Add the square of each index to the arrayList
            System.out.println("Number: "+i+" Square: "+intArray.get(i)); //Print out index and the respective sqaure from the arrayList
        }
        
    }
    
}
