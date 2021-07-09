import java.util.*;
import java.lang.Math;
public class HealthyHearts
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your age? ");
      int age = in.nextInt();
      int maxH = maxHeart(age);
      System.out.println("Your maximum heart rate should be " + maxH + " bearts per minute");
      int[] tarH = new int[2];
      tarH = tarHeart(tarH, maxH);
      System.out.println("Your target HR Zone is " + tarH[0] + " - " + tarH[1] + " beats per minute");
   }
   public static int maxHeart(int a)
   {
      int m = 220 - a;
      return m;
   }
   public static int[] tarHeart(int[] tarH,int maxH)
   {
      tarH[0] = (int)Math.ceil(maxH * .50);
      tarH[1] = (int)Math.ceil(maxH * .85);
      return tarH;
   }
}