public class LinearSearching 
{
    static int Linar(int array[], int n ,int x)
    {
        for (int i = 0; i < n; i++)
        {
            if (array[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main (String [] args)
    {
        int[] arr = {3,5,6,4,2,7,8} ;
        int n = arr.length;
        int x = 7;
        int position = Linar(arr, n, x);
        if (position != -1 )
        {
            System.out.println("Elemant is at " + position + " position.");
        }
        else if(position == -1)
        {
            System.out.println("Element is not present in list.");        }
    }    
}
