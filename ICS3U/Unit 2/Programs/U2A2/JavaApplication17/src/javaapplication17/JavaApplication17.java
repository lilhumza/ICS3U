package javaapplication17;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author lilhu
 */
public class JavaApplication17 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        
        int num1 = 3;
        int num2 = 4;
        
        if (num1 > num2){
            num1=5;
        } else {
            num2 =5;
        }
        
        System.out.println(num1);
        System.out.println(num2);
        
    
    }
    
}
