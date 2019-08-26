/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ueaug8thdemo;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author nanth
 */
public class ICS3UEAug8thDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String > strList1 = new ArrayList<String>();
        Collections.addAll(strList1, "zebra","cat", "dog","dog","tiger");
        Collections.sort(strList1);
        
        System.out.println(strList1);
        //int index = Collections.binarySearch(strList1, "tiger");
        //System.out.println(index);
        //strList1.remove(index);
        //System.out.println(strList1);
       
        for(int i = 0; i < strList1.size(); i++){
            int index = Collections.binarySearch(strList1, "dog");
            System.out.println(index);
            if(index >= 0)
                strList1.remove(index);
        }
    }
    
}
