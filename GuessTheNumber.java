import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

class Choose
{
    int computerInput;
    public int i = 1;
    public Choose()
    {
        Random random = new Random();
        computerInput = random.nextInt(0,100);
    }

    void Compare()
    {
        int userInput = 0;
        for (int i = 1; ; i++)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Guess the number :");
            try 
            {
                userInput = s.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Accept only nuumber.");
                break;
            }
            if (userInput == computerInput)
            {
                System.out.println("You won!");
                System.out.println("Your score is " + i);
                break;
            }
            else if(userInput > computerInput)
            {
                System.out.println("You entered greater number.");
            }
            else 
            {
                System.out.println("You entered smaller number."); 
            }
        }
    }
}

public class GuessTheNumber 
{
    public static void main(String [] args)
    {
        
        Choose harsh = new Choose();
        harsh.Compare();


    }
    
}
