package u3a6_marks_hkhokhar;
import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: August 9
 * Program: Marks Program
 * Purpose: Intro to Arrays, ArrayLists, and Text Area
 */
public class U3A6MarksProgramJFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        U3A6MarksProgram  myFrame = new U3A6MarksProgram (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 1000,1000 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
    
}
