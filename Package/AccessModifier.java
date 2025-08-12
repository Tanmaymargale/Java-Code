package codewithharshal.access;
//codewithharshal.access is another package w.r.t codeeithharshal.game and codewithharshal.gym 

class C1
{
  public int a = 10;
  protected int b = 20;
  int c = 30;
  private int d = 40;
  // void use()
  // {
    // Same Class
  //   System.out.println(a);// no error
  //   System.out.println(b);// no error
  //   System.out.println(c);// no error
  //   System.out.println(d);// no error
  // }
}

public class AccessModifier 
{
  public static void main(String [] args)
  {
    C1 c = new C1();
    // c.use();
    // Same Package
    // System.out.println(c.a);// no error
    // System.out.println(c.b);// no error
    // System.out.println(c.c);// no error
    // System.out.println(c1.d);// --> Give error
  }
}
