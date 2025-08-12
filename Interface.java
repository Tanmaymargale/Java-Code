/**
 * It's object cannot be created but it's references is created
 * In interface all methods are abstract but in abrtract class some method are abstract
 * We cannot extends multiple abstract class but we can implement multiple interface at a time for a one class
 * Methods of interface must be public in its interface class
 * You can create properties in interfaces but you cannot modify the properties in interface as they are final.
 */
interface Bicycle
{
  int power = 1000;
  int speedUp(int increament);
  int brakeApply(int decreament);
  void brake();
}
interface Light
{
  void color();
}

class OneBicycle implements Bicycle , Light
{
  int speed = 8;
  public int speedUp(int increament)
  {
    speed = speed + increament;
    return speed;
  }
  public int brakeApply(int decreament)
  {
    speed = speed + decreament;
    return speed;
  }
  public void color()
  {
    System.out.println("Red color");
  }
  public void brake()
  {
    System.out.println("Print");
  }
}

public class Interface 
{
  public static void main(String [] args)
  {
    OneBicycle o = new OneBicycle();
    System.out.println("increase speed is " + o.speedUp(3));
    System.out.println("decreace speed is " + o.brakeApply(3));
    o.color();
    o.brake();
    System.out.println(o.power);

    Bicycle b = new OneBicycle();
    System.out.println("increase speed is " + b.speedUp(3));
    System.out.println("decrease speed is " + b.brakeApply(3));
    // b.color(); -- error
  }
}
