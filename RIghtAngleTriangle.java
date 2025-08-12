public class RIghtAngleTriangle 
{
    public static void main(String [] args)
    {
        int n = 5;
        for (int i = 1; i <= n ; i++)
        {
                int k = n - i;;
                while (k != 0)
                {
                    System.out.print(" ");
                    k--;
                }
                for (int j = 1; j <= i; j++)
                {
                System.out.print("*");
                }
                System.out.println();
        }
    }
    
}
