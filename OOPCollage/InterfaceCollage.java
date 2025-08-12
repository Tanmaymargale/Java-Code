import java.util.*;

interface Area
{
  float calculateArea();
}

class Square implements Area
{
  float area;
  int side;
  Square(int side)
  {
    this.side = side;
  }
  public float calculateArea()
  {
    area = side * side;
    return area;
  }
}

class Rectangle implements Area
{
  float area;
  int length , breath;
  Rectangle(int l, int b)
  {
    this.length = l;
    this.breath = b;
  }
  public float calculateArea()
  {
    area = length * breath;
    return area;
  }
}

class Circle implements Area
{
  float area;
  int radius;
  Circle(int radius)
  {
    this.radius = radius;
  }
  public float calculateArea()
  {
    area = 3.14f * radius * radius;
    return area;
  }
}

class Triangle implements Area
{
  float area;
  int length, breath;
  Triangle(int length , int breath)
  {
    this.length = length;
    this.breath = breath;
  }
  public float calculateArea()
  {
    area = 0.5f * length * breath;
    return area;
  }
}

class InterfaceCollage
{
  public static void main(String args [])
  {
    
    Scanner s = new Scanner(System.in);
    System.out.println("1. Area of Triangle.");
    System.out.println("2. Area of Square.");
    System.out.println("3. Area of Circle.");
    System.out.println("4. Area of Rectangle.");
    System.out.println("Enter your choise :- ");
    int ch = s.nextInt();
    // switch(ch)
    // {
    //   case 1:
    //   {
    //     int length , breath;
    //     System.out.println("Enter length:-");
    //     length = s.nextInt();
    //     System.out.println("Enter breath:-");
    //     breath = s.nextInt();
    //     Triangle t = new Triangle(length, breath);
    //     float area = t.calculateArea();
    //     System.out.println("Area is "+ area);
    //   }
    //   case 2:
    //   {
    //     int side;
    //     System.out.println("Enter breath:-");
    //     side = s.nextInt();
    //     Square sq = new Square(side);
    //     float area =   sq.calculateArea();
    //     System.out.println("Area is "+ area);
    //   }
    //   case 3:
    //     int length , breath;
    //     System.out.println("Enter length:-");
    //     length = s.nextInt();
    //     System.out.println("Enter breath:-");
    //     breath = s.nextInt();
    //     Triangle t = new Triangle(length, breath);
    //     float area = t.calculateArea();
    //     System.out.println("Area is "+ area);
    //   case 4:
    //     int length , breath;
    //     System.out.println("Enter length:-");
    //     length = s.nextInt();
    //     System.out.println("Enter breath:-");
    //     breath = s.nextInt();
    //     Triangle t = new Triangle(length, breath);
    //     float area = t.calculateArea();
    //     System.out.println("Area is "+ area);
    // }
  
  }
}