class MyThr extends Thread 
{
  public MyThr(String name)
  {
    super(name);
  }
  public void run()
  {
    int i = 0;
    // while (i < 100)
    // {
    //   System.out.println("HI");
    //   i++;
    // }
  }
}

public class ConstructorThread 
{
  public static void main(String [] args)
  {
    MyThr t = new MyThr("Harshal");
    MyThr t2 = new MyThr("Bro");
    t.start();
    t2.start();
    System.out.println("Id of Thread is : " + t.getId());
    System.out.println("name of Thread is : " + t.getName());
    System.out.println("Id of Thread is : " + t2.getId());
    System.out.println("name of Thread is : " + t2.getName());
  } 
}
