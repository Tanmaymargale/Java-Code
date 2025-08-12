// Extending class Thread
// At a time one process execute but concurantly
class MyThread1 extends Thread
{
  public void run()
  {
    int i = 0;
    while (i < 200)
    {
      System.out.println("Harshal");
      i++;
    }
  }
}

class MyThread2 extends Thread
{
  public void run()
  {
    int i = 0;
    while (i < 200)
    {
      System.out.println("Brother");
      i++;
    }
  }
}

class ThreadCreat1
{
  public static void main(String [] args)
  {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
  }
}