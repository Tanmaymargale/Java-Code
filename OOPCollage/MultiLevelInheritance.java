/*Write a program to implement the following Multi Level Inheritance: 
Class: Account 
Cust_name , acc_no 
 
Class: Saving_Acc 
Min_bal, saving_bal

Class:Acct_Details 
Deposits, withdrawals
 */
import java.util.*;

class Account
{
  Scanner s = new Scanner(System.in);
  String cust_name;
  double acc_no;
  public void getDetails1()
  {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter costumer name :- ");
    cust_name = s.nextLine();

    System.out.print("Enter account no. :- ");
    acc_no = s.nextDouble();
  }

  void displayDetails1()
  {
    System.out.println("Accounter name is " + cust_name);
    System.out.println("Account no. :- " + acc_no);
  }
}

class Saving_Acc extends Account
{
  double Min_bal;
  double saving_bal;
  void getDetails2()
  {
    System.out.println("Enter your minimum balance :- ");
    Min_bal = s.nextDouble();

    System.out.println("Enter saving balance :- ");
    saving_bal = s.nextDouble();

  }

  void displayDetails2()
  {
    System.out.println("Enter ")
  }
}

class Acct_Details extends Saving_Acc
{

}

public class MultiLevelInheritance {
  public static void main(String args [])
  {
    Account a = new Account();
  }
}
