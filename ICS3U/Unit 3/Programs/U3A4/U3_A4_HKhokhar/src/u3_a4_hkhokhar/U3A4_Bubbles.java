package u3_a4_hkhokhar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Humza Khokhar
 * Date: August 6
 * Program: Bubbles Program
 * Purpose: Intro to Arrays, Bubble Sorting Algorithm and ArrayLists
 */
public class U3A4_Bubbles {
    
    public static void bubbleSort(int [] intArray){ //Bubble sort method to organize array elements in ascending order
        for(int i = 0; i < intArray.length; i++){ 
            //the i for loop will repeat the process
            for(int j = 0; j < intArray.length - 1; j++){ 
                //j for loop will compare the adjucant elements
                if(intArray[j] > intArray[j+1]){
                    //let sawp them
                    int intTemp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = intTemp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); //Declare a keyboard scanner called input
        
        int intArray[]; //Declare an integer array to store all user input
        int intCount; //Declare a variable to store the number of elements in the array
        int intSum = 0; //Declare a variable to store the sum of each element of the array
        
                
        System.out.println("Please enter the number of values you would like to enter: "); //Prompt user for number of elements
        intCount = input.nextInt(); //Assign value to variable for number of elements
        
        intArray = new int[intCount]; //Assign dimension to the array
        
        System.out.println(""); //Empty line for formatting
        
        for (int i = 0; i < intCount; i++){ //For loop to gather input for the array
            System.out.print("Please enter for index value of "+i+": "); //Prompt for value of each element
            intArray[i] = input.nextInt(); //Add user input to each element
            
            intSum += intArray[i]; //Calculate the sum and assign to variable
        }
        
        System.out.println("\nHere is the unsorted list:"); //Print unsorted array
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+", ");
        }
        
        bubbleSort(intArray); //Call to Bubble Sort to sort the array elements
        System.out.println("\n\nHere is the sorted list:"); //Print sorted array
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+", ");
        }
        
        System.out.println("\n\nGreatest number: "+ intArray[intArray.length - 1]); //Calculate and print greatst number
        
        System.out.println("\nSmallest number: "+ intArray[0]); //Calculate and print smallest number
        
        if (intArray.length % 2 == 0){
            System.out.println("\nMedian number: "+ ((double)intArray[intArray.length/2] + (double)intArray[intArray.length/2 - 1])/2);
        } else {
            System.out.println("\nMedian number: "+ (double)intArray[intArray.length/2]);
        }
        
        System.out.println("\nAverage: "+ (double)intSum / intArray.length); //Calculate and print average
        
        System.out.println("\nThanks for visiting!\nGoodbye!"); //End of program statement
        
    }
    
}
