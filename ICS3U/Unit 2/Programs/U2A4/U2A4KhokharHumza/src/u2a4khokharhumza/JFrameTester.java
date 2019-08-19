package u2a4khokharhumza;

import javax.swing.JFrame;

/**
 *
 * @author lilhu
 */
public class JFrameTester {

    public static void main(String[] args) {
       
       U2A4Pizza myFrame = new U2A4Pizza(); // create LabelFrame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       myFrame.setSize( 750,500 ); // set frame size
       myFrame.setVisible( true ); // display frame
    }
    
}
