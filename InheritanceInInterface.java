interface Interface1
{
  void meth1();
  void meth2();
}

interface Interface2 extends Interface1
{
  void meth3();
  void meth4();
}

class MySampleClass implements Interface2
{
  public void meth3()
  {
    System.out.println("Meth 3");
  }
  public void meth4()
  {
    System.out.println("Meth 4");
  }
  public void meth1()
  {
    System.out.println("Meth 1");
  }
  public void meth2()
  {
    System.out.println("Meth 2");
  }
}

public class InheritanceInInterface 
{
  public static void main(String [] args)
  {
    MySampleClass m = new MySampleClass();
    m.meth1();
    m.meth2();
    m.meth3();
    m.meth4();
  }
}
