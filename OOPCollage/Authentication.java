/*Write a program to accept the password from user and throw 
‘AuthenticationFailure’ exception if the password is incorrect.
*/
import java.util.*;

class AuthenticationFailure extends Exception 
{
  public AuthenticationFailure(String message)
  {
    super(message);
  }
}

public class Authentication 
{
  public static void main(String args[]) throws AuthenticationFailure
  {
    Scanner s = new Scanner(System.in);
    String correctPass = "Harsh!@#$";
    System.out.print("Enter Password:- ");
    String enterPass = s.nextLine();
    if ((enterPass.compareTo(correctPass)) != 0)
    {
      throw new AuthenticationFailure("Password is incorrect.");
    }
    else 
    {
      System.out.println("Password is correct.");
    }
  }
}
