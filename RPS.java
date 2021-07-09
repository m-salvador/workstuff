import java.util.*;
import java.lang.Math;

public class RPS
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int rounds = 0;
      
      int userWins = 0;
      int computerWins = 0;
      int ties = 0;
      
      int max = 4;
      int min = 1;
    
      boolean gamestate = true;
      
      while (gamestate == true)
      {
         System.out.print("How many rounds would you like to play? ");
         rounds = in.nextInt();
         if (rounds >= 1 && rounds <= 10)
         {
            for (int i = 0; i < rounds; i++)
            {
               System.out.print("Enter 1 for rock, 2 for Paper, 3 for Scissors: ");
               int userChoice = in.nextInt();
               int computerChoice = (int)((Math.random() * (max - min)) + min);
               
               if (userChoice == computerChoice)
               {
                  ties++;
               }
               else
               {
                  if (userChoice == 1 && computerChoice == 3) //user picks rock, comp picks scissors
                  {
                     userWins++;
                  }
                  if (userChoice == 2 && computerChoice == 1) //user picks paper, comp picks rock
                  {
                     userWins++;
                  }
                  if (userChoice == 3 && computerChoice == 2) //user picks scissors, comp picks paper
                  {
                     userWins++;
                  }
                  
                  if (computerChoice == 1 && userChoice == 3) //comp picks rock, user picks scissors
                  {
                     computerWins++;
                  }
                  if (computerChoice == 2 && userChoice == 1) //comp picks paper, user picks rock
                  {
                     computerWins++;
                  }
                  if (computerChoice == 3 && userChoice == 2) //comp picks scissors, user picks paper
                  {
                     computerWins++;
                  }
               }
            }
            System.out.println();
            System.out.print("Result: ");
            if (userWins > computerWins)
            {
               System.out.println("User wins.");
            }
            else if (computerWins > userWins)
            {
               System.out.println("Computer wins.");
            }
            else
            {
               System.out.println("Tie");
            }
            System.out.println("----------------------------");
            System.out.println("# of User wins: " + userWins);
            System.out.println("# of Computer wins: " + computerWins);
            System.out.println("# of ties: " + ties);
            System.out.println();
            System.out.print("Would you like to play again? ");
            Scanner kb = new Scanner(System.in);
            String response = kb.nextLine();
            
            if (response.contains("No") == true)
            {
               System.out.print("Thanks for playing!");
               gamestate = false;
            }
            else
            {
               userWins = 0;
               computerWins = 0;
               ties = 0;   
            }
          
         }
         else
         {
            System.out.print("Error");
            gamestate = false;
         }
      }
     
   }
}