package u3a6_marks_hkhokhar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Humza Khokhar
 * Date: August 9
 * Program: Marks Program
 * Purpose: Intro to Arrays, ArrayLists, and Text Area
 */
public class U3A6MarksProgram extends JFrame implements ActionListener {
    
    public static double avgCalculator(ArrayList <Integer> intMarks){ //Method to caalculate class avergae
        int intCount = 0; //Declare variable for number of students
        int intStudentMarks = 0; //Declare variable for marks
        double dblAvg; //Declare variable for average
        
        for (int i=0; i< intMarks.size(); i++){ //For loop to shuffle through array
            intStudentMarks += intMarks.get(i); //Retrieve course marks and assign to variable
            intCount++; //Add to number of students counter
        }
                
        dblAvg = (double)intStudentMarks / intCount; //Calculate average
        return(Math.round(dblAvg * 10) / 10.0); //Return rounded average
    }
    public static int maxMark(ArrayList <Integer> intMarks){ //Methos to calculate max mark
        
        Collections.addAll(intMarks); //Add arrayList to collections
        Collections.sort(intMarks); //Sort arrayList
        
        int intMaxMark = intMarks.get(intMarks.size()-1); //Max mark is last element in arrayList, assign to variable
        return (intMaxMark); //return max mark
    }
    public static int minMark(ArrayList <Integer> intMarks){ //Method to calculate min Mark
        
        Collections.addAll(intMarks); //Add arrayList to collections
        Collections.sort(intMarks); //Sort arrayList
        
        int intMinMark = intMarks.get(0); //First element is arrayList is min mark, assign to variable
        return (intMinMark); //return min mark
    }
    public static String markLevels(ArrayList <Integer> intMarks){ //Mthos to determine mark levels
        int intMarkLevels [] = new int[5]; //Declare array  for different levels
        int intMark; //Declare varibel for individual mark
        
        for (int i=0; i< intMarks.size(); i++){ //SHuffle through arrayList
            intMark = intMarks.get(i); //Assign individual mark to variable
            
            if (intMark < 50){ //If mark is less than 50
                intMarkLevels[0]++; //level R
            } 
            else if (intMark < 60) { //If mark < 60
                intMarkLevels[1]++; //Level 1
            }
            else if (intMark < 70){ //If mark <70
                intMarkLevels[2]++; //Level 2
            }
            else if (intMark < 80){ //If mark <80
                intMarkLevels[3]++; //Level 3
            } else { //Mark is greater than equal to 80                
                intMarkLevels[4]++; //Level 4
            }
           
        }
        //Declare varibel for formatted Mark Levels
        String strStatement = "Number at Level 4: "+intMarkLevels[4]+"\nNumber at Level 3: "+intMarkLevels[3]+"\nNumber at Level 2: "+intMarkLevels[2]+"\nNumber at Level 1: "+intMarkLevels[1]+"\nNumber at Level R: "+intMarkLevels[0];
        return(strStatement); //Return mark levels
        
    }
    
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblMarks; //To display the Marks label
    JTextField txtMarks; // To read the marks from user input
    JButton btnAdd; // add button to execute sequence
    JButton btnSort; //sort button to sort marks
    JButton btnAnalyze; //analyze button analyze marks
    JTextArea txtSortMarks; //Text area for displaying sorted marks
    JTextArea txtAnalyzeMarks; //Text area for displaying analyzed marks
    ArrayList <Integer> intMarks = new ArrayList(); //Declare arrayList for storing marks
    
    public U3A6MarksProgram (){
        super("Marks Program"); //Set window title to Marks Program
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.WHITE); //Set Background color of program to white
        
        //Settimng up the welcome label
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(325, 0); //Set Position of Welcome label
        lblWelcome.setSize(550, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.DARK_GRAY); //Set text color to gray
        lblWelcome.setText("Marks Program"); //Set text title to 
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Setting up the marks label
        lblMarks = new JLabel(); //Declare new GUI label
        lblMarks.setLocation(130,100); //Set position of marks label
        lblMarks.setSize(500, 100); //set size of GUI label

        lblMarks.setForeground(Color.BLACK); //Set text colour black
        lblMarks.setText("Student Mark"); //Display Student Mark
        lblMarks.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(lblMarks); //Add label to gui
        
        //Marks text field setup
        txtMarks = new JTextField(); //Declare text field in GUI
        txtMarks.setLocation(350, 130); //Set position of text field for marks
        txtMarks.setSize(150, 40); //Set size of marks text field

