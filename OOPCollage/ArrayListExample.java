import java.util.*;

public class ArrayListExample {
  public static void main(String args[])
  {
    ArrayList<String> names = new ArrayList<>();
    System.out.println("Add Object.");
    names.add("Harshal");
    names.add("Rohit");
    names.add("adi");
    //Add object at specific location 
    names.add(3,"jhf");
    //Remove element 
    names.remove("adi");
    //Array is empty or not 
    System.out.println(names.isEmpty());
  }  
}
