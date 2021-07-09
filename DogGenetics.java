import java.util.*;
import java.lang.Math;

public class DogGenetics
{
   public static void main(String[] args)
   {
      String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman" };
      int[] percents = new int[5];
      percents = calculateP(percents);
      Scanner in = new Scanner(System.in);
      System.out.print("What is your dog's name? ");
      String name = in.nextLine();
      System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
      System.out.println();
      System.out.println(name + " is: ");
      System.out.println();
      printR(breeds, percents);   
   }
   public static int[] calculateP(int[] p)
   {
      int min = 1;
      int max = 100;
      int h = 100;
      int sum = 0;
      int finalval = 0;
      for (int i = 0; i < p.length; i++)
      {
         if (i != p.length - 1)
         {
            p[i] = (int)((Math.random() * (max - min)) + min);
            sum += p[i];
            max -= p[i];
         }
         else
         {
            finalval = h - sum;
            p[i] = finalval;     
         }
      }
      return p;
   }
   
   public static void printR(String[] breeds, int[] percents)
   {
      for (int i = 0; i < percents.length; i++)
      {
         System.out.println(percents[i] + "% " + breeds[i]);
      }
      System.out.println();
      System.out.println("Wow, that's QUITE the dog!");
   }
}