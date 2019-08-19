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
 * Date: July 26, 2019
 * Title: Guessing Game
 * Purpose: Learn GUI, and Math.random operator for guessing game
 */
public class U2A5GuessingGame extends JFrame implements ActionListener{
    
    //random number from 1 - 100 assigned to variable, is a global variable
    int intRandomNum = (int)(Math.random() * ((100 - 1) + 1)) + 1;
    
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblNumber; //To ask user to enter number guess
    JLabel lblAlert; //To alert user if guess is right or wrong
    JLabel lblHints; //To display hints as they guess numbers
    JTextField txtNumber;// To read the diameter from user input
    JButton btnCheck;// Check button to check for answer
    
    public U2A5GuessingGame(){
        super("Guessing Game"); //Set window title to Guessing Game
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(200, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLACK); //Set text color to black
        lblWelcome.setText("Guessing Game"); //Set text title to Guessing Game
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the Guess Number label
        lblNumber = new JLabel(); //Declare new GUI label
        lblNumber.setLocation(50,100); //Set position of guessing number label
        lblNumber.setSize(500, 100); //set size of GUI label

        lblNumber.setForeground(Color.BLACK); //Set text colour black
        lblNumber.setText("Enter your guess between 0-100:"); //Prompt messaage of asking for guessed number
        lblNumber.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblNumber); //Add label to gui
        
        //Setting up the Alert label
        lblAlert = new JLabel(); //Declare new GUI label
        lblAlert.setLocation(450,150); //Set position of total cost label
        lblAlert.setSize(500, 100); //Set size of total cost label

        lblAlert.setForeground(Color.BLACK); //set text colour black
        lblAlert.setText("WRONG"); //Display no text initially
        lblAlert.setFont(new Font ("Arial", Font.BOLD, 28)); //set font and size
        add(lblAlert); //Add label to GUI
        
        //Setting up the Hints label
        lblHints = new JLabel(); //Declare new GUI label
        lblHints.setLocation(50,200); //Set position of total cost label
        lblHints.setSize(500, 100); //Set size of total cost label

        lblHints.setForeground(Color.BLACK); //set text colour black
        lblHints.setText("Hint:"); //Display no text initially
        lblHints.setFont(new Font ("Arial", Font.BOLD, 24)); //set font and size
        add(lblHints); //Add label to GUI
        
        //Number Guess Text Field Setup
        txtNumber = new JTextField(); //Declare text field in GUI
        txtNumber.setLocation(450, 125); //Set position of text field for guess number value
        txtNumber.setSize(125, 50); //Set size of guess number text field

        txtNumber.setForeground(Color.BLACK); //Set text colour as black
        txtNumber.setText(""); //Keep text field empty until user input
        txtNumber.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNumber); //Add text field to GUI
        
        //Setting up the button
        btnCheck = new JButton(); //declare button in GUI
        btnCheck.setLocation(600, 125); //Set position of calculate button
        btnCheck.setSize(125, 50); //Set size of button

        btnCheck.setForeground(Color.BLACK); //Text colour black
        btnCheck.setText("Check"); //Button text says "Check"
        btnCheck.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnCheck.setActionCommand("check"); //set action command, the execution protocol to string value "check"
        btnCheck.addActionListener(this); //Make button react to action command of check
        add(btnCheck); //add button to gui
        
//        System.out.println(intRandomNum);
    }
    
    public void actionPerformed (ActionEvent e){
        
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("check")){
            
            int intUserGuess = Integer.parseInt(txtNumber.getText()); 
            //Retrieve user inputted guess, parse as integer and assign to variable
            
            //ALERT Output
            if (intUserGuess == intRandomNum){ //if guess = number
                lblAlert.setText("You Got It!"); //Print winner statement
            } else if (intUserGuess < intRandomNum) { //if guess < number
                lblAlert.setText("Too Low!"); //Print too Low
            } else { //if num > number
                lblAlert.setText("Too High"); //too high
            } 
            
            //HINTS Output
            if (Math.abs(intRandomNum-intUserGuess) > 50){ //if guess +- over 50
                lblHints.setText("Freezing—more than 50 away");
            } else if (Math.abs(intRandomNum-intUserGuess) > 25) { //if guess +- over 25
                lblHints.setText("Cold—more than 25 away");
            } else if (Math.abs(intRandomNum-intUserGuess) > 15){ //if guess +- over 15
                lblHints.setText("Cool—more than 15 away");
            } else if (Math.abs(intRandomNum-intUserGuess) > 10){ //if guess +- over 10
                lblHints.setText("Warm—more than 10 away");
            } else if (Math.abs(intRandomNum-intUserGuess) > 5){ //if guess +- over 5
                lblHints.setText("Hot—more than 5 away"); 
            } else if (intUserGuess == intRandomNum){ //if guess = number
                lblHints.setText(""); //Clear Hints Text Ouptput
            } else { //if guess is +- (1 to 4)
                lblHints.setText("Boiling—between 1 and 4 away");
            }  
            
        }
        
    }
    
}

