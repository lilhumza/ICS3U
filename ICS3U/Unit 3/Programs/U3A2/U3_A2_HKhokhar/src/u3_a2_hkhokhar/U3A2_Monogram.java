package u3_a2_hkhokhar;
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
 * Date: July 31
 * Program: Monogram Creator
 * Purpose: Learn string functions, length, uppercase, lowercase, substring
 */
public class U3A2_Monogram extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblFirst; //To ask user to enter their first name
    JLabel lblMiddle; //To ask user to enter their middle name
    JLabel lblLast; //To ask user to enter their last name
    JLabel lblMonogram; //To display the monogram after execution
    JTextField txtFirst;// To read the first name from user input
    JTextField txtMiddle; //To read the middle name from user input
    JTextField txtLast; //To read the last name from user input
    JButton btnCreate;// create button to execute sequence
    
    public U3A2_Monogram (){
        
        super("Monogram Creator"); //Set window title to Monogram Creator
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(100, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLUE); //Set text color to blue
        lblWelcome.setText("Monogram Calculator"); //Set text title to Monogram Calculator
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the First Name label
        lblFirst = new JLabel(); //Declare new GUI label
        lblFirst.setLocation(50,100); //Set position of first name label
        lblFirst.setSize(500, 100); //set size of GUI label

        lblFirst.setForeground(Color.BLACK); //Set text colour black
        lblFirst.setText("Enter your first name:"); //Prompt messaage of asking for first name
        lblFirst.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblFirst); //Add label to gui
        
        //Setting up the Middle Name label
        lblMiddle = new JLabel(); //Declare new GUI label
        lblMiddle.setLocation(50,175); //Set position of middle name label
        lblMiddle.setSize(500, 100); //set size of GUI label

        lblMiddle.setForeground(Color.BLACK); //Set text colour black
        lblMiddle.setText("Enter your middle name:"); //Prompt messaage of asking for middle name
        lblMiddle.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblMiddle); //Add label to gui
        
        //Setting up the Last Name label
        lblLast = new JLabel(); //Declare new GUI label
        lblLast.setLocation(50,250); //Set position of last name label
        lblLast.setSize(500, 100); //set size of GUI label

        lblLast.setForeground(Color.BLACK); //Set text colour black
        lblLast.setText("Enter your last name:"); //Prompt messaage of asking for last name
        lblLast.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblLast); //Add label to gui
        
        //Setting up the Monogram label
        lblMonogram = new JLabel(); //Declare new GUI label
        lblMonogram.setLocation(225,400); //Set position of monogram label
        lblMonogram.setSize(500, 100); //set size of GUI label

        lblMonogram.setForeground(Color.RED); //Set text colour red
        lblMonogram.setText(""); //Keep text field blank initially
        lblMonogram.setFont(new Font ("Arial", Font.BOLD, 36)); //Set font & size
        add(lblMonogram); //Add label to gui
        
        //First Name Text Field Setup
        txtFirst = new JTextField(); //Declare text field in GUI
        txtFirst.setLocation(450, 125); //Set position of text field for first name
        txtFirst.setSize(200, 50); //Set size of first name text field

        txtFirst.setForeground(Color.BLACK); //Set text colour as black
        txtFirst.setText(""); //Keep text field empty until user input
        txtFirst.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtFirst); //Add text field to GUI
        
        //Middle Name Text Field Setup
        txtMiddle = new JTextField(); //Declare text field in GUI
        txtMiddle.setLocation(450, 200); //Set position of text field for middle name
        txtMiddle.setSize(200, 50); //Set size of middle name text field

        txtMiddle.setForeground(Color.BLACK); //Set text colour as black
        txtMiddle.setText(""); //Keep text field empty until user input
        txtMiddle.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtMiddle); //Add text field to GUI
        
        //Last Name Text Field Setup
        txtLast = new JTextField(); //Declare text field in GUI
        txtLast.setLocation(450, 275); //Set position of text field for last name
        txtLast.setSize(200, 50); //Set size of last name text field

        txtLast.setForeground(Color.BLACK); //Set text colour as black
        txtLast.setText(""); //Keep text field empty until user input
        txtLast.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtLast); //Add text field to GUI
        
        //Setting up the button
        btnCreate = new JButton(); //declare button in GUI
        btnCreate.setLocation(50, 425); //Set position of create button
        btnCreate.setSize(150, 50); //Set size of button

        btnCreate.setForeground(Color.BLACK); //Text colour black
        btnCreate.setText("Create"); //Button text says "Create"
        btnCreate.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnCreate.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnCreate.addActionListener(this); //Make button react to action command of calculate
        add(btnCreate); //add button to gui
    }
    public void actionPerformed (ActionEvent e){
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
            
            String strFirst = txtFirst.getText(); //Declare variable for first name and assign value from user input
            String strMiddle = txtMiddle.getText();//Declare variable for middle name and assign value from user input
            String strLast = txtLast.getText();//Declare variable for last name and assign value from user input
            /**Declare variable for statement to be printed, assign value of substring of first letter from each
             *name, with the case change accordingly to instructions**/
            String strStatment = strFirst.substring(0,1).toLowerCase() + strMiddle.substring(0,1).toUpperCase() + strLast.substring(0,1).toLowerCase();
            
            lblMonogram.setText("Your Monogram is: "+strStatment); //Set Monogram label to monogram from strStatement
            
        }
    }
}
