import codewithharshal.access.AccessModifier;

public class World 
{
  public static void main(String [] args)
  {
    AccessModifier c = new AccessModifier();
    System.out.println(c.a);// no error
    System.out.println(c.b);// no error
    System.out.println(c.c);// no error
    System.out.println(c.d);
  }  
}
