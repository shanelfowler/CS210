/**
A n x n matrix that is filled with the numbers 1, 2, 3...n^2 is a
magic square if the sum of the elements in each row, in each column,
and in the two diagonals is the same value.
*/
import java.util.Random;

public class MagicSquare
{
   //Method that checks whether each value is unique
   public static boolean search(int[][] array, int target)
   {
      for(int a = 0; a < array.length; a++)
      {
         for(int b = 0; b < array[0].length; b++)
         {
            if(array[a][b] == target)
               return true;
         }
      }
      return false;
   }
   
   //Method that checks sum in rows
   public static int totalNumRows(int[][] array, int row)
   {
      int total = 0;
      
      for(int i = 0; i < array[0].length; i++)
         total += array[row][i];
     
     return total;    
   }
   
   //Method that checks sum in columns
   public static int totalNumCols(int[][] array, int col)
   {
      int total = 0;
      
      for(int i = 0; i < array.length; i++)
         total += array[i][col];
     
     return total;    
   }
   
   //Method that check sum of diagonals
   public static int totalNumDiags(int[][] array)
   {
      int total = 0;
      
      for(int i = 0; i < array.length; i++)
         total += array[i][i] + array[i][array.length - i - 1];
     
     return total;    
   }
   
   //Display method
   public static void displayMatrix(int[][] array)
   {
      System.out.println("\t\t\tMagic Square:\n");
      
      for(int r = 0; r < array.length; r++)
      {
         System.out.print("\t\t\t");
         
         for(int c = 0; c < array[0].length; c++)
         {
            System.out.print(array[r][c]+" ");
         }
         System.out.println();
      }
   }
   
   //Test method
   public static void main(String[] args)
   {
      int[][] arrOfNum = new int[4][4];
      Random randNum = new Random();
      
      //Loop that fills the array with numbers 1 - 16
      for(int r = 0; r < arrOfNum.length; r++)
      {
         int temp = randNum.nextInt(16) + 1;
         for(int c = 0; c < arrOfNum[0].length; c++)
         {
            while(search(arrOfNum, temp))
               temp = randNum.nextInt(16) + 1;
              
            arrOfNum[r][c] = temp;         
         }
      } 
      displayMatrix(arrOfNum);
      
      //Row sums
      int totalRow1, totalRow2, totalRow3, totalRow4;
          
      totalRow1 = totalNumRows(arrOfNum, 0);
      System.out.println("Sum of Row 1: "+totalRow1);
      
      totalRow2 = totalNumRows(arrOfNum, 1);
      System.out.println("Sum of Row 2: "+totalRow2);
      
      totalRow3 = totalNumRows(arrOfNum, 2);
      System.out.println("Sum of Row 3: "+totalRow3);
      
      totalRow4 = totalNumRows(arrOfNum, 3);
      System.out.println("Sum of Row 4: "+totalRow4);
      
      //Column sums
      int totalCol1, totalCol2, totalCol3, totalCol4;
      
      totalCol1 = totalNumCols(arrOfNum, 0);
      System.out.println("Sum of Column 1: "+totalCol1);
      
      totalCol2 = totalNumCols(arrOfNum, 1);
      System.out.println("Sum of Column 2: "+totalCol2);
      
      totalCol3 = totalNumCols(arrOfNum, 2);
      System.out.println("Sum of Column 3: "+totalCol3);
      
      totalCol4 = totalNumCols(arrOfNum, 3);
      System.out.println("Sum of Column 4: "+totalCol4);
      
      //Diagonal sums   
      int totalDiags = 0;  
      
      totalDiags += totalNumDiags(arrOfNum);
      System.out.println("Sum of Diagonals: "+totalDiags);
     
     //Check if magic square
     if(totalRow1 == totalRow2 && totalRow1 == totalRow3 &&
        totalRow1 == totalRow4 && totalRow1 == totalCol1 &&
        totalRow1 == totalCol2 && totalRow1 == totalCol3 && 
        totalRow1 == totalRow4 && totalRow1 == totalDiags)
            System.out.println("It is a Magic Square!");
     else
            System.out.println("No Magic Square."); 
        
   }
}