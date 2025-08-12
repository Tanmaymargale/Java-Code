public class VarArgs 
{
    static int sum(int ...arr)
    {
        int result = 0;
        for (int a:arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String [] args)
    {
        int a = 1, b= 2, c =3 , d= 4;
        System.out.println("sum of two number is " + sum(a,b));
        System.out.println("sum of two number is " + sum(a,b,c));
        System.out.println("sum of two number is " + sum(a,b,c,d));
        System.out.println("sum of two number is " + sum());
    }
}
