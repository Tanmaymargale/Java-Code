import java.util.*;

class AgeExceptionFailure extends Exception 
{
  public AgeExceptionFailure(String message)
  {
    super(message);
  }
}

public class AgeException {
  public static void main(String args[]) throws AgeExceptionFailure
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your age.");
    int age = s.nextInt();
    if (age < 18)
    {
      throw new AgeExceptionFailure("Age must be greater than or equal to 18.");
    }
    else 
    {
      System.out.println("Eligilable for voting.");

    }
  }
}
