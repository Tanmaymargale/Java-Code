class Rectangle
{
    public int length, breath;

    public Rectangle()
    {
        this.length = 5;
        this.breath = 7;
    }
    public Rectangle(int l, int b)
    {
        this.length = l;
        this.breath = b;
    }
    public int len()
    {
        return length;
    }
    public int bre()
    {
        return breath;
    }
}

public class Exercise34 
{
    public static void main (String [] args)
    {
        Rectangle r = new Rectangle();
        System.out.println("length is " + r.len());
        System.out.println("Breath is " + r.bre());

        Rectangle h = new Rectangle(2,3);
        System.out.println("length is " + h.len());
        System.out.println("Breath is " + h.bre());
    }    
}
