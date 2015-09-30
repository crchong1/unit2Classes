import java.util.Scanner;

/**
 * Write a description of class CommaDeleter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommaDeleter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1,000 and 999,999: ");
        String numberWithCommas = input.next();
        
        int index = numberWithCommas.indexOf(",");
        
        int charsInString = numberWithCommas.length();
        
        String substring = numberWithCommas.substring(0,index);
        String substring2 = numberWithCommas.substring(index+1, charsInString);
        
        System.out.println();
        System.out.println("Here is the number without commas:  " + substring + substring2);
        
        
    }
}
