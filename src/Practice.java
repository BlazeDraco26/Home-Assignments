import java.util.Scanner;

public class Practice {
   
   public static boolean isOdd(int i) {
      if (i % 2 == 1) {
         return true;
      } else { 
         return false;
      }
       
   }
   
   public static int sum(int x, int y) {
      return x + y;
   }

   public static int gaussianSum(int n) {
      int gaussianSum;
      gaussianSum = 0;
      for (int x = 0; x < n; x++) {
         gaussianSum = gaussianSum + (x + 1);
      }    
      return gaussianSum;
      
   }
   
   public static int factorial(int num) {
      int factorial;
      factorial = 1;
      for (int x = 1; x <= num; x++) {
         factorial = factorial * x;
      }
      return factorial;
   }

   public static int gaussianSum2(int n) {
      int gaussianSum = 0;
      for (int x = 1; x <= n; x++) {
         gaussianSum = gaussianSum + x;
      }    
      return gaussianSum;
      
   }
   
   public static void main(String[] args) {
      int x = 0;
      int y = 1;
      int totalValue;
      
      boolean indicator;
      boolean indicator2;
      totalValue = sum(10, 11);
      indicator = isOdd(x);
      indicator2 = isOdd(y);
      
      System.out.println(indicator);
      System.out.println(indicator2);
      System.out.println(gaussianSum(5));
      System.out.println(factorial(6));

   }

   
   public static void main2(String[] args) {
      int x = 1;
      boolean indicator;
      indicator = isOdd(x);
      System.out.println(indicator);
      x++;
      indicator = isOdd(x);
      System.out.println(indicator);
   }
   
}
