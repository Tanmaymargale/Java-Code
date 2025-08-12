public class GcdOfTwoNum 
{
    public static void main(String [] args)
    {
        int a = 15, b = 10;
        int product = a *b ;
        int lcm = (a>b)? a : b;

        while(true)
        {
            if (lcm % a == 0 && lcm % b == 0)
            {
                break;
            }
            lcm++;
        }
        int gcd = product / lcm;
        System.out.println("GCD is " + gcd);
    }
}
