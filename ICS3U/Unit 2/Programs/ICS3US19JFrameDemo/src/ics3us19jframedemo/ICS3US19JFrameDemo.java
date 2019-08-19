/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3us19jframedemo;
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
 * @author nanth
 */
public class ICS3US19JFrameDemo extends JFrame implements ActionListener{
 

    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblDiameter; //To ask user to enter diameter of pizza
    JLabel lblCost; //To display the total calulated cost of pizza
    JTextField txtDiameter;// To read the diameter from user input
    JButton btnCalculate;// Calculate button to caculate total cost of pizza
    
    public ICS3US19JFrameDemo(){
      super("Pizza Price Calculator");
      setLayout(null); // set frame layout
      getContentPane().setBackground(Color.WHITE);
      //Settimng up the welcome label
      lblWelcome = new JLabel();
      lblWelcome.setLocation(100, 0);
      lblWelcome.setSize(550, 100);
      
      lblWelcome.setForeground(Color.BLACK);
      lblWelcome.setText("Pizza Price Calculator");
      lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48));
      add(lblWelcome);
      
      //Setting up the Diameter label
      lblDiameter = new JLabel();
      lblDiameter.setLocation(50,100);
      lblDiameter.setSize(500, 100);
      
      lblDiameter.setForeground(Color.BLACK);
      lblDiameter.setText("Enter the diameter of the pizza in inches:");
      lblDiameter.setFont(new Font ("Arial", Font.BOLD, 24));
      add(lblDiameter);
      
      //Setting up the Cost label
      lblCost = new JLabel();
      lblCost.setLocation(50,250);
      lblCost.setSize(500, 100);
      
      lblCost.setForeground(Color.BLACK);
      lblCost.setText("");
      lblCost.setFont(new Font ("Arial", Font.BOLD, 24));
      add(lblCost);
      
      //Diameter Text Field Setup
      txtDiameter = new JTextField();
      txtDiameter.setLocation(550, 125);
      txtDiameter.setSize(100, 50);
      
      txtDiameter.setForeground(Color.BLACK);
      txtDiameter.setText("");
      txtDiameter.setFont(new Font ("Arial", Font.BOLD, 24));
      add(txtDiameter);      
      
      //Setting up the button
      btnCalculate = new JButton();
      btnCalculate.setLocation(500, 200);
      btnCalculate.setSize(150, 50);
      
      btnCalculate.setForeground(Color.BLACK);
      btnCalculate.setText("Calculate");
      btnCalculate.setFont(new Font ("Arial", Font.BOLD, 24));
      btnCalculate.setActionCommand("calculate");
      btnCalculate.addActionListener(this);
      add(btnCalculate);
    }
    
    
   
    public void actionPerformed (ActionEvent e){
        
       if(e.getActionCommand().equals("calculate")){
           
           int intDiameter = Integer.parseInt(txtDiameter.getText());
           double dblCost = intDiameter*0.50 + 1.00 + 1.50;
           
           DecimalFormat cents = new DecimalFormat("#.00");
           
           lblCost.setText("The cost of the pizza is $"+cents.format(dblCost));
       }
    }
}
