package u2a6hkhokhar;
import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 28
 * Program: Certificates of Deposit
 * Purpose: Explore GUI, and loops, calculate CD values
 */
public class U2A6CDCalculatorJFrameTester {

    public static void main(String[] args) {
        
        U2A6CDCalculator myFrame = new U2A6CDCalculator(); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 750,500 ); // set frame size
        myFrame.setVisible( true ); // display frame
        
        
    }
    
}
