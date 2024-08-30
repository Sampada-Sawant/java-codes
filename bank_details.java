import java.util.*;
import java.lang.*;
import java.io.*;


public class Bank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Details[] obj = new Details[100];

        System.out.println("How many users are/will be in the Cooperative bank : ");
        int users = sc.nextInt();

        for(int i = 1; i <= users; i++)
        {
            obj[i] = new Details();
        }

        System.out.println("\nTo deposit or withdraw money from account.");
        for (int i = 1; i <= users; i++)
        {
            System.out.print("User "+i+" : Do you want to create an account ? Type N if your account already exists & Y if you are a new user. (Y/N) : ");
            char account = sc.next().charAt(0);

            if (account == 'Y')
            {
                obj[i].addAccount();
                System.out.print("Account created.\nSelect the option number you want to perform :\n1.Withdraw Amount.\n2.Deposit Amount.\nOption : ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        obj[i].withdraw();
                        break;

                    case 2:
                        obj[i].deposit();
                }
            } else if (account == 'N')
            {
                obj[i].Account();
                System.out.print("Account already exists.\nSelect the option number you want to perform :\n1.Withdraw Amount.\n2.Deposit Amount.\nOption : ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        obj[i].withdraw();
                        break;

                    case 2:
                        obj[i].deposit();
                }
            } else
            {
                System.out.println("Please enter a valid option (Y/N)");
            }

        }

        System.out.println("\nTo remove an account from the Cooperative bank :\nInput data of users in the database of bank. ");
        for (int i = 1; i <= users; i++)
        {
            obj[i].addAccount();
        }
        System.out.println("\nEnter the account name you want to remove from the Cooperative bank : ");
        String remAccount = sc.next();

    }

}

class Details
{
    Scanner sc = new Scanner(System.in);
    private String name;
    private long accountNumber;
    private String panNum;
    private long balance;
    private long withdrawAmt;
    private long depoAmt;


    public void addAccount()
    {
        System.out.println("Enter account holder name = ");
        name = sc.nextLine();
        System.out.println("Enter account number = ");
        accountNumber = sc.nextLong();
        System.out.println("Enter balance = ");
        balance = sc.nextLong();
        System.out.println("Enter pan number = ");
        panNum = sc.next();

        System.out.println(name+"'s account is having balance : "+balance+"/-");
    }

    public void Account()
    {
        //data stored in the database.
        name="Sampada Sawant.";
        accountNumber= 123456;
        panNum="123BTREW709";
        balance=2500000;

        System.out.println("Account holder name = Sampada Sawant ");
        System.out.println("Account number = 123456 ");
        System.out.println("Account balance = 2500000/- ");
        System.out.println("Account pan number = 123BTREW709 ");

        System.out.println(name+"'s account exists having balance : "+balance+"/-");
    }

    public void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn = ");
        withdrawAmt = sc.nextLong();

        if(withdrawAmt <= balance)
        {
            balance -= withdrawAmt;
            System.out.println("Withdraw amount is successful");
            System.out.println("Balance left in account number "+accountNumber+" is : "+balance+"/-");
        }
        else
        {
            System.out.println("Insufficient balance.");
        }

    }

    public void deposit()
    {
        System.out.println("Enter the amount to deposit = ");
        depoAmt = sc.nextLong();

        balance += depoAmt;
        System.out.println("Deposit amount is successful");
        System.out.println("Balance left in account number "+accountNumber+" is : "+balance+"/-");
    }


}

