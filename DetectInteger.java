import java.util.Scanner;
public class DetectInteger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        if (sc.hasNextInt()) 
        {
            int number = sc.nextInt();
            System.out.println("You entered the integer: " + number);
        } 
        else 
        {
            System.out.println("That is not an integer.");
        }
        sc.close();
    }
}