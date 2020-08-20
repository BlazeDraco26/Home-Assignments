import java.util.Scanner;

public class Array
{
   public static void main(String[] args) {
      int[][] array = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9},
         {10, 11, 12}
         };
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            System.out.println("array["+i+"]["+j+"]="+array[i][j]);
         }
      }
      System.out.println(array.length);
      System.out.println(array[0].length);
//      System.out.println(array[4].length);
      
      int[][] matrix = new int[3][3];
//      java.util.Scanner input = new Scanner(System.in);
//      System.out.println("Enter " + matrix.length + " rows and " +
//      matrix[0].length + " columns: ");
//      for (int row = 0; row < matrix.length; row++) {
//         for (int column = 0; column < matrix[row].length; column++) {
//            matrix[row][column] = input.nextInt();
//         }
//      }
//      for (int row = 0; row < matrix.length; row++) {
//         for (int column = 0; column < matrix[row].length; column++) {
//            System.out.println(("matrix["+row+"]["+column+"]="+matrix[row][column]));
//         }
//      }
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
         matrix[row][column] = (int)(Math.random() * 100);
         }
      }
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            System.out.println(("matrix["+row+"]["+column+"]="+matrix[row][column]));
         }
      }
      int total = 0;
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            total += matrix[row][column];
         }
      }
      System.out.println(total);
      
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            int i1 = (int)(Math.random() * matrix.length);
            int j1 = (int)(Math.random() * matrix[i].length);
            // Swap matrix[i][j] with matrix[i1][j1]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i1][j1];
            matrix[i1][j1] = temp;
         }
      }

      
   }

}
