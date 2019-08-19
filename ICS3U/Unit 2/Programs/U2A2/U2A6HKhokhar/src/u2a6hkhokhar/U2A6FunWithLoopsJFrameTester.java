package u2a6hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 28
 * Program: Fun With Loops
 * Purpose: Explore GUI, and loops, print out numbers in a range specified by user input
 */
public class U2A6FunWithLoopsJFrameTester {
    
    public static void main(String[] args) {
       
       U2A6FunWithLoops myFrame = new U2A6FunWithLoops(); // create LabelFrame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       myFrame.setSize( 750,500 ); // set frame size
       myFrame.setVisible( true ); // display frame
    }
    
}
