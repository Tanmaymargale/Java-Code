import java.util.*;

public class MultiplyFloat 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a frist float value : ");
        float flo1 = s.nextFloat();
        System.out.println("Enter a Second float value : ");
        float flo2 = s.nextFloat();
        float res = flo1 * flo2;
        System.out.println("Multiplaction is " + res);
    }
}
