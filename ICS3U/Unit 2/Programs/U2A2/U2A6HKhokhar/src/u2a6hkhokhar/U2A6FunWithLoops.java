package u2a6hkhokhar;
import java.awt.Color;
import java.awt.FlowLayout; // specifies how components are arranged
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Humza Khokhar
 * Date: July 28
 * Program: Fun With Loops
 * Purpose: Explore GUI, and loops, print out numbers in a range specified by user input
 */
public class U2A6FunWithLoops extends JFrame implements ActionListener {
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblStart; //To ask user to enter a starting number
    JLabel lblEnd; //To ask the user for an ending number
    JLabel lblPrint; //To print out the number sequence from the for loop
    JTextField txtStart;// To read the starting number from user input
    JTextField txtEnd; //To read the ending number from user input
    JButton btnValues;// Values button to execute sequence from for loop
    
    public U2A6FunWithLoops(){
        
        super("Fun With Loops!"); //Set window title to fun With Loops
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(175, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLACK); //Set text color to black
        lblWelcome.setText("Fun With Loops!"); //Set text title to Fun With Loops!
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the Starting Number label
        lblStart = new JLabel(); //Declare new GUI label
        lblStart.setLocation(50,100); //Set position of start number label
        lblStart.setSize(500, 100); //set size of GUI label

        lblStart.setForeground(Color.BLACK); //Set text colour black
        lblStart.setText("Enter a starting number:"); //Prompt messaage of asking for starting number
        lblStart.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblStart); //Add label to gui
        
        //Setting up the Ending Number label
        lblEnd = new JLabel(); //Declare new GUI label
        lblEnd.setLocation(50,175); //Set position of total cost label
        lblEnd.setSize(500, 100); //Set size of total cost label

        lblEnd.setForeground(Color.BLACK); //set text colour black
        lblEnd.setText("Enter an ending number:"); //Prompt message asking user for ending number
        lblEnd.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblEnd); //Add label to GUI
        
        //Setting up the label to display the sequnce of numbers from for loop
        lblPrint = new JLabel(); //Declare new GUI label
        lblPrint.setLocation(50,300); //Set position of total cost label
        lblPrint.setSize(700, 100); //Set size of total cost label

        lblPrint.setForeground(Color.RED); //set text colour black
        lblPrint.setText(""); //Set text field empty initially
        lblPrint.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblPrint); //Add label to GUI
        
        //Starting number Text Field Setup
        txtStart = new JTextField(); //Declare text field in GUI
        txtStart.setLocation(450, 125); //Set position of text field for starting number value
        txtStart.setSize(200, 50); //Set size of starting number text field

        txtStart.setForeground(Color.BLACK); //Set text colour as black
        txtStart.setText(""); //Keep text field empty until user input
        txtStart.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtStart); //Add text field to GUI
        
        //Ending number Text Field Setup
        txtEnd = new JTextField(); //Declare text field in GUI
        txtEnd.setLocation(450, 200); //Set position of text field for ending number value
        txtEnd.setSize(200, 50); //Set size of ending number text field

        txtEnd.setForeground(Color.BLACK); //Set text colour as black
        txtEnd.setText(""); //Keep text field empty until user input
        txtEnd.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtEnd); //Add text field to GUI
        
        //Setting up the button
        btnValues = new JButton(); //declare button in GUI
        btnValues.setLocation(450, 275); //Set position of show values button
        btnValues.setSize(200, 50); //Set size of button

        btnValues.setForeground(Color.BLACK); //Text colour black
        btnValues.setText("Show Values"); //Button text says "Show Values"
        btnValues.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnValues.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnValues.addActionListener(this); //Make button react to action command of calculate
        add(btnValues); //add button to gui
        
    }
    
    public void actionPerformed (ActionEvent e){
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
           
            int intStart = Integer.parseInt(txtStart.getText()); 
            //Declare variable for starting number, and assign a parsed integer value from user input to variable

            int intEnd = Integer.parseInt(txtEnd.getText()); 
            //Declare variable for ending number, and assign a parsed integer value from user input to variable

            String strText = "";
            
            //For loop running through all the number from Start to End
            for (int i=intStart; i<=intEnd; i++ ){ 
                strText = strText+" "+i; //Assign values between Start and End to variable
            }
            
            lblPrint.setText(strText); //Print all numbers between Start and End to GUI, using strNum
            
        }
        
    }

}
