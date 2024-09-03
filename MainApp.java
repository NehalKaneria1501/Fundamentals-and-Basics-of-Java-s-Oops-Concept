import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter an expression (numbers and basic arithmetic operators): ");
        final String inputExp = scanner.nextLine();
        Deque<Double> numbers = new LinkedList<>();
        Deque<Character> operations = new LinkedList<>();
        splitExpression(inputExp, numbers, operations);
        Double result = evaluateExpression(numbers, operations);
        System.out.println("Result: " + result);
    }
    private static void splitExpression(String inputExp, Deque<Double> numbers, Deque<Character> operations) 
    {
        int i = 0;
        while (i < inputExp.length()) 
        {
            char ch = inputExp.charAt(i);
            if (Character.isDigit(ch) || ch == '.') 
            {
                StringBuilder numberBuilder = new StringBuilder();
                while(i<inputExp.length()&&(Character.isDigit(inputExp.charAt(i))||inputExp.charAt(i)=='.')) 
                {
                    numberBuilder.append(inputExp.charAt(i));
                    i++;
                }
                numbers.addLast(Double.parseDouble(numberBuilder.toString()));
            } 
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/') 
            {
                if (i == 0 || !Character.isDigit(inputExp.charAt(i - 1))) 
                {
                    operations.addLast('-');
                }
                 else
                  {
                    operations.addLast(ch);
                }
                i++;
            } 
            else 
            {
                System.out.println("Invalid character: " + ch);
                return;  
            }
        }
    }
    private static Double evaluateExpression(Deque<Double> numbers, Deque<Character> operations) 
    {
        if (numbers.size() != operations.size() + 1) 
        {
            System.out.println("Invalid expression format: Number of operands does not match operators.");
            return null; 
        }
        Double result = numbers.pollFirst();
        while (!operations.isEmpty()) 
        {
            char operation = operations.pollFirst();
            Double num = numbers.pollFirst();
            switch (operation) 
            {
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    if (num == 0) 
                    {
                        System.out.println("Error: Division by zero.");
                        return null; 
                    }
                    result /= num;
                    break;
            }
        }
        return result;
    }
}