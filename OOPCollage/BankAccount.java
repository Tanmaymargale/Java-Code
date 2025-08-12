import java.util.*;

public class BankAccount {
  public static void main(String args[])
  {
    int ch ;
    double amount;
    double balance = 0;
    Scanner s = new Scanner(System.in);
    do
    {
      System.out.println("1. Money Deposite.");
      System.out.println("2. Money Withdraw");
      System.out.println("3. Chaeck Balance");
      System.out.println("4.Quit");
      System.out.println("Enter your choise:- ");
      ch = s.nextInt();
      switch (ch)
      {
        case 1:
          System.out.println("Enter a deposite amount :- ");
          amount = s.nextDouble();
          if (amount <= 0)
          {
            System.out.println("Nonpositive amount cannot be added.");
          }
          else 
          {
            balance = balance + amount;
            System.out.println("Your amount is added into your account.");
          }
        case 2:
          System.out.println("Enter a withdraw amount :-");
          amount = s.nextDouble();
          if ( amount <=0 || amount > balance )
          {
            System.out.println("Not sufficient balance.");
          }
          else
          {
            balance = balance - amount;
            System.out.println("Money is withdraw.");
          }
        case 3:
          System.out.println("Balance is " + balance);
        case 4:
          return;

      }
    }while(ch != 4);
  }  
}
