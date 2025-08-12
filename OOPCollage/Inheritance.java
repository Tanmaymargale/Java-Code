class Animal
{
  private String eats;
  private int noOfLegs;
  private boolean isVeg;

  public Animal(String eats, int noOfLegs, boolean isVeg)
  {
    this.eats = eats;
    this.noOfLegs = noOfLegs;
    this.isVeg = isVeg;
  }

  void setEats(String eats)
  {
    this.eats = eats;
  }
  String getEats()
  {
    return eats;
  }

  void setNoOfLegs(int noOfLegs)
  {
    this.noOfLegs = noOfLegs;
  }
  int getNoOfLegs()
  {
    return noOfLegs;
  }

  void setIsVeg(boolean isVeg)
  {
    this.isVeg = isVeg;
  }
  boolean getIsVeg()
  {
    return isVeg;
  }
}

class Cat extends Animal
{
  
  private String skinColor;
  public Cat(String eats, int noOfLegs, boolean isVeg,String skinColor)
  {
    super(eats, noOfLegs, isVeg );
    this.skinColor = skinColor;
  }

  void setSkinColor(String skinColor)
  {
    this.skinColor = skinColor;
  }
  String getSkinColor()
  {
    return skinColor;
  }

}


public class Inheritance {
  public static void main(String args [])
  {
    Cat c = new Cat("Meat" , 4,false,"White");
    System.out.println(c.getEats());
    System.out.println(c.getNoOfLegs());
    System.out.println(c.getIsVeg());
    System.out.println(c.getSkinColor());
  }
}
