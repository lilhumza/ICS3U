package unit2activity1;
import java.util.Scanner; //Scanner for keyboard input

/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Change Calculator
 * Purpose: Intro to NetBeans, Calculate change from cents, output coins
 * Referenced from: https://www.youtube.com/watch?v=CVauqxju9RQ
 */
public class ChangeCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int  intCents, intDimes, intNickels, intQuarters, intPennies;
        //declare variable for input in cents, and output in change
        
        System.out.print("Enter Change in Cents: ");
        intCents = input.nextInt(); //Takes input from console
        
        System.out.println("\nThe minimum amount of coins is:");
        
        intQuarters = intCents / 25; 
        //Divides by 25 to get number of quarters and assign to variable
        intCents = intCents % 25; 
        //Gets the remainder for next operator
        
        intDimes = intCents / 10; 
        //Divides by 10 to get number of dimes and assign to variable
        intCents = intCents % 10; 
        //Gets the remainder for next operator
        
        intNickels = intCents/5; 
        //Divides by 5 to get number of nickels and assign to variable
        intCents = intCents %5; 
        //Gets the remainder for next operator
        
        intPennies = intCents; 
        //Remainder is number of pennies
        
        System.out.println("\tQuarters: "+intQuarters+"\n\tDimes: "+intDimes+"\n\tNickels: "+intNickels+"\n\tPennies: "+intPennies);
        //Print out number of each coin
              
    }
    
}
