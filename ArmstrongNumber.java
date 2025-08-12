public class ArmstrongNumber 
{
    public static void main(String [] args)
    {
        int var = 153;
        int res = 0,q;
        int copy = var;
        for (int i = 0; var != 0; i++)
        {
            q = var % 10;
            res = res + q*q*q;
            var = var /10;
        }
        
        if (copy == res)
        {
            System.out.println("It is a Amstrong number.");
        }
        else 
        {
            System.out.println("It is not a Amstrong number.");
        } 
    }
}
