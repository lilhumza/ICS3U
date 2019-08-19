package u3_a2_hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 31
 * Program: Monogram
 * Purpose: Learn string functions, length, uppercase, lowercase, substring
 */
public class U3A2_MonogramJFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        U3A2_Monogram  myFrame = new U3A2_Monogram (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 750,600 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
