/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ues19arraylistdemo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author nanth
 */
public class ICS3UES19ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Declaring an ArrayList to store Integers
        ArrayList<Integer> intList1 = new ArrayList<Integer>();
        //Declaring an ArrayList to store Double
        ArrayList<Double> dblList1 = new ArrayList<Double>();
        //Declaring an ArrayList to store String
        ArrayList<String> strList1 = new ArrayList<String>();
        //adding an element into an array list
        intList1.add(2);
        //we can visualize the contnet of the array list
        System.out.println(intList1);
        //int [] intArr1 = {1,2,3,4};
        // System.out.println(intArr1);
        intList1.add(5);
        System.out.println(intList1);
        //wehn you add a element that will go to the right side of the arraylist
        //Printing the number of elements
        System.out.println(intList1.size());
        //Checking whether the array list is empty
        System.out.println(intList1.isEmpty());
        //accesing the elements in a specified index
        System.out.println(intList1.get(0));
        //Using for loop to access all the elemeenst in the array list
        for(int i = 0; i < intList1.size(); i++){
            System.out.print(intList1.get(i)  +"\t");
        }
        System.out.println("");
        //adding an elements in a specified index
        intList1.add(0,-100);
        System.out.println(intList1);
        intList1.add(1,-100);
        System.out.println(intList1);
        //when we add an elemment in specified index the rest of the values will be
        // shifted to right
        //intList1.add(5,-100);
        //System.out.println(intList1);
        //you cannot skip an index to add a value
        //changing the value at a spcified index
        intList1.set(0,1000);
        System.out.println(intList1);
        //Finding the index of a specified elements
        System.out.println(intList1.indexOf(1000));
        System.out.println(intList1.indexOf(10000));
        //removing an elements at index i
        intList1.remove(0);
         System.out.println(intList1);
         //when you remove an item that rest of the element's index will be shifted
         //to the left
    }
    
}
