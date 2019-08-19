package unit2activity1;

/**
 * @author Humza Khokhar
 * Date: July 22, 2019
 * Title: Net Pay
 * Purpose: Intro to NetBeans, Find Net Pay of Employee and Print out Statement
 */
public class NetPay {

    public static void main(String[] args) {
        
        double dblHours, dblWage, dblInsur, dblTax, dblNetPay;
        //Declare variables for hours, wages, insurance, tax & Net Pay;
        
        dblHours = 40; //assign 40 hours to variable
        dblWage = 5.00; //assign $5.00 hourly wage to variable
        dblInsur = 2.00; //assign $2.00 insurance deduction to variable
        dblTax = 0.22; //assign 22% tax as decimal to variable
        
        dblNetPay = (dblHours * dblWage - dblInsur) - dblTax * (dblHours * dblWage - dblInsur);
        //Calculate Net Pay: hours*age-insurance - 0.22 percent taxes & assign to variable

        System.out.println("The net pay of the employee is $"+dblNetPay);
        //Print out final statement of employee Net Pay
    }
    
}
