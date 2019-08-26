/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ues19july24thdemo;

import javax.swing.JFrame;

/**
 *
 * @author nanth
 */
public class JFrameTester {
      public static void main( String[] args )
   { 
       ICS3UES19July24thDemo myFrame = new ICS3UES19July24thDemo(); // create new Frame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );//when we click the x button
       //the JFrame will be closed
       
       myFrame.setSize(500, 500 ); // set frame size
       myFrame.setVisible( true ); // display frame
   } // end main
}
