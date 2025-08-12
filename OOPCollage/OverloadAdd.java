class Calculator
{
  int result = 0;
  int add(int a1, int b1)
  {
    return a1 + b1;
  }

  int add(int a2, int b2, int c2)
  {
    return a2 + b2 + c2;
  }
  float add(float a3, float b3)
  {
    return a3 + b3;
  }
  float add(float a4,float b4, float c4)
  {
    return a4 + b4 + c4;
  }
  // int sum(int ...num)
  // {
  //   for (int value : num)
  //   {
  //     result = result + value;
  //   }
  //   return result;
  // }
}

public class OverloadAdd {
  public static void main(String args[])
  {
    Calculator c = new Calculator();
    System.out.println("Sum is " + c.add(3,5));
    System.out.println("Sum is " + c.add(3,4,5));
    System.out.println("Sum is " + c.add(2.3f,3.7f));
    System.out.println("Sum is " + c.add(3.4f,5.6f,4.5f));
    // System.out.println("Sum is " + c.sum(4,5,6,7,8,3,4,2));
  }
}
