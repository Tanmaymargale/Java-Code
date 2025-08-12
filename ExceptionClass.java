import java.util.*;

class MyException extends Exception
{
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Harshal";
  }
  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return "Rohit";
  }
}

public class ExceptionClass 
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a;
    System.out.println("Enter a number :");
    a = s.nextInt();
    if (a<9)
    {
      try 
      {
        System.out.println("Try");
        throw new MyException();
      }
      catch (Exception e)
      {
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        System.out.println(e);
      }
    }
  }  
}
