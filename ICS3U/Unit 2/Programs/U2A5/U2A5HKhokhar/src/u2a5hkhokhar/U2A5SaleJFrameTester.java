package u2a5hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 25, 2019
 * Title: Sale Calculator
 * Purpose: Learn GUI, and Math Operators for sales calculations
 */
public class U2A5SaleJFrameTester {

    public static void main(String[] args) {
        
        U2A5Sale myFrame = new U2A5Sale(); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 750,500 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
