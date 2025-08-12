public class FibonnaciSeries 
{
    static int fibonnaci(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
        {
            return fibonnaci(n -1) + fibonnaci(n - 2);
        }
    }
    public static void main (String [] args)
    {
        int x = 8;
        System.out.println("Fabonnaci number is " + fibonnaci(x));
    }
    
}
