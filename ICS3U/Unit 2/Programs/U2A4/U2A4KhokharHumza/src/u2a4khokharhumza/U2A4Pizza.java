package u2a4khokharhumza;
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
 *
 * @author Humza Khokhar
 * Date: July 25
 * Program: Pizza Cost Calculator
 * Purpose: Explore GUI, and writing custom GUI with user input, not drag & drop
 */
public class U2A4Pizza extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblDiameter; //To ask user to enter diameter of pizza
    JLabel lblCost; //To display the total calulated cost of pizza
    JTextField txtDiameter;// To read the diameter from user input
    JButton btnCalculate;// Calculate button to caculate total cost of pizza
    
    public U2A4Pizza(){
      super("Pizza Price Calculator"); //Set window title to Pizza Price Calculator
      setLayout(null); // set frame layout
      getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
      
      //Settimng up the welcome label
      lblWelcome = new JLabel(); //declare new GUI label
      lblWelcome.setLocation(100, 0); //Set Position of Welcome label
      lblWelcome.setSize(550, 100); //Set size of GUI label
      
      lblWelcome.setForeground(Color.BLACK); //Set text color to black
      lblWelcome.setText("Pizza Price Calculator"); //SET text title to Pizza Price Calculator
      lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
      add(lblWelcome); //Add label to GUI
      
      //Setting up the Diameter label
      lblDiameter = new JLabel(); //Declare new GUI label
      lblDiameter.setLocation(50,100); //Set position of diameter label
      lblDiameter.setSize(500, 100); //set size of GUI label
      
      lblDiameter.setForeground(Color.BLACK); //Set text colour black
      lblDiameter.setText("Enter the diameter of the pizza in inches:"); //Prompt messaage of asking for diamter
      lblDiameter.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
      add(lblDiameter); //Add label to gui
      
      //Setting up the Cost label
      lblCost = new JLabel(); //Declare new GUI label
      lblCost.setLocation(50,250); //Set position of total cost label
      lblCost.setSize(500, 100); //Set size of total cost label
      
      lblCost.setForeground(Color.BLACK); //set text colour black
      lblCost.setText(""); //Display no text initially
      lblCost.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
      add(lblCost); //Add label to GUI
      
      //Diameter Text Field Setup
      txtDiameter = new JTextField(); //Declare text field in GUI
      txtDiameter.setLocation(550, 125); //Set position of text field for diameter value
      txtDiameter.setSize(100, 50); //Set size of total cost text field
      
      txtDiameter.setForeground(Color.BLACK); //Set text colour as black
      txtDiameter.setText(""); //Keep text field empty until user input
      txtDiameter.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
      add(txtDiameter); //Add text field to GUI
      
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
           
           int intDiameter = Integer.parseInt(txtDiameter.getText()); //Diameter is parsed from string to integer and stored
           double dblCost = intDiameter*0.50 + 1.00 + 1.50; //total cost is calculated using diameter and labour cost, store cost and materials
           
           DecimalFormat cents = new DecimalFormat("#.00"); //Setup formatter for cents values
           
           lblCost.setText("The cost of the pizza is $"+cents.format(dblCost)); //Print final total cost to GUI label
       }
    }
    
}
