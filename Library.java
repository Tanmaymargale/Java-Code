import java.util.*;

class Book
{
  public void addBook(String[] add, int n,String name)
  {
    for (int i = 0; i <n; i++)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 1 for add otherwise entered 0 for break :");
      int j = s.nextInt();
      if (j == 1)
      {
        add[i] = name;
      }
      else
      {
        break;
      }
    }
  }
}

public class Library 
{
  String[] arr;
  public static void main(String []args)
  {
    Book obj = new Book();
  }  
}
