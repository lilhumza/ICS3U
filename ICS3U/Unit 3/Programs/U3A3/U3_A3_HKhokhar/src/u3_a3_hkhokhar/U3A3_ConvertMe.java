package u3_a3_hkhokhar;
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
 * Date: August 2
 * Program: Linear Conversion
 * Purpose: Introduction to Methods
 */

public class U3A3_ConvertMe extends JFrame implements ActionListener{
    
    //method to convert inches to centimetres, takes an input of inches
    public static double inchesToCentimetres(double dblInches){ 
        
       	double dblCentimetres = dblInches * 2.54; //Deckare variable for centimetres, calculate and assign value in centimetres
        return(dblCentimetres); //Return value in centimetres
    }
    //method to convert feet to centimetres, takes an input of feet
    public static double feetToCentimetres(double dblFeet){
        
       	double dblCentimetres = dblFeet * 30; //Deckare variable for centimetres, calculate and assign value in centimetres
        return(dblCentimetres); //return value in centimetres
    }
    //method to convert yards to metres, takes an input of feet
    public static double yardsToMetres(double dblYards){
        
       	double dblMetres = dblYards * 0.91; //Declare variable for metres, calculate and assign value in metres
        return(dblMetres); //return value in meters
    }
    //Method to convert miles to kilometers
    public static double milesToKilometres(double dblMiles){
        
       	double dblKilometres = dblMiles * 1.6; //declare varibale for kilometres, calculate and assign value in kilometers
        return(dblKilometres); //return value in kilometers
    }
    //Method to convert centimetres to inches
    public static double centimetresToInches(double dblCentimetres){
        
       	double dblInches = dblCentimetres / 2.54; //declare varibale for inches, calculate and assign value in inches
        return(dblInches); //return value in inches
    }
    //Method to convert centimetres to feet
    public static double centimetresToFeet(double dblCentimetres){
        
       	double dblFeet = dblCentimetres / 30; //declare varibale for feet, calculate and assign value in feet
        return(dblFeet); //return value in feet
    }
    //Method to convert metres to yards
    public static double metresToYards(double dblMetres){
        
       	double dblYards = dblMetres / 0.91; //declare varibale for Yards, calculate and assign value in yards
        return(dblYards); //return value in yards
    }
    //Method to convert kilometres to miles
    public static double kilometresToMiles(double dblKilometres){
        
       	double dblMiles = dblKilometres / 1.6; //declare varibale for miles, calculate and assign value in miles
        return(dblMiles); //return value in miles
    }
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblConv1; //To display the first option for unit conversion
    JLabel lblConv2; //To display the second option for unit conversion
    JLabel lblConv3; //To display the third option for unit conversion
    JLabel lblConv4; //To display the fourth option for unit conversion
    JLabel lblConv5; //To display the fifth option for unit conversion
    JLabel lblConv6; //To display the sixth option for unit conversion
    JLabel lblConv7; //To display the seventh option for unit conversion
    JLabel lblConv8;//To display the eighth option for unit conversion
    JLabel lblChoice; //To ask the user for the choice of unit conversion
    JLabel lblValue; //To ask the user for the value to be converted
    JLabel lblConverted; //To print out the converted value
    JTextField txtChoice;// To read the conversion choice from user input
    JTextField txtValue; //To read the value of measure to be converted from user input
    JButton btnConvert;// convert button to execute sequence
    
    public U3A3_ConvertMe(){
        
        super("Linear Conversion"); //Set window title to Linear Conversion
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(140, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLUE); //Set text color to blue
        lblWelcome.setText("Linear Conversion"); //Set text title to Linear Conversion
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the 1st conversion label
        lblConv1 = new JLabel(); //Declare new GUI label
        lblConv1.setLocation(215,100); //Set position of 1st conversion label
        lblConv1.setSize(500, 100); //set size of GUI label

        lblConv1.setForeground(Color.BLACK); //Set text colour black
        lblConv1.setText("1. Inches to Centimetres"); //Display 1st conversion
        lblConv1.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv1); //Add label to gui
        
