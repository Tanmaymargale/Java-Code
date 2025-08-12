/*16)Create a class Employee having data members empID, name, salary and 
experience. Using array of objects print the above data. */

class Employee
{
  String emlID;
  String name;
  double salary;
  int experience;
  public Employee(String emlID, String name, double salary, int experience)
  {
    this.emlID = emlID;
    this.name = name;
    this.salary = salary;
    this.experience = experience;
  }

  void display()
  {
    System.out.println(name + " \t "+ emlID+ " \t "+salary+" \t " +experience);
    System.out.println("Name \t Email ID \t Salary \t Experience ");
  }
}

public class EmployeeExample {
  public static void main(String args[])
  {
    Employee[] emp = new Employee[4];
    emp[0] = new Employee("hagdk","agfjk",78342,2);

  }  
}
