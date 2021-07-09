public class SummativeSums
{
   public static void main(String[] args)
   {
     int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
     int[] arr2 = { 999, -60, -77, 14, 160, 301 };
     int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
     int[] sums = new int[3];
     
     sums = adder(arr1, arr2, arr3, sums);
     int count = 1; 
     for (int i = 0; i < 3; i++)
     {
         System.out.println("#" + count + " Array Sum: " + sums[i]);
         count++;
     }
   }
   public static int[] adder(int[] arr1, int[] arr2, int[] arr3, int[] sums)
   {
      int s = 0;
      for (int i = 0; i < arr1.length; i++)
      {
         s += arr1[i];
      }
      sums[0] = s;
      s = 0;
      for (int i = 0; i < arr2.length; i++)
      {
         s += arr2[i];
      }
      sums[1] = s;
      s = 0;
      for (int i = 0; i < arr3.length; i++)
      {
         s += arr3[i];
      }
      sums[2] = s;
      return sums;
   }

}