/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ueaugust6thsortdemo;

/**
 *
 * @author nanth
 */
public class ICS3UEAugust6thSortDemo {

    public static void bubbleSort(int [] intArr1){
        for(int i = 0; i < intArr1.length; i++){
            //the i for loop will repeat the process
            for(int j = 0; j < intArr1.length - 1; j++){
                //j for loop will compare the adjucant elements
                if(intArr1[j] > intArr1[j+1]){
                    //let sawp them
                    int intTemp = intArr1[j];
                    intArr1[j] = intArr1[j+1];
                    intArr1[j+1] = intTemp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] intArr1 = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort(intArr1);
        for(int i = 0; i < intArr1.length; i++){
            System.out.print(intArr1[i]+"\t");
        }
        System.out.println("");
    }
    
}
