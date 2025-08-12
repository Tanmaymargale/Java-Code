import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
  public static void main(String args[])
  {
    //create file.
    File myfile = new File("Harshal.txt");
    try
    {
      myfile.createNewFile();
    }
    catch (IOException e)
    {
      System.out.println(e);
    }

    //Write file.
    try 
    {
      FileWriter fileWriter = new FileWriter("Harshal.txt");
      fileWriter.write("This my new and first file.");
      fileWriter.close();
    }
    catch (IOException e)
    {
      System.out.println(e);
    }

    //Read file.
    try 
    {
      Scanner s = new Scanner(myfile);
      while(s.hasNextLine())
      {
        String line = s.nextLine();
        System.out.println(line);
      }
      s.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e);
    }
  }
}
