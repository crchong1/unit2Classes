
import java.util.Scanner;

public class ChangeGiver
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert dollar amount: ");
        double number = input.nextDouble();
        number = number*100.0;
        int newNumber = (int) number;
        
        int dollars = newNumber / 100;
        int remainderOfQuarters = newNumber%100;
        int quarters = remainderOfQuarters/25;
        int remainderOfDimes = remainderOfQuarters%25;
        int dimes = remainderOfDimes / 10;
        int remainderOfNickels = remainderOfDimes%10;
        int nickels = remainderOfNickels / 5;
        int pennies = remainderOfNickels%5;
        
        System.out.println("The number of dollars is: " + dollars);
        System.out.println("The number of quarters is: " + quarters);
        System.out.println("The number of dimes is: " + dimes);
        System.out.println("The number of nickels is: " + nickels);
        System.out.println("The number of pennies is: " + pennies);

    }    
}
