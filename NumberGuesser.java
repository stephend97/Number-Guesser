import java.util.Scanner;
import java.util.Random;

public class NumberGuesser
{
  public static void main(String[] args)
  {
    int number = (int)(Math.random() * 100) + 1;
    
    Scanner in = new Scanner(System.in);
    
    int counter = 0;
    int sentinel;
    sentinel = -1; // if user inputs the sentinel, game will be aborted
    
    
    boolean win = false;
    
    while (win == !true) // Starts the game
    {
      System.out.println ("Enter a whole number between 1 and 100. To exit, enter -1 ");
      int guess = in.nextInt(); // prompts user for their guess
      
      if (guess == sentinel)
      {
        System.out.println ("You have ended the game.");
        win = true;
        System.out.println ("Want to play again? (y/n)");
        
        String answer = "";
        answer = in.next();
        if (answer.equals("y") || answer.equals("Y"))
        {
          number = (int)(Math.random() * 100) + 1;
          win = false;
        }
        else if (answer.equals("n") || answer.equals("N"))
        {
          System.out.println ("Thanks for Playing!");
        }
        
      }
      else if (guess == number)
      {
        counter++;
        win = true;
        System.out.println("That's Right. You guessed this many times: " + counter);
        System.out.println ("Want to play again? (y/n)");
        
        String answer = "";
        answer = in.next();
        if (answer.equals("y") || answer.equals("Y"))
        {
          number = (int)(Math.random() * 100) + 1;
          win = false;
          counter = 0;
        }
        else if (answer.equals("n") || answer.equals("N"))
        {
          System.out.println ("Thanks for Playing!");
        }
      }
      
      else if (guess > number) // if the user guess is higher than the random number
      {
        System.out.println("Too high");
        counter++;
      }
      else if (guess < number) // if the user guess is lower than the random number
      {
        System.out.println("Too low");
        counter++;
      }
    } //end of while loop
  } // end of main
}