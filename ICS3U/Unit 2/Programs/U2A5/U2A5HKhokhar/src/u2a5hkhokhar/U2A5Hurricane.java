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
/**
 * @author Humza Khokhar
 * Date: July 26, 2019
 * Title: Hurricane Scale
 * Purpose: Learn GUI, and Decision Operators (Switch case) for outputting hurricane information
 */
public class U2A5Hurricane extends JFrame implements ActionListener{
    
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblCategory; //To ask user to enter category number of hurrricane
    JLabel lblCategoryNum; //To display the category number after user execution
    JLabel lblWindSpeed; //To display the wind speeds of the user inputted category number
    JTextField txtCategory;// To read the category number from user input
    JButton btnSelect;// Select button to select category number and execute wind speed output
    
    public U2A5Hurricane(){
        super("Hurricane Scale"); //Set window title to Hurricane Scale
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(175, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.BLACK); //Set text color to black
        lblWelcome.setText("Hurricane Scale"); //Set text title to Hurricane Scale
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting  up the category label
        lblCategory = new JLabel(); //Declare new GUI label
        lblCategory.setLocation(50,100); //Set position of category label
        lblCategory.setSize(500, 100); //set size of GUI label

        lblCategory.setForeground(Color.BLACK); //Set text colour black
        lblCategory.setText("Pease enter a hurricane category (1-5):"); //Prompt messaage of asking for category number
        lblCategory.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblCategory); //Add label to gui
        
        //Setting up the category number label for output
        lblCategoryNum = new JLabel(); //Declare new GUI label
        lblCategoryNum.setLocation(50,225); //Set position of category nunber label
        lblCategoryNum.setSize(600, 100); //set size of GUI label
        
        lblCategoryNum.setForeground(Color.BLACK); //Set text colour black
        lblCategoryNum.setText(""); //Set category number label blank initially until execution of select button
        lblCategoryNum.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblCategoryNum); //Add label to gui
        
        //Setting up the wind Speed label
        lblWindSpeed = new JLabel(); //Declare new GUI label
        lblWindSpeed.setLocation(50,275); //Set position of windspeed label
        lblWindSpeed.setSize(600, 100); //set size of GUI label

        lblWindSpeed.setForeground(Color.BLACK); //Set text colour black
        lblWindSpeed.setText(""); //Set wind speed label blank initially until execution of select button
        lblWindSpeed.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblWindSpeed); //Add label to gui
        
        //Category number Text Field Setup
        txtCategory = new JTextField(); //Declare text field in GUI
        txtCategory.setLocation(500, 125); //Set position of text field for category number
        txtCategory.setSize(75, 50); //Set size of cetegory number text field

        txtCategory.setForeground(Color.BLACK); //Set text colour as black
        txtCategory.setText(""); //Keep text field empty until user input
        txtCategory.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtCategory); //Add text field to GUI
        
        //Setting up the button
        btnSelect = new JButton(); //declare button in GUI
        btnSelect.setLocation(620, 125); //Set position of select button
        btnSelect.setSize(100, 50); //Set size of button

        btnSelect.setForeground(Color.BLACK); //Text colour black
        btnSelect.setText("Select"); //Button text says "Select"
        btnSelect.setFont(new Font ("Arial", Font.BOLD, 20)); //set font & size
        btnSelect.setActionCommand("select"); //set action command, the execution protocol to string value "select"
        btnSelect.addActionListener(this); //Make button react to action command of select
        add(btnSelect); //add button to gui
    
    }
    
    public void actionPerformed (ActionEvent e) {
        //If button pressed, the following occurs 
        if(e.getActionCommand().equals("select")){
            
            //Get category number from textfield, parse as integer and assign to variable
            int intCategoryNumber = Integer.parseInt(txtCategory.getText()); 
            
            switch (intCategoryNumber){ //Begin switch case
                case 1: //if Category number = 1, output Category 1 wind speed
                    lblCategoryNum.setText("Windpeeds for Category 1 are: ");
                    lblWindSpeed.setText("74-95 mph or 64-82 kt or 119-153 km/hr"); //Set Category 1 windspeed
                    break; //End case 1 execution
                case 2: //if Category number = 2, output Category 2 wind speed
                    lblCategoryNum.setText("Windpeeds for Category 2 are: ");
                    lblWindSpeed.setText("96-110 mph or 83-95 kt or 154-177 km/hr"); //Set Category 2 windspeed
                    break; //end case 2 execution
                case 3: //if Category number = 3, output Category 3 wind speed
                    lblCategoryNum.setText("Windpeeds for Category 3 are: ");
                    lblWindSpeed.setText("111-130 mph or 96-113 kt or 178-209 km/hr"); //Set category 3 windspeed
                    break; //end case 3 execution
                case 4: //if Category number = 4, output Category 4 wind speed
                    lblCategoryNum.setText("Windpeeds for Category 4 are: ");
                    lblWindSpeed.setText("131-155 mph or 114-135 kt or 210-249 km/h"); //Set category 4 windspeed
                    break; //end case 4 execution   
                case 5: //if Category number = 5, output Category 5 wind speed
                    lblCategoryNum.setText("Windpeeds for Category 5 are: ");
                    lblWindSpeed.setText("Greater than 155 mph or 135 kt or 249 km/hr"); //Set caetgory 5 windspeed
                    break; //end case 5 execution
                default: //if Category number <0 or >5, output invalid category number
                    lblCategoryNum.setText("Invalid Category Number!");
                    lblWindSpeed.setText("Enter a number between 1-5."); //Output invalid statement 
                    break; //end default case
            }
        }
    }
}
