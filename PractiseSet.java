package pac;
import java.util.*;

class Calculator
{
  public Calculator(int a, int b)
  {
    System.out.println("Addition is " + (a+b));
  }
}

class ScCalculator
{
  public ScCalculator(int a, int b)
  {
    System.out.println("Addition is " + (a+b));
  }
}

class HybridCalculator
{
  public HybridCalculator(int a, int b)
  {
    System.out.println("Addition is " + (a+b));
  }
}

public class PractiseSet 
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number :");
    int a = s.nextInt();
    System.out.println("Enter second number :");
    int b = s.nextInt();
    Calculator c = new Calculator(a,b);
    ScCalculator sc = new ScCalculator(a,b);
    HybridCalculator hc = new HybridCalculator(a,b);
  }
}
