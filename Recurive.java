public class Recurive 
{
    static int factorial(int fac)
    {
        if (fac == 0 || fac == 1)
        {
            return 1;
        }
        else 
            return fac * factorial(fac - 1);
    }
    public static void main(String [] args)
    {
        int x = 5;
        System.out.println("Factorial of 5 is " + factorial(x));
    }
    
}
