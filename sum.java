import java.util.Scanner;

public class sum {
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first num : ");
    int a = s.nextInt();
    System.out.println("Enter second num : ");
    int b = s.nextInt();
    int sum = a + b;
    System.out.println("Sum is " + sum);
  }
}
