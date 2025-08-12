// syntax - BaseName objName = new DerivedName
// All methods of Parent class will be executed but When overriding is happen then 
// child class method is executed 
// Methods of child class cannot be executed

class Phone
{
  public void Time()
  {
    System.out.println("Time is 8 am.");
  }
  public void on()
  {
    System.out.println("Phone Start");
  }
}

class SmartPhone extends Phone
{
  public void on()
  {
    System.out.println("SmartPhone Start.");
  }
  public void date()
  {
    System.out.println("Date is 30 Dec.");
  }
}

public class DynamicMemoryDispatch 
{
  public static void main(String [] args)
  {
    // phone -> reference , obj -> object of Smartphone
    Phone obj = new SmartPhone();// This wil happen during runtime.
    obj.Time();
    obj.on();
    // obj.Date(); - It will gives an error, Not allowed
  } 
}
