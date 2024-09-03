import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CheckedExceptionDemo 
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        try (FileReader file = new FileReader("D:/test/a.txt");
             BufferedReader fileInput = new BufferedReader(file)) 
             {
            for (int counter = 0; counter < 3; counter++) 
            {
                System.out.println(fileInput.readLine());
            }
        } 
    }
}