        txtMarks.setForeground(Color.BLACK); //Set text colour as black
        txtMarks.setText(""); //Keep text field empty until user input
        txtMarks.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtMarks); //Add text field to GUI
        
        //Setting up the add button
        btnAdd = new JButton(); //declare button in GUI
        btnAdd.setLocation(550, 130); //Set position of add button
        btnAdd.setSize(150, 40); //Set size of button

        btnAdd.setForeground(Color.BLACK); //Text colour black
        btnAdd.setText("Add"); //Button text says "add"
        btnAdd.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnAdd.setActionCommand("add"); //set action command, the execution protocol to string value "add"
        btnAdd.addActionListener(this); //Make button react to action command of add
        add(btnAdd); //add button to gui
        
        //Setting up the sort button
        btnSort = new JButton(); //declare button in GUI
        btnSort.setLocation(125, 750); //Set position of add button
        btnSort.setSize(150, 40); //Set size of button

        btnSort.setForeground(Color.BLACK); //Text colour black
        btnSort.setText("Sort"); //Button text says "sort"
        btnSort.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnSort.setActionCommand("sort"); //set action command, the execution protocol to string value "sort"
        btnSort.addActionListener(this); //Make button react to action command of sort
        add(btnSort); //add button to gui
        
        //Setting up the analyze button
        btnAnalyze = new JButton(); //declare button in GUI
        btnAnalyze.setLocation(600, 750); //Set position of analyze button
        btnAnalyze.setSize(150, 40); //Set size of button

        btnAnalyze.setForeground(Color.BLACK); //Text colour black
        btnAnalyze.setText("Analyze"); //Button text says "analyze"
        btnAnalyze.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnAnalyze.setActionCommand("analyze"); //set action command, the execution protocol to string value "analyze"
        btnAnalyze.addActionListener(this); //Make button react to action command of analyze
        add(btnAnalyze); //add button to gui
        
        //Setting up the sort marks text area
        txtSortMarks = new JTextArea(); //Declare text field in GUI
        txtSortMarks.setLineWrap(true); //Allow string to continue to next line
        txtSortMarks.setWrapStyleWord(true); //Ensure each string is on a new line
        txtSortMarks.setEditable(false); //Ensure there is no user input in the text area
        txtSortMarks.setText(""); //Set Text Area empty initially
        txtSortMarks.setLocation(100, 225); //Set position of text area for conversion choice
        txtSortMarks.setSize(300, 500); //Set size of text area
        
        txtSortMarks.setForeground(Color.BLACK); //Set text colour as black
        txtSortMarks.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtSortMarks); //Add text area to GUI
        
        //Setting up the text area
        txtAnalyzeMarks = new JTextArea(); //Declare text field in GUI
        txtAnalyzeMarks.setLineWrap(true); //Allow string to continue to next line
        txtAnalyzeMarks.setWrapStyleWord(true); //Ensure each string is on a new line
        txtAnalyzeMarks.setEditable(false); //Ensure there is no user input in the text area
        txtAnalyzeMarks.setText(""); //Set Text Area empty initially
        txtAnalyzeMarks.setLocation(500, 225); //Set position of text area for conversion choice
        txtAnalyzeMarks.setSize(350, 500); //Set size of conversion text area
        
        txtAnalyzeMarks.setForeground(Color.BLACK); //Set text colour as black
        txtAnalyzeMarks.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtAnalyzeMarks); //Add text area to GUI
        
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        //If add button pressed, the following occurs 
        if(e.getActionCommand().equals("add")){
            int intMark = Integer.parseInt(txtMarks.getText());
            intMarks.add(intMark);
            txtMarks.setText("");
        }
        //If sort button pressed, the following occurs 
        if(e.getActionCommand().equals("sort")){
            String strSorted = "";
            
            Collections.addAll(intMarks);
            Collections.sort(intMarks);
            
            for (int i=0; i <intMarks.size(); i++){ //Loop to shuffle through the sorted arrayList
                strSorted += intMarks.get(i) +"\n"; //Assign values for marks from sorted ArrayList in organized format         
            }
            txtSortMarks.setText(strSorted);
        }
        if(e.getActionCommand().equals("analyze")){
            //declare string for output and assign organized analysis to variable
            String strOutput = "Class Average: "+avgCalculator(intMarks)+"%\nMax Mark: "+maxMark(intMarks)+"%\nMin Mark: "+minMark(intMarks)+"%\nRange of Marks: "+(maxMark(intMarks)-minMark(intMarks))+"\n"+markLevels(intMarks);
            txtAnalyzeMarks.setText(strOutput); //Output Analyzed marks
        }
        
        
    }
    
}
