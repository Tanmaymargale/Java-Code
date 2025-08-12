import java.util.*;

public class ArrayListConcept 
{
  public static void main(String args[])
  {
    ArrayList<Integer> li = new ArrayList<>();
    li.add(3);
    li.add(8);
    li.add(6);
    li.add(6);
    li.add(2);
    li.add(4);
    li.add(9);
    for (int i = 0; i < li.size();i++)
    {
      System.out.print(li.get(i) + "  ");
    }
    System.out.println();
    int n = li.size();
    System.out.println(li.get(n - 1));
    li.remove(0);
    
    for (int i = 0; i < li.size();i++)
    {
      System.out.print(li.get(i) + "  ");
    }

  }  
}