        //Setting up the 2nd conversion label
        lblConv2 = new JLabel(); //Declare new GUI label
        lblConv2.setLocation(215,150); //set position of 2nd conversion label
        lblConv2.setSize(500, 100); //set size of GUI label

        lblConv2.setForeground(Color.BLACK); //Set text colour black
        lblConv2.setText("2. Feet to Centimetres"); //Display 2nd conversion
        lblConv2.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv2); //Add label to gui
        
        //Setting up the 3rd conversion label
        lblConv3 = new JLabel(); //Declare new GUI label
        lblConv3.setLocation(215,200); //set position of 3rd conversion label
        lblConv3.setSize(500, 100); //set size of GUI label

        lblConv3.setForeground(Color.BLACK); //Set text colour black
        lblConv3.setText("3. Yards to Metres"); //Display 3rd conversion
        lblConv3.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv3); //Add label to gui
        
        //Setting up the 4th conversion label
        lblConv4 = new JLabel(); //Declare new GUI label
        lblConv4.setLocation(215,250); //set position of 4th conversion label
        lblConv4.setSize(500, 100); //set size of GUI label

        lblConv4.setForeground(Color.BLACK); //Set text colour black
        lblConv4.setText("4. Miles to Kilometres"); //Display 4th conversion
        lblConv4.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv4); //Add label to gui
        
        //Setting up the 5th conversion label
        lblConv5 = new JLabel(); //Declare new GUI label
        lblConv5.setLocation(215,300); //set position of 5th conversion label
        lblConv5.setSize(500, 100); //set size of GUI label

        lblConv5.setForeground(Color.BLACK); //Set text colour black
        lblConv5.setText("5. Centimetres to Inches"); //Display 5th conversion
        lblConv5.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv5); //Add label to gui
        
        //Setting up the 6th conversion label
        lblConv6 = new JLabel(); //Declare new GUI label
        lblConv6.setLocation(215,350); //set position of 6th conversion label
        lblConv6.setSize(500, 100); //set size of GUI label

        lblConv6.setForeground(Color.BLACK); //Set text colour black
        lblConv6.setText("6. Centimetres to Feet"); //Display 6th conversion
        lblConv6.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv6); //Add label to gui
        
        //Setting up the 7th conversion label
        lblConv7 = new JLabel(); //Declare new GUI label
        lblConv7.setLocation(215,400); //set position of 7th conversion label
        lblConv7.setSize(500, 100); //set size of GUI label

        lblConv7.setForeground(Color.BLACK); //Set text colour black
        lblConv7.setText("7. Metres to Yards"); //Display 7th conversion
        lblConv7.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv7); //Add label to gui
        
        //Setting up the 8th conversion label
        lblConv8 = new JLabel(); //Declare new GUI label
        lblConv8.setLocation(215,450); //set position of 8th conversion label
        lblConv8.setSize(500, 100); //set size of GUI label

        lblConv8.setForeground(Color.BLACK); //Set text colour black
        lblConv8.setText("8. Kilometres to Miles"); //Display 8th conversion
        lblConv8.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConv8); //Add label to gui
        
        //Setting up the conversion choice label
        lblChoice = new JLabel(); //Declare new GUI label
        lblChoice.setLocation(75,550); //set position of choice label
        lblChoice.setSize(500, 100); //set size of GUI label

        lblChoice.setForeground(Color.BLACK); //Set text colour black
        lblChoice.setText("Enter conversion choice (1-8):"); //Display text for conversion choice
        lblChoice.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblChoice); //Add label to gui
        
        //Setting up the value label
        lblValue = new JLabel(); //Declare new GUI label
        lblValue.setLocation(75,600); //set position of value label
        lblValue.setSize(500, 100); //set size of GUI label

        lblValue.setForeground(Color.BLACK); //Set text colour black
        lblValue.setText("Enter value to be converted:"); //Display text for value
        lblValue.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblValue); //Add label to gui
        
        //Setting up the converted value label
        lblConverted = new JLabel(); //Declare new GUI label
        lblConverted.setLocation(200,710); //set position of converted label
        lblConverted.setSize(500, 100); //set size of GUI label

        lblConverted.setForeground(Color.RED); //Set text colour red
        lblConverted.setText(""); //Keep text field blank initially
        lblConverted.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblConverted); //Add label to gui
        
        //Conversion choice text field setup
        txtChoice = new JTextField(); //Declare text field in GUI
        txtChoice.setLocation(450, 575); //Set position of text field for conversion choice
        txtChoice.setSize(200, 40); //Set size of conversion text field

        txtChoice.setForeground(Color.BLACK); //Set text colour as black
        txtChoice.setText(""); //Keep text field empty until user input
        txtChoice.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtChoice); //Add text field to GUI
        
        //Conversion value text field setup
        txtValue = new JTextField(); //Declare text field in GUI
        txtValue.setLocation(450, 625); //Set position of text field for value
        txtValue.setSize(200, 40); //Set size of value text field

        txtValue.setForeground(Color.BLACK); //Set text colour as black
        txtValue.setText(""); //Keep text field empty until user input 
        txtValue.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtValue); //Add text field to GUI
                      
        //Setting up the button
        btnConvert = new JButton(); //declare button in GUI
        btnConvert.setLocation(75, 525); //Set position of convert button
        btnConvert.setSize(575, 40); //Set size of button

        btnConvert.setForeground(Color.BLACK); //Text colour black
        btnConvert.setText("Convert"); //Button text says "Convert"
        btnConvert.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnConvert.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnConvert.addActionListener(this); //Make button react to action command of calculate
        add(btnConvert); //add button to gui
        
    }
    
    public void actionPerformed (ActionEvent e){
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
            
            int intChoice = Integer.parseInt(txtChoice.getText()); //Declare variable for conversion choice, and assign parsed value from user input
            double dblValue = Double.parseDouble(txtValue.getText()); //Declare variable for value to be converted, and assign value from user input
            
            DecimalFormat round = new DecimalFormat("#####.00"); //Declare decimat formatter to 2 decimal places
                        
            switch (intChoice){ //Switch case statement
                case 1:
                    //Call to method for converting in to cm
                    lblConverted.setText(dblValue +" inches = "+ round.format(inchesToCentimetres(dblValue))+" centimetres"); //Output inches to centimetres conversion
                    break;
                case 2:
                    //Call to method for converting ft to cm
                    lblConverted.setText(dblValue +" feet = "+round.format(feetToCentimetres(dblValue))+ "centimetre"); //output feet to centimetres conversion
                    break;
                case 3:
                    //Call to method for converting yrds to m
                    lblConverted.setText(dblValue+" yards = "+round.format(yardsToMetres(dblValue))+" metres"); //ouput output yards to metres conversion
                    break;
                case 4:
                    //Call to method for converting Miles to Km
                    lblConverted.setText(dblValue+" miles = "+round.format(milesToKilometres(dblValue))+" kilometres"); //output miles to kilometres conversion
                    break;
                case 5:
                    //Call to method for converting cm to in
                    lblConverted.setText(dblValue+" centimetres = "+round.format(centimetresToInches(dblValue))+" inches"); //output cm to in conversion
                    break;
                case 6:
                    //Call to method for converting cm to ft
                    lblConverted.setText(dblValue+" centimetres = "+round.format(centimetresToFeet(dblValue))+" feet"); //output cm to ft conversion
                    break;
                case 7:
                    //Call to method for converting m to yrds
                    lblConverted.setText(dblValue+" metres = "+round.format(metresToYards(dblValue))+" yards"); //output m to yrds conversion
                    break;
                case 8:
                    //Call to method for converting km to M
                    lblConverted.setText(dblValue+" kilometres = "+round.format(kilometresToMiles(dblValue))+" miles"); //output km to miles conversion
                    break;
                default:
                    lblConverted.setText("ERROR: Enter a number between 1 - 8"); //ouput error message and restrictions
            }
            
        }
    }
    
}
