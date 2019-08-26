/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ueaugust7thdemo;
import java.util.Scanner;
/**
 *
 * @author nanth
 */
public class ICS3UEAugust7thDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /**
         * using only one for loop and only one print statement print the following pattern
         * 1 2 3 4 5
         * 2 4 6 8 10
         * 3 6 9 12 15
         * 4 8 12 16 20
         * 5 10 15 20 25
         */
        for(int i = 1; i <=5; i++){
            System.out.println(i*1 +"\t"+i*2+"\t"+i*3+"\t"+i*4+"\t"+i*5);
        }
        
        //Nested for loops
        for(int i = 1; i <=10; i++){
            for(int j = 1; j <=10; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }
        /**
         * Use a nested for loop print the following pattern
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5 
         */
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j +"\t");
            }
            System.out.println("");
        }
        
        String strName = "stephen";
        //create all the possible substring in strName
        for(int i = 0; i < strName.length(); i++){
            for(int j = i + 1; j < strName.length(); j++){
                System.out.println(strName.substring(i, j));
            }
        }
    }
    
}
