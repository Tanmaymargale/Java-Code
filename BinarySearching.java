public class BinarySearching 
{
    static int Binary(int[] arr ,int l,int r , int x)
    {
        
        while(l <= r)
        {
            int mid = (l + r)/2;
            if (arr[mid] == x)
            {
                return mid;
            }
            else if (arr[mid] > x)
            {
                r = mid -1;
            }
            else if (arr[mid] < x)
            {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main (String [] args)
    {
        int[] arr = {2,3,4,5,6,7,8} ;
        int n = arr.length;
        int x = 7;
        int position = Binary(arr,0, n-1 , x);
        if (position != -1 )
        {
            System.out.println("Elemant is at " + position + " position. ");
        }
        else 
        {
            System.out.println("Element is not present.");
        }
    }    
}
