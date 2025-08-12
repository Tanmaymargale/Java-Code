import java.util.LinkedList;

public class LinkedListExample {
  public static void main(String args[])
  {
    LinkedList<String> name = new LinkedList<>();
    name.add("Harshal");
    name.add(1,"adi");
    name.remove(0);
    System.out.println(name.size());

  }
}
