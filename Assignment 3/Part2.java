import java.util.*;

public class Part2
{
   
   public static boolean isRange(int n)
   {
      if(n >= 10 && n <=100)
         return true;
      else
         return false;
   }

   public static boolean search(int[] array, int target)
   {
      for(int i = 0; i < array.length; i++)
      {
         if(array[i] == target)
            return true;
      }
      return false;
   }
   
   /**
     Write a program that inputs five numbers, each between 10 and 100,
     inclusive.
     */
     
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);                                    
      int counter = 0, temp;
      int[] numInput = new int[5];
      
      System.out.print("Enter a value between 10 and 100: ");
      
      while(counter < numInput.length)
      {
         temp = keyboard.nextInt();
         
         if(isRange(temp) == false)
         {
            System.out.print("Out of bounds. Enter new value: ");
            temp = keyboard.nextInt();
         }
         else
         {
            if(search(numInput, temp))
            {
               System.out.print("Duplicate found. Enter new value: ");
               continue;
            }  
            else
            {
               numInput[counter] = temp;
               counter++;
            }
          }     
      }    
       
     System.out.print("Array: ");
      
     //Display
     for(int i = 0; i < numInput.length; i++)
         System.out.print(numInput[i]+" ");
     
     System.out.println();     
   }
}