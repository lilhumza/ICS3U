/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3us19jframedemo;

import javax.swing.JFrame;

/**
 *
 * @author nanth
 */
public class JFrameTester {
     public static void main( String[] args )
   { 
      ICS3US19JFrameDemo myFrame = new ICS3US19JFrameDemo(); // create LabelFrame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       myFrame.setSize( 750,500 ); // set frame size
       myFrame.setVisible( true ); // display frame
       
       
   } // end main
}
