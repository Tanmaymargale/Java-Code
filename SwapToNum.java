import java.util.*;

public class SwapToNum 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a;
        a = b ;
        b = c;
        System.out.println("Swap value a is " + a + " and b is "+ b); 
    }
}
