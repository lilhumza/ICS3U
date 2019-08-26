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
public class ICS3UES19SAugust1stDemo {

    public static void printHorizontal(){
        System.out.println("- - - -");
    }
    
    public static void printvertical1(){
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
    }
    public static void printvertical2(){
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
    }
    
    public static void Iameight(){
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Seven segmanet display
        Scanner input = new Scanner(System.in);
        int intX = input.nextInt();
        
        //let print the seven segmanet
        System.out.println("- - - -");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("- - - -");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("- - - -");
        
        if(intX == 3){
           printHorizontal();
           printvertical1();
           printHorizontal();
           printvertical1();
           printHorizontal();

        }
        else if(intX== 8){
            
        }
    }
    
}
