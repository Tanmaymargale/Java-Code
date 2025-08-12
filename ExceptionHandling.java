import java.util.*;

public class ExceptionHandling 
{
  public static void main(String [] args)
  {
    int[] marks = new int[5];
    int ind , value, divisor;
    Scanner s = new Scanner(System.in);
    try
    {
      System.out.println("Enter a index :");
      ind = s.nextInt();
      System.out.println("Enter value of that index : ");
      value = s.nextInt();
      System.out.println("Enter a value of divisor : ");
      divisor = s.nextInt();
      try
      {
        marks[ind] = value;
        try
        {
          System.out.println("Value of " +ind + " index is " + marks[ind]/divisor);
        }
        catch (ArithmeticException e)
        {
          System.out.println("Cannot divided by zero.");
          System.out.println(e);
        }
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Index is larger than declared");
        System.out.println(e);
      }
    }
    catch (InputMismatchException e)
    {
      System.out.println("Enter only number.");
      System.out.println(e);
    }
  }
}
