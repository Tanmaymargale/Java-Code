public class LinearSearchRecursively 
{
    static int recursiveSearch(int[] arr,int l, int r, int x)
    {
        while (l <= r)
        {
            if (arr[l] == x)
                return l;
            else if (arr[r] == x)
                return r;
            else
                return recursiveSearch(arr, l+1,r -1, x);
        }
        return -1;
    }
    public static void main(String [] args)
    {
        int[] arr = { 25, 60, 18, 3, 10 };
        int x = 18;
        int res = recursiveSearch(arr,0 , arr.length-1, x);  
        if (res != -1)
        {
            System.out.println("Elemant is at " + res + " position. ");
        }
        else 
        {
            System.out.println("Element is not present.");
        }
    }    
}
