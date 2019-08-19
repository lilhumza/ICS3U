package u3_a4_hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: August 6
 * Program: CD Collection
 * Purpose: Intro to Arrays, ArrayLists, and Text Area
 */
public class U3A4_CDCollectionJFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        U3A4_CDCollection  myFrame = new U3A4_CDCollection (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 1000,1000 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
