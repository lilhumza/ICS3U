package u2a8hkhokhar;
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
 * Date: July 30
 * Program: Ideal Weight Calculator
 * Purpose: Summative Evaluation on GUI, Math Operators
 */
public class U2A8WeightCalculator extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblName; //To ask user to enter their name
    JLabel lblSystem; //To ask the user enter their system of measurement
    JLabel lblInitials; //To display the Initials for entering their system
    JLabel lblHeight; //To ask the user for their height
    JLabel lblUnits; //To display the units for the systems 
    JLabel lblWeight; //To print out the ideal weight from BMI Calculations
    JTextField txtName;// To read the name from user input
    JTextField txtSystem; //To read the system of measurement from user input
    JTextField txtHeight; //To read the height from user input
    JButton btnCalculate;// calculate button to execute sequence from for loop
    
    public U2A8WeightCalculator() {
        
        super("Ideal Weight Calculator"); //Set window title to fun With Loops
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(100, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLUE); //Set text color to blue
        lblWelcome.setText("Ideal Weight Calculator"); //Set text title to Ideal Weight Calculator
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the Name label
        lblName = new JLabel(); //Declare new GUI label
        lblName.setLocation(50,100); //Set position of name label
        lblName.setSize(500, 100); //set size of GUI label

        lblName.setForeground(Color.BLACK); //Set text colour black
        lblName.setText("Name:"); //Prompt messaage of asking for Name
        lblName.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblName); //Add label to gui
        
        //Setting up the System of Measurement label
        lblSystem = new JLabel(); //Declare new GUI label
        lblSystem.setLocation(50,175); //Set position of systems
        lblSystem.setSize(500, 100); //set size of GUI label

        lblSystem.setForeground(Color.BLACK); //Set text colour black
        lblSystem.setText("System of Measure:"); //Prompt messaage of asking for System
        lblSystem.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblSystem); //Add label to gui
        
        //Setting up the Initials for System of Measurement label
        lblInitials = new JLabel(); //Declare new GUI label
        lblInitials.setLocation(50,200); //Set position of initials
        lblInitials.setSize(500, 100); //set size of GUI label

        lblInitials.setForeground(Color.BLACK); //Set text colour black
        lblInitials.setText("(M)etric or (I)mperial"); //Prompt messaage of initials
        lblInitials.setFont(new Font ("Arial", Font.BOLD, 18)); //Set font & size
        add(lblInitials); //Add label to gui
        
        //Setting up the height label
        lblHeight = new JLabel(); //Declare new GUI label
        lblHeight.setLocation(50,275); //Set position of height label
        lblHeight.setSize(500, 100); //set size of GUI label

        lblHeight.setForeground(Color.BLACK); //Set text colour black
        lblHeight.setText("Height:"); //Prompt messaage of asking for height
        lblHeight.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblHeight); //Add label to gui
        
        //Setting up the units for height label
        lblUnits = new JLabel(); //Declare new GUI label
        lblUnits.setLocation(50,300); //Set position of initials
        lblUnits.setSize(500, 100); //set size of GUI label

        lblUnits.setForeground(Color.BLACK); //Set text colour black
        lblUnits.setText("metres or inches"); //Prompt messaage of units
        lblUnits.setFont(new Font ("Arial", Font.BOLD, 18)); //Set font & size
        add(lblUnits); //Add label to gui
        
        //Setting up the weight label
        lblWeight = new JLabel(); //Declare new GUI label
        lblWeight.setLocation(50,450); //Set position of weight label
        lblWeight.setSize(500, 100); //set size of GUI label

        lblWeight.setForeground(Color.RED); //Set text colour bred
        lblWeight.setText(""); //Set label blank initially
        lblWeight.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblWeight); //Add label to gui
        
        //Name textfield setup
        txtName = new JTextField(); //Declare text field in GUI
        txtName.setLocation(450, 125); //Set position of text field for name
        txtName.setSize(200, 50); //Set size of name text field

        txtName.setForeground(Color.BLACK); //Set text colour as black
        txtName.setText(""); //Keep text field empty until user input
        txtName.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtName); //Add text field to GUI
        
        //System of Measurement textfield setup
        txtSystem = new JTextField(); //Declare text field in GUI
        txtSystem.setLocation(450, 210); //Set position of text field for systems
        txtSystem.setSize(200, 50); //Set size of systems text field

        txtSystem.setForeground(Color.BLACK); //Set text colour as black
        txtSystem.setText(""); //Keep text field empty until user input
        txtSystem.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtSystem); //Add text field to GUI
        
        //Height textfield setup
        txtHeight = new JTextField(); //Declare text field in GUI
        txtHeight.setLocation(450, 310); //Set position of text field for height
        txtHeight.setSize(200, 50); //Set size of height text field

        txtHeight.setForeground(Color.BLACK); //Set text colour as black
        txtHeight.setText(""); //Keep text field empty until user input
        txtHeight.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtHeight); //Add text field to GUI
        
        //Setting up the button
        btnCalculate = new JButton(); //declare button in GUI
        btnCalculate.setLocation(450, 400); //Set position of calculate button
        btnCalculate.setSize(200, 50); //Set size of button

        btnCalculate.setForeground(Color.BLACK); //Text colour black
        btnCalculate.setText("Calculate"); //Button text says "Scalculate"
        btnCalculate.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnCalculate.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnCalculate.addActionListener(this); //Make button react to action command of calculate
        add(btnCalculate); //add button to gui
        
    }
    public void actionPerformed (ActionEvent e){
        
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
            
            String strName = txtName.getText(); //declare variable for name and assign value from user input
            String strSystem = txtSystem.getText(); //declare variable for system and assign value from user input
            double dblHeight = Double.parseDouble(txtHeight.getText()); //declare variable for height, parse and assign value from suer input
            double dblWeight; //Declare variable for weight calculated by BMI
             
            DecimalFormat weight = new DecimalFormat("###.##"); //Declare decimal formatter weight to two decimal places
            
            if (strSystem.equals("M")){
                dblWeight = ((dblHeight * dblHeight) * 25); //Calculate weight for Metric
                lblWeight.setText(strName+"'s ideal weight is "+weight.format(dblWeight)+" kgs."); //Set label text to ideal weight statement
            } else if (strSystem.equals("I")){
                dblWeight = ((dblHeight * dblHeight) * 25)/703; //Calculate weight for imperial
                lblWeight.setText(strName+"'s ideal weight is "+weight.format(dblWeight)+" lbs."); //Set label text to ideal weight statement
            } else {
                lblWeight.setText("Invalid Entry For System! Enter 'I' or 'M'"); //Error Message for system initials input
            }
            
        }
        
    }
}
