import java.util.*;

public class PrimeNumber 
{
    static boolean Prime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter to check a number is prime or not :");
        num = s.nextInt();
        if (Prime(num) == true)
        {
            System.out.println(num + "is a prime number ");
        }
        else 
        {
            System.out.println(num + " is not a prime number");
        }
    }
}
