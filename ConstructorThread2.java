class MyThr implements Runnable
{
  public MyThr(String name)
  {
    super();
    System.out.println(name);
  }
  public void run()
  {
    int i = 0;
    while (i < 50)
    {
      System.out.println("HI BROTHER");
      i++;
    }
  }
}

public class ConstructorThread2 
{
  public static void main(String [] args)
  {
    MyThr t = new MyThr("Harshal");// Name of MyThr Constructor
    Thread g = new Thread(t, "HARSHAL");//Name of Thread 
    g.start();
    System.out.println("ID of Thread is " + g.getId());
    System.out.println("Name of Thread is " + g.getName());

  }  
}
