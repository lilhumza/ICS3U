package u2a5hkhokhar;

import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 26, 2019
 * Title: Hurricane Scale
 * Purpose: Learn GUI, and Decision Operators (Switch case) for outputting hurricane information
 */
public class U2A5HurricaneJFrameTester {

    public static void main(String[] args) {

        U2A5Hurricane myFrame = new U2A5Hurricane(); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 800,500 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
