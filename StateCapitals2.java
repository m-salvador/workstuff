import java.lang.Math;
import java.io.*;
import java.util.*;

public class StateCapitals2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      File F = new File("StateCapitals.txt");
      HashMap<String, String> stateCapitals = new HashMap<>();
      String[] statesArr = new String[50];
      int c = 0;
      try {
         Scanner in = new Scanner(F);
        
         while(in.hasNext())
         {
            String s = in.nextLine();
            int start = 0;
            int n1 = s.indexOf("::", start);
            String st = s.substring(start, n1);
            String cap = s.substring(n1 + 2);
            statesArr[c] = st;
            c++; 
            stateCapitals.put(st, cap);  
         }
         in.close();
      } catch(FileNotFoundException e) {
         System.out.println("File not found.");
      }
      System.out.println(stateCapitals.size() + " STATES & CAPITALS ARE LOADED.");
      System.out.println("=======");
      System.out.println("Here are the States: ");
      for (int i = 0; i < statesArr.length; i++)
      {
         if (i != statesArr.length - 1)
         {
            System.out.print(statesArr[i] + ", ");
         }
         else
         {
            System.out.println(statesArr[i]);
         }
      }    
      System.out.print("How many Capitals would you like to guess? ");
      int guesses = kb.nextInt();
      Game(stateCapitals, guesses, statesArr);
   }
   public static void Game(HashMap<String, String> stateCapitals, int guesses, String[] statesArr)
   {
      Set<Integer> s = new HashSet<>();
      Scanner console = new Scanner(System.in);
      int min = 0;
      int max = 49;
      boolean isEqualToGuesses = false;
      int score = 0;
      while (isEqualToGuesses == false)
      {
         for (int i = 0; i < guesses; i++)
         {
            s.add((int)((Math.random() * (max - min)) + min));
         }
         
         if (s.size() == guesses)
         {
            isEqualToGuesses = true;
         }
         else
         {
            s.clear();
         }
      }
      int n = s.size();
      List<Integer> numbers = new ArrayList<Integer>(n);
      for (int n1: s)
      {
         numbers.add(n1);
      }
      String[] selectedStates = new String[guesses];
      for (int i = 0; i < selectedStates.length; i++)
      {
         String z = statesArr[numbers.get(i)];
         selectedStates[i] = z;
      }
      System.out.print("READY TO TEST YOUR KNOWLEDGE? ");
      for (int i = 0; i < guesses; i++)
      {
          System.out.println("WHAT IS THE CAPITAL OF " + "'" + selectedStates[i] +"'?");
          String userGuess = console.nextLine();
          String capit = stateCapitals.get(selectedStates[i]);
          if (userGuess.contains(capit) == true)
          {
            score++;
            System.out.println("NICE WORK! " + capit + " IS CORRECT!");
          }
          else
          {
            score--;
            System.out.println("WRONG");
          }
      }
      System.out.println("Your final score is: " + score);   
   }
  
   
}