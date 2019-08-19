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
 * Program: Password Program
 * Purpose: Learn string functions, append, random numbers, decision structures
 */
public class U3A2_Password extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblUsername; //To ask user to enter their username
    JLabel lblPassword; //To ask user to enter their password
    JLabel lblHint; //Output the character minimum for a password
    JLabel lblGuidelines; //To display the User & Pass or give an error message
    JTextField txtUsername;// To read the username from user input
    JTextField txtPassword; //To read the password from user input
    JButton btnGenerate;// calculate button to execute sequence
    
    public U3A2_Password(){
        
        super("Password Program"); //Set window title to Password Program
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(100, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLUE); //Set text color to blue
        lblWelcome.setText("Password Program"); //Set text title to Password Program
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the username label
        lblUsername = new JLabel(); //Declare new GUI label
        lblUsername.setLocation(50,100); //Set position of username label
        lblUsername.setSize(500, 100); //set size of GUI label

        lblUsername.setForeground(Color.BLACK); //Set text colour black
        lblUsername.setText("Enter a username:"); //Prompt messaage of asking for username
        lblUsername.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblUsername); //Add label to gui
        
        //Setting up the password label
        lblPassword = new JLabel(); //Declare new GUI label
        lblPassword.setLocation(50,175); //Set position of password label
        lblPassword.setSize(500, 100); //set size of GUI label

        lblPassword.setForeground(Color.BLACK); //Set text colour black
        lblPassword.setText("Enter a password:"); //Prompt messaage of asking for password
        lblPassword.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblPassword); //Add label to gui
        
        //Setting up the hints label
        lblHint = new JLabel(); //Declare new GUI label
        lblHint.setLocation(50,200); //Set position of password label
        lblHint.setSize(500, 100); //set size of GUI label

        lblHint.setForeground(Color.BLACK); //Set text colour black
        lblHint.setText("(at least 8 characters)"); //POuput character minimum for password
        lblHint.setFont(new Font ("Arial", Font.BOLD, 18)); //Set font & size
        add(lblHint); //Add label to gui
        
        //Setting up the guidelines label
        lblGuidelines = new JLabel(); //Declare new GUI label
        lblGuidelines.setLocation(50,350); //Set position of guidelines label
        lblGuidelines.setSize(700, 100); //set size of GUI label

        lblGuidelines.setForeground(Color.RED); //Set text colour red
        lblGuidelines.setText(""); //set text field empty initially
        lblGuidelines.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblGuidelines); //Add label to gui
        
        //Username Text Field Setup
        txtUsername = new JTextField(); //Declare text field in GUI
        txtUsername.setLocation(450, 125); //Set position of text field for username
        txtUsername.setSize(200, 50); //Set size of username text field

        txtUsername.setForeground(Color.BLACK); //Set text colour as black
        txtUsername.setText(""); //Keep text field empty until user input
        txtUsername.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtUsername); //Add text field to GUI
        
        //Password Text Field Setup
        txtPassword = new JTextField(); //Declare text field in GUI
        txtPassword.setLocation(450, 210); //Set position of text field for password
        txtPassword.setSize(200, 50); //Set size of password text field

        txtPassword.setForeground(Color.BLACK); //Set text colour as black
        txtPassword.setText(""); //Keep text field empty until user input
        txtPassword.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtPassword); //Add text field to GUI
        
        //Setting up the button
        btnGenerate = new JButton(); //declare button in GUI
        btnGenerate.setLocation(150, 300); //Set position of generate
        btnGenerate.setSize(400, 50); //Set size of button

        btnGenerate.setForeground(Color.BLACK); //Text colour black
        btnGenerate.setText("Generate Password"); //Button text says "Generate Password"
        btnGenerate.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnGenerate.setActionCommand("calculate"); //set action command, the execution protocol to string value "calculate"
        btnGenerate.addActionListener(this); //Make button react to action command of calculate
        add(btnGenerate); //add button to gui
    }
    
    public void actionPerformed (ActionEvent e){
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("calculate")){
            
            String strUsername = (txtUsername.getText()).toLowerCase(); //Declare variable username and assign lowercase value from user input
            String strPassword = (txtPassword.getText()).toLowerCase(); //Declare variable password and assign lowercase value from user input
            
            if (strPassword.length() < 8){ //If Password is less than 8 characters
                lblGuidelines.setText("Password must be at least 8 characters long");
            } else { //Otherwise attach a random number to end of password
                int intRandNumber = (int)(Math.random() * ((100 - 1) + 1)) + 1; //Declare variable and assign random number from 1 - 100
                strPassword = strPassword.concat(Integer.toString(intRandNumber)); //Attach random number to end of password
                lblGuidelines.setText("Username: "+strUsername+" Password: "+strPassword); //Print Username & Password
            }
            
        }
    }
    
}
