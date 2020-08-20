import java.util.Scanner;

public class Playground
{
   public static void main(String[] args) {
      Integer value = 10;
      int result = value.intValue();
      value = Integer.valueOf(result);
      
      String s = "10";
      Integer result2 = Integer.valueOf(s);
      int result3 = Integer.valueOf(s).intValue();
      
      Circle roundabout = new Circle();
      roundabout.getArea();
      Circle allRounda = new Circle(10);
      allRounda.getArea();
     
      
      Rectangle box = new Rectangle(5, 10);
      box.getArea();
      double outskirt = box.getPerimeter();
      System.out.print("The perimeter is:" + outskirt);
      Rectangle[] box2 = new Rectangle[2];
      box2[] = new Rectangle[];
      
      double d1 = 1.0;
      double d2 = 1.0d;
      double d3 = 1.0D;
      float f1 = 1.0f;
      float f2 = 1.0F;
      int k;
      int count = 0;
      
      int num = 5;
      int denom = 2;
      double answer;
      answer = num / denom;
      System.out.println(answer);
      int remainder = num % denom;
      System.out.println(remainder);
      
      for (k = 0;  k < 200;  k++)
         
         
count++;
      System.out.println(k);
      System.out.print(count);
   }      
   
   private final static boolean KEEP_LOOPING = true;

   public static int getBet() {
      Scanner obtainBet = new Scanner(System.in);
      String betAmount;
      int betValue;
      
      while (KEEP_LOOPING) {
         System.out.println("How much would you like to bet (1 - 50) "
               + "or 0 to quit?");
         betAmount = obtainBet.nextLine();
         betValue = Integer.parseInt(betAmount);
         if (betValue > 0 && betValue <= 50) {
            System.out.println("whirrrrrr .... and your pull is ... ");
            break;
         } else if (betValue == 0) {
            break;
         } else {
//            System.out.println("Error: Invalid Input.");
         }
      }
      return betValue;
   }

   public static int getBet2() {
      Scanner obtainBet = new Scanner(System.in);
      String betAmount;
      int betValue = -5;
      
      while (betValue < 0 || betValue > 50) {
         System.out.println("How much would you like to bet (1 - 50) "
               + "or 0 to quit?");
         betAmount = obtainBet.nextLine();
         betValue = Integer.parseInt(betAmount);
      }
      System.out.println("whirrrrrr .... and your pull is ... ");
      return betValue;
   }   

   public static int getBet3() {
      Scanner obtainBet = new Scanner(System.in);
      String betAmount;
      int betValue = -5;
      
      for (;betValue < 0 || betValue > 50;) {
         System.out.println("How much would you like to bet (1 - 50) "
               + "or 0 to quit?");
         betAmount = obtainBet.nextLine();
         betValue = Integer.parseInt(betAmount);
      }
      System.out.println("whirrrrrr .... and your pull is ... ");
      return betValue;
   }   


}

class Circle
{
   private double radius;

   public Circle()
   {
      radius = 1;
   }
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getArea() 
   {
      double area;
      area = Math.PI * radius * radius;
      return area;
   }
   
}

class Rectangle
{
   private double length;
   private double width;
   
   public Rectangle()
   {
      length = 3;
      width = 4;
   }
   
   public Rectangle(double length, double width)
   {
      this.length = length;
      this.width = width;
   }
   
   public double getLength()
   {
      return length;
   }
   public boolean setLength(double length)
   {
      if (length > 0) {
         return true;
      } else {
         return false;
      }
   }
   public double getWidth()
   {
      return width;
   }
   public boolean setWidth(double width)
   {
      if (width > 0) {
         return true;
      } else {
         return false;
      }
   }
   public double getArea() 
   {
      double area;
      area = length * width;
      return area;
   }
   
   public double getPerimeter()
   {
      double perimeter;
      perimeter = (2 * length) + (2 * width);
      return perimeter;
   }
}
