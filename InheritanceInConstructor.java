// Constructor of a Base can not be write in Derived 
// constructor of a one class cannot be writen in another class.
// if we make a object of derived class of then a its execute a Base class constructor first and then derived class constructor.
// super tells us which constructor is execute of a Base class. 
class Base
{
    int x;
    public void getValue(int a)
    {
        this.x = a;
        System.out.println(this);
    }
    public Base()
    {
        System.out.println("Hi I am a Base");
    }

    public Base(int a)
    {
        System.out.println("a is " + a);
    }
}

class Derived1 extends Base
{
    public Derived1()
    {
        System.out.println("Hi I am a Derived class 1");
    }
    public Derived1(int b)
    {
        System.out.println("b is " + b);
    }
}

class Derived2 extends Derived1
{
    public Derived2()
    {
        System.out.println("Hi I am a Derived class 2");
    }
    public Derived2(int c)
    {
        super(2);
        System.out.println("c is " + c);
    }
}

public class InheritanceInConstructor 
{
    public static void main (String [] args)
    {
        Derived2 d = new Derived2(1);
        d.getValue(5);
    } 
}
