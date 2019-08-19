package u3_a4_hkhokhar;
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
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Humza Khokhar
 * Date: August 6
 * Program: CD Collection
 * Purpose: Intro to Arrays, ArrayLists, and Text Area
 */
public class U3A4_CDCollection extends JFrame implements ActionListener{
    
    public static String formatOrder(ArrayList <String> stringCD){ //Method for creating a formatted list of CD's, set Arraylist as parameter
        String strCD = ""; //declare String to retrieve all CD titles from arrayList
        String strOrderCD = ""; //declare String to retrieve orderd format of CD titles from formatted ArrayList
        
        for (int i=0; i <stringCD.size(); i++){ //Loop to shuffle through the arrayList
                strCD += stringCD.get(i) +"\n";  //Assign values for CD's from Array list in organized format           
            }
            
            Collections.addAll(stringCD); //Declare Collections for the arrayList
            Collections.sort(stringCD); //Sort arrayList alphabetically 
            
            for (int i=0; i <stringCD.size(); i++){ //Loop to shuffle through the sorted arrayList
                strOrderCD += stringCD.get(i) +"\n"; //Assign values for CD's from sorted ArrayList in organized format         
            }
        String strStatement = "Unsorted List\n"+strCD+"\nSorted List\n"+strOrderCD; //Declare variable to store the original and formatted list of CD's
        return(strStatement); //Return the statment variable
            
    }
    
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblCD; //To display the format for entering a CD title
    JTextField txtCD; // To read the CD information from user input
    JButton btnDisplay; // convert button to execute sequence
    JButton btnInitialize; //Initialize button to initialize list
    JButton btnAdd; //add button to add to list
    JButton btnRemove; //remove button to remove from list
    JTextArea txtArea; //Text area for displaying list
    ArrayList <String> strCD = new ArrayList(); //Declare arrayList for storing CD info
    
    public U3A4_CDCollection(){
        
        super("CD Collection"); //Set window title to Linear Conversion
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(325, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLUE); //Set text color to blue
        lblWelcome.setText("CD Collection"); //Set text title to Linear Conversion
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the 1st conversion label
        lblCD = new JLabel(); //Declare new GUI label
        lblCD.setLocation(30,100); //Set position of 1st conversion label
        lblCD.setSize(500, 100); //set size of GUI label

        lblCD.setForeground(Color.BLACK); //Set text colour black
        lblCD.setText("Title - Artist"); //Display 1st conversion
        lblCD.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblCD); //Add label to gui
        
        //Conversion choice text field setup
        txtCD = new JTextField(); //Declare text field in GUI
        txtCD.setLocation(250, 130); //Set position of text field for conversion choice
        txtCD.setSize(700, 40); //Set size of conversion text field

        txtCD.setForeground(Color.BLACK); //Set text colour as black
        txtCD.setText(""); //Keep text field empty until user input
        txtCD.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtCD); //Add text field to GUI
        
        //Setting up the display button
        btnDisplay = new JButton(); //declare button in GUI
        btnDisplay.setLocation(25, 200); //Set position of display button
        btnDisplay.setSize(150, 40); //Set size of button

        btnDisplay.setForeground(Color.BLACK); //Text colour black
        btnDisplay.setText("Display"); //Button text says "Convert"
        btnDisplay.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnDisplay.setActionCommand("display"); //set action command, the execution protocol to string value "display"
        btnDisplay.addActionListener(this); //Make button react to action command of display
        btnDisplay.setEnabled(false); //Set button initially disabled
        add(btnDisplay); //add button to gui
        
        //Setting up the initialize button
        btnInitialize = new JButton(); //declare button in GUI
        btnInitialize.setLocation(250, 200); //Set position of initialize button
        btnInitialize.setSize(150, 40); //Set size of button

        btnInitialize.setForeground(Color.BLACK); //Text colour black
        btnInitialize.setText("Initialize"); //Button text says "initialize"
        btnInitialize.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnInitialize.setActionCommand("initialize"); //set action command, the execution protocol to string value "initialize"
        btnInitialize.addActionListener(this); //Make button react to action command of display
        add(btnInitialize); //add button to gui
        
        //Setting up the add button
        btnAdd = new JButton(); //declare button in GUI
        btnAdd.setLocation(600, 200); //Set position of add button
        btnAdd.setSize(150, 40); //Set size of button

        btnAdd.setForeground(Color.BLACK); //Text colour black
        btnAdd.setText("Add"); //Button text says "add"
        btnAdd.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnAdd.setActionCommand("add"); //set action command, the execution protocol to string value "add"
        btnAdd.addActionListener(this); //Make button react to action command of display
        btnAdd.setEnabled(false); //Set button initially disabled
        add(btnAdd); //add button to gui
        
        //Setting up the remove button
        btnRemove = new JButton(); //declare button in GUI
        btnRemove.setLocation(800, 200); //Set position of remove button
        btnRemove.setSize(150, 40); //Set size of button

        btnRemove.setForeground(Color.BLACK); //Text colour black
        btnRemove.setText("Remove"); //Button text says "remove"
        btnRemove.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnRemove.setActionCommand("remove"); //set action command, the execution protocol to string value "remove"
        btnRemove.addActionListener(this); //Make button react to action command of display
        btnRemove.setEnabled(false); //Set button initially disabled
        add(btnRemove); //add button to gui
        
        //Setting up the text area
        txtArea = new JTextArea(); //Declare text field in GUI
        txtArea.setLineWrap(true); //Allow string to continue to next line
        txtArea.setWrapStyleWord(true); //Ensure each string is on a new line
        txtArea.setEditable(false); //Ensure there is no user input in the text area
        txtArea.setText(""); //Set Text Area empty initially
        txtArea.setLocation(25, 300); //Set position of text field for conversion choice
        txtArea.setSize(925, 700); //Set size of conversion text field
        
        txtArea.setForeground(Color.BLACK); //Set text colour as black
        txtArea.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtArea); //Add text field to GUI
        
        
    }

    public void actionPerformed (ActionEvent e){
        
        //If initialize button pressed, the following occurs 
        if(e.getActionCommand().equals("initialize")){ 
            //Disable initialize button, enable all other buttons
            btnInitialize.setEnabled(false);
            btnDisplay.setEnabled(true);
            btnAdd.setEnabled(true);
            btnRemove.setEnabled(true);
              
        }
        //If add button pressed, the following occurs 
        if(e.getActionCommand().equals("add")){
            
            strCD.add(txtCD.getText()); //Assign CD titles to arrayList
            txtCD.setText(""); //Clear text field after button pressed and storing value
           
        }
        //If display button pressed, the following occurs 
        if(e.getActionCommand().equals("display")){
            //Call to method formatOrder to recieve formatted cd titles and display in text area
            txtArea.setText(formatOrder(strCD)); 
           
        }
        //If remove button pressed, the following occurs 
        if(e.getActionCommand().equals("remove")){
            //Declare varible to retrieve index of string value in text field
            int index = Collections.binarySearch(strCD, txtCD.getText()); 
            
            if (index < 0){ //if index is negative
                txtArea.setText("CD Does Not Exist"); //Cd title does not exist
            } else { //if index is positive
                txtArea.setText(""); //Clear text area
                strCD.remove(index); //Remove value at index
                txtArea.setText(formatOrder(strCD)); //Call to method formatOrder to recieve formatted cd titles and display in text area
                txtCD.setText(""); //Clear text field
            }
            
        } 
        
    }
    
}
