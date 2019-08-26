/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ueaug7thtwodimarraydemo;
import java.util.Scanner;
/**
 *
 * @author nanth
 */
public class ICS3UEAug7thTwoDimarrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Declaring a Two Dim Array
        int [][] intArr1 = new int[3][3];
        //row col
        int [][] intArr2 = new int[4][5];
        //The length of the wto dim array is always
        // the number of rows in the two dim array
        System.out.println(intArr1.length);
        System.out.println(intArr2.length);
        //initlizing a two dim array
        intArr1[0][0] = 1;
        intArr1[0][2] = 3;
        //Printing the values stored in the two dim array
        System.out.println(intArr1[0][0]);
        //Printing all the values in the two dim array
        for(int i = 0; i < intArr1.length; i++){
            for(int j = 0; j < intArr1[i].length; j++){
                System.out.print(intArr1[i][j] +"\t");
            }
            System.out.println("");
        }
        
        //Using for loop to initilize the values in a two dim array
        for(int i = 0; i < intArr2.length; i++){
            for(int j = 0; j < intArr2[i].length; j++){
                intArr2[i][j] = input.nextInt();
            }
        }
        //Let print the contents in the intArr2
         for(int i = 0; i < intArr2.length; i++){
            for(int j = 0; j < intArr2[i].length; j++){
                System.out.print(intArr2[i][j] +"\t");
            }
            System.out.println("");
        }
        //when we know the content we can assign them as row by row
        int [][]intArr3 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
         for(int i = 0; i < intArr2.length; i++){
            for(int j = 0; j < intArr3[i].length; j++){
                System.out.print(intArr3[i][j] +"\t");
            }
            System.out.println("");
        }
        
    }
    
}
