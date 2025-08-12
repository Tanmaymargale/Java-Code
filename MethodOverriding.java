class A
{
  public void meth1()
  {
    System.out.println("Meth 1 in A.");
  }
  public void meth2()
  {
    System.out.println("Meth 2 in A.");
  }
}

class B extends A
{
  @Override
  public void meth2()
  {
    System.out.println("Meth 2 in B.");
  }
}

public class MethodOverriding 
{
  public static void main(String [] args)
  {
    B b = new B();
    b.meth1();
    b.meth2();
  }
}
