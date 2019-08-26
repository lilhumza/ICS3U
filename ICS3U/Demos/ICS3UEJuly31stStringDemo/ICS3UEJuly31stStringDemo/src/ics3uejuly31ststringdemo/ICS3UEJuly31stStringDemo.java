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
public class ICS3UEJuly31stStringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Declaring Strings
        String str1 = "Stephen";
        String str2 = "Stephen Harper";
        String str3 = "123";
        String str4 = "a";
        String str5 = "1";
        String strEmail = "stephen.harper123@gov.ca";
        //Declaring a Character
        char x1 = 'a';
        char x2 = '1';
        //String Method
        //Counting the number letters in a string
        System.out.println(str2.length());
        //Accesing a character in a speciifed index
        System.out.println(str2.charAt(0));
        // How would I access the last letter in str2
        System.out.println(str2.charAt(13));
        String strPM = "Srimawo Ratwatte Banadaranayake";
        System.out.println(strPM.charAt(strPM.length()-1));
        /**
         * Write line(s) of code that will print
         * the reverse version of str2
         * Your output should be
         * repraH nehpetS
         */
        for(int i = str2.length()-1; i >=0; i--){
            System.out.print(str2.charAt(i));
        }
        System.out.println("");
        //Finding the index of a specified character
        //the indexOf always give the first occurance of the char specified
        System.out.println(str2.indexOf('S'));
        //when a character is not found then indexOf() will return -1
        System.out.println(str2.indexOf('Z'));
        //substring
        System.out.println(str2.substring(1, 2));
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(3));
        //toUpperCase and toLowerCase()
        String s1 = "apple";
        String s2 = "aPpLe";
        String s3 = "APPLE";
        //toUpperCase()
        System.out.println(s1.toUpperCase());
        //toUpperCase() won't change the content of the string
        //rather it gives us a new string
        System.out.println("s1 :" + s1);
        //toLoweCase()
        System.out.println(s3.toLowerCase());
        System.out.println("s3 "+ s3);
        //The only wway we can modify those string
        s1 = s1.toUpperCase();
        System.out.println("s1 "+ s1);
        
        //if you want to create a new string you must declare an empty
        //string first
        String strReverse = "";
        for(int i = str2.length()-1; i >=0; i--){
            strReverse = strReverse + str2.charAt(i);
        }
        System.out.println(strReverse);
    }
    
}
