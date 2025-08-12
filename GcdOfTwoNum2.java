public class GcdOfTwoNum2 
{
    static int GCD(int x, int y)
    {
        if (x == 0)
            return y;

        if (y == 0)
            return x;
        
        if (x == y)
            return x;

        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y-x);
    }
    public static void main(String [] srgs)
    {
        int a = 15 , b = 10;
        System.out.println("Gcd is " + GCD(a,b)); 
    }
}
