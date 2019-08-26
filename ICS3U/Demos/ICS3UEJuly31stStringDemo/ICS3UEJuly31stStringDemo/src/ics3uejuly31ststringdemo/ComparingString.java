/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3uejuly31ststringdemo;
import java.util.Scanner;
/**
 *
 * @author nanth
 */
public class ComparingString {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String str1 = "Apple";
        String str2 = "Boy";
        String str3 = "Cat";
        String str4 = "Apple";
        char x1 = 'a';
        char x2 = 'b';
        char x3 = 'a';
        //Comparing two Characters
        if(x1 == x3){
            System.out.println(x1 + " is the same as "+ x3);
        }
        if(x1 != x2){
            System.out.println(x1 +" is not the same as "+ x2);
        }
        //Accessing the chars in a string to compare
        if(str1.charAt(0) == str4.charAt(0)){
            System.out.println(str1 + " and "+ str4 + " begin with the same letter");
        }
        
        //Comparing String using equal method
        if(str1.equals(str4)){
            System.out.println(str1 + " is the same as "+ str4);
        }
        if(!str1.equals(str2)){
            System.out.println(str1 + " is not the same as "+ str2);
        }
        //Comparing String using CompareTo
        if(str1.compareTo(str4) == 0){
            System.out.println(str1 + " is the same as "+ str4);
        }
         if(str1.compareTo(str2) < 0){
            System.out.println(str1 + " comes first in the alpha order than "+ str2);
        }
         if(str2.compareTo(str1) > 0){
            System.out.println(str2 + " comes later in the alpha order than "+ str1);
        }
         
         //How to access the ascii value
         char x4 = 'a';
         System.out.println((int)(x4));
         System.out.println((char)(65 + 4));
         String strFun = "java";
         for(int i = 0; i < strFun.length(); i++){
              System.out.println(strFun.charAt(i) +"\t"+(int)(strFun.charAt(i)));
         }
         //toUpper and toLower will only works in a String!
         System.out.println(str1.substring(0, 1).toUpperCase());
         int x = 24;
         String strBinary = "";
         while(x > 0){
             strBinary = strBinary + (x % 2);
             x = x/ 2;
         }
         System.out.println(strBinary);
    }
}
