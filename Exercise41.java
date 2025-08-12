class Monkey
{
  void jump()
  {
    System.out.println("Jump");
  }
  void bite()
  {
    System.out.println("Bite");
  }
}

interface BasicAnimal
{
  void eat();
  void sleep();
}

class Human extends Monkey implements BasicAnimal
{
  public void eat()
  {
    System.out.println("Eat");
  }
  public void sleep()
  {
    System.out.println("Sleep");
  }
}

public class Exercise41  
{
  public static void main (String [] args)
  {
    
  }  
}
