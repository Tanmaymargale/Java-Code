import java.util.*;

class ExceptionHandling2
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int[] arr = {2,3,4,5,6,7,7,89,1};
    while (true)
    {
      try
      {
        System.out.println("Enter a index : ");
        int index = s.nextInt();
        try 
        {
          System.out.println("Value of that index is " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
          System.out.println("Index is larger than declared");
          System.out.println(e);
          break;
        }
      }
      catch (InputMismatchException e)
      {
        System.out.println("Entered only number.");
        System.out.println(e);
        break;
      }
    }
  }
}