/*Design a base class shape with two double type values and member functions 
to input the data and compute_area() for calculating area of shape. Derive two 
classes: triangle and rectangle. Make compute_area() as abstract function and 
redefine this function in the derived class to suit their requirements. Write a 
program that accepts dimensions of triangle/rectangle and display calculated 
area.*/ 

import java.util.*;
abstract class Shape
{
  double length;
  double breath;
  abstract double compute_area(double length, double breath);
}

class Triangle extends Shape
{
  double compute_area(double length, double breath)
  {
    double area = 0.5 * length * breath;
    return area;
  }
}

class Rectangle extends Shape
{
  double compute_area(double length, double breath)
  {
    double area = length * breath;
    return area;
  }
}

public class Abstract4 {

  public static void main (String args [])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your length:- ");
    double l = s.nextDouble();
    System.out.println("Enter your breath:- ");
    double b = s.nextDouble();
    Triangle t = new Triangle();
    System.out.println("Area of triangle is " + t.compute_area(l,b));
    Rectangle r = new Rectangle();
    System.out.println("Area of rectangle is " + r.compute_area(l,b));


  }
}
