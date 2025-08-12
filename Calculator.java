import java.util.*;

public class Calculator 
{
    static float add(float ...arr)
    {
        float sum = 0;
        for (float a:arr)
        {
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int[] arr;
        int i = 0;
        while (i == "/n")
        {
            arr[i] = s.nextFloat();
            i++;
        }
        System.out.println("Sum is " + add(arr));
    }
    
}
