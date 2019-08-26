/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ues19saugust1stdemo;
import java.util.Scanner;
/**
 *
 * @author nanth
 */
public class MethodDemo {
    
    public static void printAddress(){
        System.out.println("Justin Trudeau");
        System.out.println("20, Sussex Drive, Ottawa");
        System.out.println("Ontario, Canada");
        System.out.println("");
    }
    /**
     * 
     * @param strF is the First Name 
     * @param strL is the Last Name
     * @param strA1 is the Address 1
     * @param strA2 is the Address 1
     * Post Condition: Print the Person address 
     * This is called writing Java Doc for Method
     */
    public static void printAddress(String strF, String strL, String strA1, String strA2){
        System.out.println(strF + " "+ strL);
        System.out.println(strA1);
        System.out.println(strA2);
    }
    
    //Method that return values
    /**
     * 
     * @param intA is an Integer
     * @param intB is an Integer
     * @return the sum of intA and intB
     */
    public static int intSum(int intA, int intB){
       return intA + intB;
    }
    /**
     * 
     * @param intN is a Positive integer > 0
     * @return the sum of the first N positive integers
     * 
     */
    public static int intNsum(int intN){
        int intTotal = 0;
        for(int i = 1; i <= intN; i++){
            intTotal += i;
        }
        return intTotal;
    }
    
    //Method that returns a boolean
    /**
     * 
     * @param intA is an Integer 
     * @param intB is an Integer > 0
     * @return true if intA divides intB evenly
     */
    public static boolean isDivide(int intA, int intB){
       return intA % intB == 0;
    }
    
    //Method returning a String
    /**
     * 
     * @param str is a String Variable
     * @return the reverse version of the string
     */
    public static String myReverse(String str){
        String strTemp = "";
        for(int i = str.length() - 1; i >=0; i--){
            strTemp = strTemp + str.charAt(i);
        }
        return strTemp;
    }
    /**
     * 
     * @param str is a String
     * @return true if str is a Palindrome
     * else return false
     */
    public static boolean isPalindrome(String str){
       return str.equals(myReverse(str));
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Calling the void method in your main program
        printAddress();
        //calling a method what parameters
        printAddress("John", "Smith", "Oval White House", "Washington DC");
        //Let read the information from the user and them into the methdo
        //String strFirst = input.next();
        //String strLast = input.next();
        //String strAddress1 = input.next();
        //String strAddress2 = input.next();
        //printAddress(strFirst, strLast, strAddress1, strAddress2);
        //Calling the method that returns values
        System.out.println(intSum(10,14));
        //we can assign the return value into a variables
        int intD = intSum(10,23);
        System.out.println(intD);
        if(intNsum(100) == 5050){
            System.out.println("intSum Test1 pass");
        }
        System.out.println(isDivide(10,5));
        if(isDivide(10,5)){
            System.out.println("isDivide test pass");
        }
        System.out.println(myReverse("elephant"));
        if(myReverse("elephant").equals("tnahpele")){
            System.out.println("reverse test 1 pass");
        }
        //radar, kayak, mon, noon
        System.out.println(isPalindrome("radar"));
    }
}
