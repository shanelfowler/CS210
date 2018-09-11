import java.util.*;

public class Part1
{
   /**
   Replace each element except the first and last by the large of its
   two neighbors.
   @param array
   @param first element
   @param last element
   */
   public static void replaceElement(int[] arr)
   {	
      for(int i = 1; i < arr.length-1; i++)
      {
        if(arr[i-1] > arr[i + 1])
           arr[i] = arr[i-1];
        else
           arr[i] = arr[i + 1];         
     	}
   }
	
   /**
   Replace all even elements with 0.
   @param array
   */
   public static void evenToZero(int[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] % 2 == 0)
            arr[i] = 0;
      }
   }
   
   /**
   Move all even elements to the front, otherwise preserving the order
   of the elements.
   @param array
   @param elements
   */
   public static void moveEvenToFront(int[] arr)
   {
      int curEvenPos=0;
      
      for(int i = 0; i < arr.length-1; i++)
      {
         if(arr[i] % 2 == 0)
         {
            int temp = arr[i];
				
				//shift the all odd elements from i down to curEvenPos
				//loop
				for(int j = i; j > curEvenPos; j--)
				{
					arr[j]=arr[j-1];
				}
				//assign temp to curEvenPos
				arr[curEvenPos]=temp;
				
				curEvenPos++;	
			}
      }  
    }
   
   /**
   Return the second-largest element in the array.
   @param array
   return second-largest element (int)
   */
   public static int secondLargest(int[] arr)
   {
      int highest = arr[0];
           
      for(int i = 1; i < arr.length; i++)
      {
         if(arr[i] > highest)
         {
           highest = arr[i];
         }
      }
		 
		
		int secondHighest = arr[0];
				
		for(int i = 1; i < arr.length; i++)
      {
         if(arr[i] > secondHighest && arr[i]!= highest)
         {
           secondHighest = arr[i];
         }
       }
      return secondHighest;
   }
   
   /**
   Return true if the array is currently sorted in increasing order.
   @param array
   return boolean variable
   */
   public static boolean isAscend(int[] arr)
   {
      for(int i = 0; i < arr.length-1; i++)
      {
        if(arr[i] > arr[i+1])
           return false;
	   }
      return true;
   }
   
   /**
   Return true if the array contains two adjacent duplicate elements.
   @param array
   return boolean variable
   */
   public static boolean isAdjDuplicate(int[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] != arr[i+1]);
            return false;
      }
      return true;
   }
   
   /**
   Return true if the array contains duplicate elements (which need not
   to be adjacent).
   @param array
   return boolean variable
   */
   public static boolean isDuplicate(int[] arr)
   {  
      for(int i = 0; i < arr.length; i++)
      {
         for(int j = 0; j < arr.length; j++)
         {
            if( (arr[i] == arr[j]))
               return true;
         }
      }
      return false;
   }
   
	public static void displayArray(int[] arr)
	{
		for(int n: arr)
			System.out.print(n+" ");
			
	   System.out.println();
	
	}
   
   /**
   Comment out each method to get a more accurate picture of how
   they affect the original array of numbers.
   */
   public static void main(String[] args)
   {
      int[] arrOfNum = {11, 24, 3, 7, 44, 32, 53};
      
      System.out.print("Original Array: ");
      displayArray(arrOfNum);
      
      System.out.print("Replace Method: ");
      replaceElement(arrOfNum);
      displayArray(arrOfNum);
      
      System.out.print("Zero Method: ");
      evenToZero(arrOfNum);
      displayArray(arrOfNum);
      
      System.out.print("Shift Method: ");
      moveEvenToFront(arrOfNum);
      displayArray(arrOfNum);
      
      System.out.println("Second Largest#: "+secondLargest(arrOfNum));
      
      System.out.println("Ascending(?): "+isAscend(arrOfNum));
      
      System.out.println("Adjacent Duplicate: "+isAdjDuplicate(arrOfNum));
      
      System.out.println("Duplicates: "+isDuplicate(arrOfNum));
      
   }
}