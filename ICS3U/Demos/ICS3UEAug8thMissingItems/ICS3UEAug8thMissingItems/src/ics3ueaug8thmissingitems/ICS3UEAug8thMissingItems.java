/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ueaug8thmissingitems;

/**
 *
 * @author nanth
 */
public class ICS3UEAug8thMissingItems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0; i < 10; i++)
            System.out.print(i +"\t");
        System.out.println("");
        
        int x = 10;
        while (x > 0)
            x--;
        System.out.println(x);
           
        int d = 20;
        while (d != 5){
            d--;
            if(d == 8) break;
        }
        System.out.println(d);
    }
    
}
