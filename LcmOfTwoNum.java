import java.util.Scanner;

public class LcmOfTwoNum 
{
    public static void main(String [] args)
    {
        int a = 4, b = 10;
        int ans = (a>b)? a : b;

        while(true)
        {
            if (ans % a == 0 && ans % b == 0)
            {
                break;
            }
            ans++;
        }
        System.out.println("LCM is " + ans);
    }
}
