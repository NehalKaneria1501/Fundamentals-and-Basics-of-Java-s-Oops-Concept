import java.util.Scanner;
public class DetectInteger
{
    Scanner scanner=new Scanner(System.in);
    if(Scanner.hasNextInt());
    {
        System.out.println("Please enter a number:");
        if(scanner.hasNextInt())
        {
            int number=scanner.nextInt();
            System.out.println("You entered the integer:"+number);
        }
        else
        {
            System.out.println("The input is not an integer:"+number);
        }
        sc.close();
    }
}