abstract class Student 
{
  String name;
  double SSC;
  double HSC;

  public abstract String getname();
  public abstract double getSSC();
  public abstract double getHSC();

}

class Harish extends Student
{
  public Harish(String name,double SSC,double HSC)
  {
    this.name = name;
    this.SSC = SSC;
    this.HSC = HSC;
  }
  public String getname()
  {
    return name;
  }
  public double getSSC()
  {
    return SSC;
  }
  public double getHSC() 
  {
    return HSC;
  }
}

class Jayant extends Student
{
  public Jayant(String name,double SSC,double HSC)
  {
    this.name = name;
    this.SSC = SSC;
    this.HSC = HSC;
  }
  public String getname()
  {
    return name;
  }
  public double getSSC()
  {
    return SSC;
  }
  public double getHSC() 
  {
    return HSC;
  }
}

class Vijay extends Student
{
  public Vijay(String name,double SSC,double HSC)
  {
    this.name = name;
    this.SSC = SSC;
    this.HSC = HSC;
  }
  public String getname()
  {
    return name;
  }
  public double getSSC()
  {
    return SSC;
  }
  public double getHSC() 
  {
    return HSC;
  }
}


public class Abstract {
  public static void main(String args [])
  {
    Harish h = new Harish("harish",460,490);
    System.out.println(h.getname());
    System.out.println(h.getSSC());
    System.out.println(h.getHSC()); 
  }
}
