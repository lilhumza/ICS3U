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
 * Program: Certificates of Deposit
 * Purpose: Explore GUI, and loops, calculate CD values
 */
public class U2A6CDCalculator extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblInitial; //To ask user to enter a initial investment
    JLabel lblInterest; //To ask the user for interest rate
    JLabel lblValue; //To ask user for desired end value
    JLabel lblYears; //To output the final amount of years required after CD calculations
    JTextField txtInitial;// To read the initial investment from user inputt
    JTextField txtInterest; //To read the interest rate from user input
    JTextField txtValue; //To read the desired end value from user input
    JButton btnCalculate;// Calculate button to calculate years required
    
    public U2A6CDCalculator(){
        
        super("CD Calculator"); //Set window title to CD Calculator
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(175, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLACK); //Set text color to black
        lblWelcome.setText("CD Calculator"); //Set text title to CD calculator
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the Initial Investment label
        lblInitial = new JLabel(); //Declare new GUI label
        lblInitial.setLocation(50,100); //Set position of start investment label
        lblInitial.setSize(500, 100); //set size of GUI label

        lblInitial.setForeground(Color.BLACK); //Set text colour black
        lblInitial.setText("Enter initial investment ($):"); //Prompt messaage of asking for investment amount
        lblInitial.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblInitial); //Add label to gui
        
        //Setting up the Interest Rate label
        lblInterest = new JLabel(); //Declare new GUI label
        lblInterest.setLocation(50,160); //Set position of interest label
        lblInterest.setSize(500, 100); //Set size of interest label

        lblInterest.setForeground(Color.BLACK); //set text colour black
        lblInterest.setText("Enter annual interest rate (%):"); //Prompt message asking user for interest rate
        lblInterest.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblInterest); //Add label to GUI
        
        //Setting up the Ending Value label
        lblInterest = new JLabel(); //Declare new GUI label
        lblInterest.setLocation(50,220); //Set position of ending value label
        lblInterest.setSize(500, 100); //Set size of ending value label

        lblInterest.setForeground(Color.BLACK); //set text colour black
        lblInterest.setText("Enter ending value ($):"); //Prompt message asking user for ending value
        lblInterest.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblInterest); //Add label to GUI
        
        //Setting up the label to display years to reach ending value
        lblYears = new JLabel(); //Declare new GUI label
        lblYears.setLocation(50,330); //Set position of years label
        lblYears.setSize(550, 100); //Set size of years label

        lblYears.setForeground(Color.RED); //set text colour black
        lblYears.setText(""); //Set text field empty initially
        lblYears.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblYears); //Add label to GUI
        
        //Initial investment Text Field Setup
        txtInitial = new JTextField(); //Declare text field in GUI
        txtInitial.setLocation(450, 125); //Set position of text field for initial investment
        txtInitial.setSize(200, 50); //Set size of investment text field

        txtInitial.setForeground(Color.BLACK); //Set text colour as black
        txtInitial.setText(""); //Keep text field empty until user input
        txtInitial.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtInitial); //Add text field to GUI
        
        //Interest Rate Text Field Setup
        txtInterest = new JTextField(); //Declare text field in GUI
        txtInterest.setLocation(450, 185); //Set position of text field for interest rate
        txtInterest.setSize(200, 50); //Set size of interest rate text field

        txtInterest.setForeground(Color.BLACK); //Set text colour as black
        txtInterest.setText(""); //Keep text field empty until user input
        txtInterest.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtInterest); //Add text field to GUI
        
        //Ending Value Text Field Setup
        txtValue = new JTextField(); //Declare text field in GUI
        txtValue.setLocation(450, 245); //Set position of text field for ending value
        txtValue.setSize(200, 50); //Set size of end value text field

        txtValue.setForeground(Color.BLACK); //Set text colour as black
        txtValue.setText(""); //Keep text field empty until user input
        txtValue.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtValue); //Add text field to GUI
        
        //Setting up the button
        btnCalculate = new JButton(); //declare button in GUI
        btnCalculate.setLocation(450, 305); //Set position of calculate button
        btnCalculate.setSize(200, 50); //Set size of button

        btnCalculate.setForeground(Color.BLACK); //Text colour black
        btnCalculate.setText("Calculate"); //Button text says "Calculate"
        btnCalculate.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnCalculate.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnCalculate.addActionListener(this); //Make button react to action command of calculate
        add(btnCalculate); //add button to gui
        
    }
    public void actionPerformed (ActionEvent e){
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
            
            //Declare variable for initial investment, retrieve data from user input, parse and assign to variable
            double dblInvestment = Double.parseDouble(txtInitial.getText()); 
            
            //Declare variable for interest rate, retrieve data from user input, parse and assign to variable
            double dblInterest = (Double.parseDouble(txtInterest.getText()))/100.0;
            
            //Declare variable for desired end value, retrieve data from user input, parse and assign to variable
            double dblValue = Double.parseDouble(txtValue.getText());
            
            
            int intYears = 0; //Declare variable for year counter to reach end value
            
            while (dblInvestment <= dblValue){ //While loop runs until Investment amount is greater than or equal to the desired end value
                dblInvestment = dblInvestment + (dblInvestment * dblInterest); //Calculates CD Value and assigns to variable
                intYears++; //Adds a year each time the loop is executed till Investment is >= Value
            }
            
            //Set Label to display the number of years till investment reaches end value
            lblYears.setText("The number of years required is "+intYears); 
            
        }
    }
    
}
