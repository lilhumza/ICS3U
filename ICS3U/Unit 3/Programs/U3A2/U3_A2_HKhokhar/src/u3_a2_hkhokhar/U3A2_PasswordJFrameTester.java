package u3_a2_hkhokhar;
import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: July 31
 * Program: Password Program
 * Purpose: Learn string functions, append, random numbers, decision structures
 */
public class U3A2_PasswordJFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        U3A2_Password  myFrame = new U3A2_Password (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 750,600 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
