/*Define a class student with four data members such as name, roll no, sub1 and 
sub2. Define appropriate methods to INITITALIZE AND DISPLAY
VALUES OF DATA MEMBERS also calculate total marks and percentage 
scored by student in three subjects. */
import java.util.*;

class Student
{
  String name;
  int rollNo;
  float sub1,sub2;
  float totalMarks;
  Scanner s = new Scanner(System.in);

  public void inititalize()
  {
    System.out.print("Enter your name:- ");
    name = s.nextLine();

    System.out.print("Enter your roll no :- ");
    rollNo = s.nextInt();

    System.out.print("Enter your marks of sub1 out of 100 :- ");
    sub1 = s.nextFloat();

    System.out.print("Enter your marks of sub2 out of 100:- ");
    sub2 = s.nextFloat();

    
  }

  public void display()
  {
    System.out.println("Name :- " + name);
    System.out.println("Roll no. :- " + rollNo);
    System.out.println("Subject 1 :- " + sub1);
    System.out.println("Subject 2 :- " + sub2);
  }

  public float totalMarksObtained()
  {
    totalMarks = sub1 + sub2;
    return totalMarks;
  }

  float percent()
  {
    float percentage = ((sub1 + sub2)/200)*100;
    return percentage;
  }

}

public class StudentData {
  public static void main(String args [])
  {
    Scanner s = new Scanner(System.in);
    Student st = new Student();
    st.inititalize();
    st.display();
    System.out.println("Total Marks :- " + st.totalMarksObtained());
    System.out.println("percentage is :- " + st.percent());
  }
}
