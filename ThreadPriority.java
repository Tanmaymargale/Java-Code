class MyThr extends Thread 
{
  public MyThr(String name)
  {
    super(name);
  }
  public void run()
  {
    int i = 0;
    while (i < 100)
    {
      System.out.println("name of Thread is : " + this.getName());
      i++;
    }
  }
}

class ThreadPriority
{
  public static void main(String [] args)
  {
    MyThr t = new MyThr("1");
    MyThr t2 = new MyThr("23");
    MyThr t3 = new MyThr("345");
    MyThr t4 = new MyThr("4567");
    MyThr t5 = new MyThr("67894");
    t.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MAX_PRIORITY);
    t5.setPriority(Thread.MIN_PRIORITY);
    t.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}