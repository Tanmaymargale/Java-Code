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

  public void call()
  {
    System.out.println("Call");
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

public class AbstrsctWithReference 
{
  public static void main (String []  args)
  {
    Parent p = new Child();
    p.phone();
    p.ringtone();
    // p.call(); -- error
  }  
}
