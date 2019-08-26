/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ues19july24thdemo;
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
/**
 *
 * @author nanth
 */
public class MyFrame2 extends JFrame  implements ActionListener{
    JLabel lblWelcome;//This is Title Label
    JLabel lblName;// Label to promot the user to enter his/ her name
    JLabel lblAge ;// Label to promot the user to enter his/her age
    JLabel lblTax ;// Thw LAbel to ask the user to enter the Tax Rate on Ontario
    JLabel lblNameDisplay;// To Display the Name along with the Age
    JLabel lblTaxDisplay;// To Display the Tax Rate in Ontario
    JTextField  txtName ;// To receive the Name
    JTextField txtAge; // to receive the Age
    JTextField txtTax ;// to receive the Tax
    JButton btnEnter; // The Enter Button to perform some action
    JButton btnAvg;//The button will caculate and find the average
    int [] intAge;
    int index = 0;
   
      public MyFrame2(){
        super( "Mr Jeg's First JFrame Demo " );//This will be displayed in the Title Bar
        //Let change the background color of the JFrame
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.RED);
        //Let set up the lblWelcome Label
        lblWelcome = new JLabel();
        //Let set up the size of the labal
        lblWelcome.setSize(100, 50);
        lblWelcome.setLocation(200, 0);
        //Let set the text in the label
        lblWelcome.setText("This is the second frame");
        //Let change the fnot size of the text in the label
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblWelcome.setForeground(Color.YELLOW);
        //we need to add this label into the JFrame
        add(lblWelcome);
        //The Name Label Code
        //Let set up the lblWelcome Label
        lblName = new JLabel();
        lblName.setSize(100, 50);
        lblName.setLocation(0, 50);
        //Let set the text in the label
        lblName.setText("Name");
        //Let change the fnot size of the text in the label
        lblName.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblName.setForeground(Color.YELLOW);
        //we need to add this label into the JFrame
        add(lblName);
        //Adding the Label for Age
        lblAge = new JLabel();
        lblAge.setSize(100, 50);
        lblAge.setLocation(0, 100);
        //Let set the text in the label
        lblAge.setText("Age");
        //Let change the fnot size of the text in the label
        lblAge.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblAge.setForeground(Color.YELLOW);
        //we need to add this label into the JFrame
        add(lblAge);
        //Adding the the Name and Age output Label
        lblNameDisplay = new JLabel();
        lblNameDisplay.setSize(400, 50);
        lblNameDisplay.setLocation(0, 300);
        //Let set the text in the label
        lblNameDisplay.setText("Name and Age will appear here");
        //Let change the fnot size of the text in the label
        lblNameDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblNameDisplay.setForeground(Color.YELLOW);
        //we need to add this label into the JFrame
        add(lblNameDisplay);
        //Name Text Field Set Up
        txtName= new JTextField();
        txtName.setSize(100, 50);
        txtName.setLocation(200, 50);
        //Let set the text in the label
        txtName.setText("");
        //Let change the fnot size of the text in the label
        txtName.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        txtName.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtName);
        
        //Let add the age Text box
        txtAge= new JTextField();
        txtAge.setSize(100, 50);
        txtAge.setLocation(200, 100);
        //Let set the text in the label
        txtAge.setText("");
        //Let change the fnot size of the text in the label
        txtAge.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        txtAge.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAge);
        //Adding the Button
        btnEnter = new JButton();
        btnEnter.setText("ENTER");
        btnEnter.setLocation(0, 250);
        btnEnter.setSize(100, 50);
        //Now we need to make this button listen to us
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);//Make this button to react to the action command
        //ENTER
        add(btnEnter);
        intAge = new int[10];
        //Let's add the btnAveg button
        btnAvg = new JButton();
        btnAvg.setText("AVG");
        btnAvg.setSize(100, 50);
        btnAvg.setLocation(275, 250);
        btnAvg.setActionCommand("Average");
        btnAvg.addActionListener(this);
        add(btnAvg);
        
        
    }
    
      public void actionPerformed (ActionEvent e){
       //Let check what event is invoke
       if(e.getActionCommand().equals("ENTER")){
          
           intAge[index] = (Integer.parseInt(txtAge.getText()));
           
           index++;
          
          
       }
       if(e.getActionCommand().equals("Average")){
           ICS3UES19July24thDemo f1 = new ICS3UES19July24thDemo();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 500, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           this.dispose();//closed the current working JFrame
       }
    }
}
