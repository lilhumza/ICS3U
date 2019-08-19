package gradeconverter_hkhokhar;

/**
 * @author Humza Khokhar
 * Date: August 8
 * Program: Grade Converter
 * Purpose: Program Debugging
 */
import java.util.*;
public class U3A5_GradeConverter {

    public static Scanner sc = new Scanner(System.in); //Declare a public scanner
    
    public static void main(String[] args) {
        
        int intType; //Declare variable to recieve value from menu selection

	do //Loop printing out options for main menu of program
	{
	    System.out.println("MAIN MENU");
	    System.out.println("=========");
	    System.out.println("1. Convert to a Letter grade");
	    System.out.println("2. Convert to a Level grade");
	    System.out.println("3. Exit \n");
	    System.out.println("Please enter your selection: ");
	    intType=sc.nextInt();

	    if (intType==1) percentageToAlpha(); //Select choice 1
	    if (intType==2) percentageToLevel(); //Slect choice 2
	}
	while (intType != 3); //End program for choice 3
    }

        // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {
	int intGrade; //Declare variable for grade in percentage
	String strAlphaGrade; //Declare variable for alphabet grade
	String strMessageOut; //Declare variable for ouput statement of converted grade

	System.out.println("Please enter the numeric grade: ");
	intGrade=sc.nextInt(); //Prompt user and assign percentage grade to variable
        
        //If sequence to determine grade conversion
	if (intGrade < 50) {
		strAlphaGrade="F";
	}else if (intGrade <=52)
	{
		strAlphaGrade = "D-";
	}else if (intGrade <=56)
	{
		strAlphaGrade = "D";
	}else if (intGrade  <=59)
	{
		strAlphaGrade = "D+";
	}else if (intGrade <=62)
	{
		strAlphaGrade = "C-";
	}else if (intGrade  <=66)
	{
		strAlphaGrade = "C";
	}else if (intGrade <=69)
	{
		strAlphaGrade = "C+";
	}else if (intGrade  <=72)
	{
		strAlphaGrade = "B-";
	}else if (intGrade <=76)
	{
		strAlphaGrade = "B";
	}else if (intGrade  <=79)
	{
		strAlphaGrade = "B+";
	}else if (intGrade  <=84)
	{
		strAlphaGrade = "A-";
	}else if (intGrade  <=89)
	{
		strAlphaGrade = "A";
	}else if (intGrade <=100)
	{
		strAlphaGrade = "A+";
	}else
        {
                strAlphaGrade = "Error - invalid mark, try again!";
	}
        
	strMessageOut=(intGrade + "% = " + strAlphaGrade); //Assign final grade conversion to variable
	System.out.println(strMessageOut); //Print output statement of converted grade
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()
    {
	int intGrade; //declare variable for grade in percentage
	String strLevelGrade; //declare variable for level grade
	String strMessageOut; //declare variable for output statement

	System.out.println("Please enter the numeric grade: ");
	intGrade=sc.nextInt(); //Prompt user and assign percentage grade to variable
        
        //if sequence to determine grade conversion
	if (intGrade < 50) {
		strLevelGrade="R";
	}else if (intGrade <=52)
	{
		strLevelGrade = "1-";
	}else if (intGrade <=56)
	{
		strLevelGrade = "1";
	}else if (intGrade  <=59)
	{
		strLevelGrade = "1+";
	}else if (intGrade <=62)
	{
		strLevelGrade = "2-";
	}else if (intGrade  <=66)
	{
		strLevelGrade = "2";
	}else if (intGrade <=69)
	{
		strLevelGrade = "2+";
	}else if (intGrade  <=72)
	{
		strLevelGrade = "3-";
	}else if (intGrade <=76)
	{
		strLevelGrade = "3";
	}else if (intGrade  <=79)
	{
		strLevelGrade = "3+";
	}else if (intGrade  <=84)
	{
		strLevelGrade = "4-";
	}else if (intGrade  <=89)
	{
		strLevelGrade = "4";
	}else if (intGrade <=100)
	{
		strLevelGrade = "4+";
	}else
        {
                strLevelGrade = "Error - invalid mark, try again!";
	}


	strMessageOut=(intGrade + "% = " + strLevelGrade); //Assign final grade conversion to variable
	System.out.println(strMessageOut); //Print output statement of final converted grade
    }

}
