package u3_a3_hkhokhar;
import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: August 2
 * Program: Linear Conversion
 * Purpose: Introduction to Methods
 */
public class U3A3_ConvertMeJFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        U3A3_ConvertMe  myFrame = new U3A3_ConvertMe (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 750,1500 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
