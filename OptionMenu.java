import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account 
{ 
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();
    public void getLogin() throws IOException 
    {
        int x = 1;
        do 
        {
            try 
            {
                data.put(952141, 191904);
                data.put(989947, 71976);
                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your customer Number:");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your PIN Number:");
                setPinNumber(menuInput.nextInt());
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid Character(s). Only Numbers.\n");
                x = 2;
                menuInput.nextLine(); 
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn).equals(pn)) 
            {
                getAccountType();
            } 
            else 
            {
                System.out.println("Wrong Customer Number or Pin Number\n");
            }
        } 
        while (x == 1);
    }
    public void getAccountType() 
    {
        System.out.println("Select the Account you Want to Access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice:");
        int selection = menuInput.nextInt();
        switch (selection) 
        {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                getCheckingDepositInput();
                break;
            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                break;
            default:
                System.out.println("Invalid Choice.\n");
                getAccountType();
        }
    }
    public void getChecking() 
    {
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice:");
        int selection = menuInput.nextInt();
        switch (selection) 
        {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using the ATM, bye.");
                break;
            default:
                System.out.println("Invalid Choice.\n");
                getChecking();
        }
    }
    public void getSaving() 
    {
        System.out.println("Saving Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice:");
        int selection = menuInput.nextInt();
        switch (selection) 
        {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using the ATM, bye.");
                break;
            default:
                System.out.println("Invalid Choice.\n");
                getSaving();
        }
    }
    private double getCheckingBalance() 
    {
        return 1000.00; 
    }
    private double getSavingBalance() 
    {
        return 2000.00; 
    }
    private void getCheckingWithdrawInput() 
    {
        System.out.println("Enter amount to withdraw:");
        double amount = menuInput.nextDouble();
    }
    private void getCheckingDepositInput() 
    {
        System.out.println("Enter amount to deposit:");
        double amount = menuInput.nextDouble();
    }
    private void getSavingWithdrawInput() 
    {
        System.out.println("Enter amount to withdraw:");
        double amount = menuInput.nextDouble();
    }
    private void getSavingDepositInput() 
    {
        System.out.println("Enter amount to deposit:");
        double amount = menuInput.nextDouble();
    }
    private void setCustomerNumber(int customerNumber) 
    {
    }
    private void setPinNumber(int pinNumber) 
    {
    }
    private int getCustomerNumber() 
    {
        return 0;
    }
    private int getPinNumber() 
    {
        return 0;
    }
    public static void main(String[] args) throws IOException 
    {
        OptionMenu atm = new OptionMenu();
        atm.getLogin();
    }
}