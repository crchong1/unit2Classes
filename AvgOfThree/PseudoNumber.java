
import java.util.Scanner;

public class PseudoNumber
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a 10 digit number: ");
        String oldNumber = input.next();
        
        String part1 = oldNumber.substring(0,3);
        String part2 = oldNumber.substring(3,6);
        String part3 = oldNumber.substring(6,10);
        System.out.println("(" + part1 + ") " + part2 + "-" + part3);
        
    }
}
