
import java.util.Scanner;
/**
 * Input sides of rectangle and get area and perimeter and diagonal
 * 
 * @author Connor Chong 
 * @version 9/30/15
 */
public class Rectangle
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
    
        System.out.print("What is the length?");
        double length = s.nextDouble(); 
    
        System.out.println();
        System.out.print("What is the width?");
        double width = s.nextDouble(); 
    
        double area = length*width;
        double perimeter = 2*(length + width);
    
    
        System.out.println();
        System.out.print("The area of the rectangle is: ");
        System.out.printf("%.2f%n", area);
        System.out.println("The perimeter of the rectangle is: ");
        System.out.printf("%.2f%n", perimeter);
        
        double diagonal = Math.sqrt(Math.pow(length, 2)+ Math.pow(width, 2));
        System.out.println("The diagonal of the rectangle is: ");
        System.out.printf("%.2f%n", diagonal);
    }
}