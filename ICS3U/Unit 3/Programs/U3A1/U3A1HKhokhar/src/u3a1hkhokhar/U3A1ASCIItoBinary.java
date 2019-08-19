package u3a1hkhokhar;
import java.util.Scanner;

/**
 * @author Humza Khokhar
 * Date: July 31
 * Program: ASCII To Binary
 * Purpose: Learn string to ASCII to binary conversions
 */
public class U3A1ASCIItoBinary {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a secret message: ");
        String strMessage = input.next();
        
        String strASCII = "";
        String strBinary = "";
        String print = "";
        
        for(int i = 0; i < strMessage.length(); i++){
            char chrCharacter = strMessage.charAt(i);
            int intASCII = (int) chrCharacter;
            strASCII += intASCII + " ";
            
            while (intASCII > 0){
               strBinary =(intASCII % 2 ) +strBinary;
               intASCII = intASCII/2;               
            }
            
            for (int j=strBinary.length()-1; j >=0; j--){
                print = print + strBinary.charAt(j);
            }
           
        }
        
        System.out.println(strBinary);
        System.out.println(strASCII);
        System.out.println("The message in binary is "+print);

    }
    
}
