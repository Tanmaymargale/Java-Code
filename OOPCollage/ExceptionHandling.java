import java.util.*;

public class ExceptionHandling {
  public static void main (String args [])
  {
    Scanner s = new Scanner(System.in );
    int []arr = new int[5];
    for (int i = 0; i<5; i++)
      {
        System.out.print("Enter num:- ");
        arr[i] = s.nextInt();
      }
    try 
    {

      int result = arr[1] / 0;
      try 
      {
        System.out.println(arr[5]);
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array size is less than 5.");
      }
      
    }
    catch(ArithmeticException e)
    {
      System.out.println("Cannot divided by zero.");
    }
    
  }
  
}
