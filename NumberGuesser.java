import java.util.Scanner;
import java.util.Random;

public class NumberGuesser
{
  public static void main(String[] args)
  {
    int number = (int)(Math.random() * 100) + 1; // generates random number
    
    //System.out.println("NumberL " + number);
    
    Scanner in = new Scanner(System.in);
    
    int counter = 0; // guess counter
    int sentinel;
    sentinel = -1; // if user inputs the sentinel, game will be aborted
    
    
    boolean win = false;
    
    while (win == !true) // Starts the game
    {
      System.out.println ("Enter a whole number between 1 and 100. To exit, enter -1 "); // prompts user for number
      int guess = in.nextInt(); // the user's guess
      
      if (guess == sentinel) // if the user wants to abort the program
      {
        System.out.println ("You have ended the game.");
        win = true;
        System.out.println ("Want to play again? (y/n)"); // asks user to play again
        
        String answer = "";
        answer = in.next();
        if (answer.equals("y") || answer.equals("Y")) // asks user if they want to play again
        {
          number = (int)(Math.random() * 100) + 1; // generates random number
          //System.out.println("NumberL " + number);
          win = false;
        }
        else if (answer.equals("n") || answer.equals("N")) // asks user if they want to play again
        {
          System.out.println ("Thanks for Playing!"); // end of game
        }
        
      }
      else if (guess == number) // if the user guess is correct
      {
        counter++;
        win = true;
        System.out.println("That's Right. You guessed this many times: " + counter); // shows user is correct with number of tries
        System.out.println ("Want to play again? (y/n)"); // asks user to play again
        
        String answer = "";
        answer = in.next();
        if (answer.equals("y") || answer.equals("Y")) // asks user if they want to play again
        {
          number = (int)(Math.random() * 100) + 1; // generates random number
        //  System.out.println("NumberL " + number);
          win = false;
          counter = 0;
        }
        else if (answer.equals("n") || answer.equals("N")) // asks user if they want to play again
        {
          System.out.println ("Thanks for Playing!"); // end of game
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
    }
  }
}

  

      