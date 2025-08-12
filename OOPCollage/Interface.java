/*Design and develop a context for given case study and implement an interface 
for Vehicles Consider the example of vehicles like bicycle, car and bike. All 
Vehicles have common functionalities such as Gear Change, Speed up and 
apply breaks. Make an interface and put all these common functionalities. 
Bicycle, Bike, Car classes should be implemented for all these functionalities 
in their own class in their own way */

interface Vehicles
{
  public void gearChange();
  public void speedUp();
  public void applyBreak();
}

class Bicycle
{
  public void gearChange()
  {
    System.out.println("Bicycle Gear Change.");
  }
  public void speedUp()
  {
    System.out.println("Bicycle Speed Up");
  }
  public void applyBreak()
  {
    System.out.println("Bicycle Apply Break");
  }
}

class Bike
{
  public void gearChange()
  {
    System.out.println("Bike Gear Change.");
  }
  public void sppedUp()
  {
    System.out.println("Bike Speed Up");
  }
  public void applyBreak()
  {
    System.out.println("Bike Apply Break");
  }
}

class Car
{
  public void gearChange()
  {
    System.out.println("Car Gear Change.");
  }
  public void sppedUp()
  {
    System.out.println("Car Speed Up");
  }
  public void applyBreak()
  {
    System.out.println("Car Apply Break");
  }
}

public class Interface {
  public static void main(String args[])
  {
    Bicycle b = new Bicycle();
    b.applyBreak();
    b.gearChange();
    b.speedUp();
  }
  
}
