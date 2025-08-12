abstract class Parent
{
  public void phone()
  {
    System.out.println("Good Morning");
  }
  abstract public void ringtone();
}

class Child extends Parent
{
  @Override
  public void ringtone()
  {
    System.out.println("Dhoom ma chale");
  }
}

class Child2 extends Parent
{
  @Override
  public void ringtone()
  {
    System.out.println("baby");
  }
}

public class AbstrsctClass 
{
  public static void main(String [] args)
  {
    // Parent p = new Parent(); -- error
    Child c1 = new Child();
    c1.ringtone();
    Child2 c2 = new Child2();
    c2.ringtone();
  } 
}
