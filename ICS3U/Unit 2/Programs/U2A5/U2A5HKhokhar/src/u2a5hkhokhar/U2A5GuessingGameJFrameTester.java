package u2a5hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 26, 2019
 * Title: Guessing Game
 * Purpose: Learn GUI, and Math.random operator for guessing game
 */
public class U2A5GuessingGameJFrameTester {

    public static void main(String[] args) {
        
        U2A5GuessingGame myFrame = new U2A5GuessingGame(); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 800,500 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
