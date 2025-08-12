class Base
{
    int x;

    public Base()
    {
        System.out.println("I am a Base class");
    }
}

class Derived extends Base
{
    int y;
    public Derived()
    {
        System.out.println("I am a Derived class");
    }
    public void setValue(int x)
    {
        this.x = x;
    }
    public int getValue()
    {
        return x;
    }

}

public class Inheritance 
{
    public static void main (String [] args)
    {
        Derived d = new Derived();
        d.setValue(5);
        System.out.println(d.getValue());
    }

}
