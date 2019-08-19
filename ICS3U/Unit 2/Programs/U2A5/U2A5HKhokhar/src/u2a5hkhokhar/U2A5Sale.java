package u2a5hkhokhar;
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
import java.math.RoundingMode;
/**
 * @author Humza Khokhar
 * Date: July 25, 2019
 * Title: Sale Calculator
 * Purpose: Learn GUI, and Math Operators for sales calculations
 */
public class U2A5Sale extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblCost; //To ask user to enter the total cost
    JLabel lblSavings; //To display the total calulated savings from cost
    JLabel lblDiscount; //To display the total discounted cost
    JTextField txtCost;// To read the cost from user input
    JTextField txtSavings;// To output the amount of savings
    JTextField txtDiscount;// To output the total discounted price
    JButton btnCalculate;// Calculate button to caculate total savings & cost
    
    public U2A5Sale(){
    
        super("$uper $tore $ale"); //Set window title to Super Store Sale
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(175, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLACK); //Set text color to black
        lblWelcome.setText("$uper $tore $ale"); //SET text title to Super Store Sale
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the Cost label
        lblCost = new JLabel(); //Declare new GUI label
        lblCost.setLocation(50,100); //Set position of total cost label
        lblCost.setSize(500, 100); //Set size of total cost label

        lblCost.setForeground(Color.BLACK); //set text colour black
        lblCost.setText("Amount of Purchases: "); //Prompt user for purchase amount
        lblCost.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblCost); //Add label to GUI
        
        //Setting up the Savings label
        lblSavings = new JLabel(); //Declare new GUI label
        lblSavings.setLocation(50,250); //Set position of diameter label
        lblSavings.setSize(500, 100); //set size of GUI label

        lblSavings.setForeground(Color.BLACK); //Set text colour black
        lblSavings.setText("Discount amount:"); //Display message of Discount Amount
        lblSavings.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblSavings); //Add label to gui
        
        //Setting up the Discounted Total label
        lblDiscount = new JLabel(); //Declare new GUI label
        lblDiscount.setLocation(50,325); //Set position of total cost label
        lblDiscount.setSize(500, 100); //Set size of total cost label

        lblDiscount.setForeground(Color.BLACK); //set text colour black
        lblDiscount.setText("Discounted Price:"); //Display no text initially
        lblDiscount.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblDiscount); //Add label to GUI
        
        //Cost Text Field Setup
        txtCost = new JTextField(); //Declare text field in GUI
        txtCost.setLocation(550, 125); //Set position of text field for diameter value
        txtCost.setSize(100, 50); //Set size of total cost text field

        txtCost.setForeground(Color.BLACK); //Set text colour as black
        txtCost.setText(""); //Keep text field empty until user input
        txtCost.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtCost); //Add text field to GUI
        
        //Savings Text Field Setup
        txtSavings = new JTextField(); //Declare text field in GUI
        txtSavings.setLocation(550, 275); //Set position of text field for diameter value
        txtSavings.setSize(100, 50); //Set size of total cost text field

        txtSavings.setForeground(Color.BLACK); //Set text colour as black
        txtSavings.setText(""); //Keep text field empty until user input
        txtSavings.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtSavings); //Add text field to GUI
        
        //Discount Total Text Field Setup
        txtDiscount = new JTextField(); //Declare text field in GUI
        txtDiscount.setLocation(550, 350); //Set position of text field for diameter value
        txtDiscount.setSize(100, 50); //Set size of total cost text field

        txtDiscount.setForeground(Color.BLACK); //Set text colour as black
        txtDiscount.setText(""); //Keep text field empty until user input
        txtDiscount.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtDiscount); //Add text field to GUI
        
        //Setting up the button
        btnCalculate = new JButton(); //declare button in GUI
        btnCalculate.setLocation(500, 200); //Set position of calculate button
        btnCalculate.setSize(150, 50); //Set size of button

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
            
            double dblCost = Double.parseDouble(txtCost.getText()); //declare variable for storing the user input from cost text field
            double dblSavings, dblDiscount; //Declare variable for savings & discount
           
            DecimalFormat cents = new DecimalFormat("#.00"); //Setup formatter for cents values
            
            if (dblCost > 10.00){ //if cost > 10, give discount
                dblSavings = dblCost * 0.10; //Calculate 10% savings and assign to variable
                txtSavings.setText("$"+cents.format(dblSavings)); //Print savings, formatted to cents
                
                dblDiscount = dblCost - dblSavings; //Calculate total discounted price
                txtDiscount.setText("$"+cents.format(dblDiscount)); //Print total discounted price, rounded to cents
            } 
            else { // cost is not > 10, don't give discount
               txtSavings.setText("$0.00"); //Cost is less than 10, hence zero discount
               txtDiscount.setText("$"+cents.format(dblCost)); //Print formatted cost
            }
        
       }
        
    }
}
