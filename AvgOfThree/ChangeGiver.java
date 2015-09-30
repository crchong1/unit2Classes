
import java.util.Scanner;

public class ChangeGiver
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert dollar amount: ");
        double number = input.nextDouble();
        int newNumber = (int) 100*number;
        
        int dollars = newNumber / 100;
        int remainderOfQuarters = newNumber%100;
        int quarters = remainderOfQuarters/25;
        int remainderOfDimes = remainderOfQuarters%25;
        int dimes = remainderOfDimes / 10;
        int remainderOfNickels = remainderOfDimes%10;
        int nickels = remainderOfNickels / 5;
        int remainderOfPennies = ;
        
        
        
        
        
        
    }    
}
