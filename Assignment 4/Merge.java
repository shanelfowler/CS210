 import java.util.*;
 
 public class Merge
 {
 	/**
 	 *Method will return the merged array lists.
 	 *Each array list will be alternated and store into the array list
 	 *and stored into a new array list with a combined size.
    @param array list 1
    @param array list 2
    return merged array list
 	 */
 	public static ArrayList<Integer> mergeArray(ArrayList<Integer> a, ArrayList<Integer> b)
 	{
 		ArrayList<Integer> merged = new ArrayList<Integer>(a.size() + b.size());
 		
 		if(a.size() < b.size())
 		{
 			for(int i = 0; i < a.size(); i++)
 			{
 				merged.add(a.get(i));
 				merged.add(b.get(i));
 			}
 			for(int x = a.size(); x < b.size(); x++)
 				merged.add(b.get(x));
 		}
 		else if(a.size() > b.size())
 		{
 			for(int i = 0; i < b.size(); i++)
 			{
 				merged.add(a.get(i));
 				merged.add(b.get(i));
 			}
 			for(int x = b.size(); x < a.size(); x++)
 				merged.add(a.get(x));
 		}
 		else
 		{
 			for(int i = 0; i < a.size(); i++)
 			{
 				merged.add(a.get(i));
 				merged.add(b.get(i));
 			}
 		}
 		return merged;
 	}
   
   public static void displayArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2)
   {
      System.out.print("First Array: ");
 		 for(int a = 0; a < arr1.size(); a++)
 		 	System.out.print(arr1.get(a) +" ");	
 		 		
 		 System.out.println();
 		 
 		 System.out.print("Second Array: ");		
 		 for(int b = 0; b < arr2.size(); b++)
 		 	System.out.print(arr2.get(b) +" ");
 		 
 		 System.out.println();
 		
		 ArrayList<Integer> combine = mergeArray(arr1, arr2);
		 
 		 System.out.print("Merged Array: ");
 		 for(int c = 0; c < combine.size(); c++)
 		 	System.out.print(combine.get(c) +" ");
   }
   
 	public static void main(String[] args)
 	{
 		Scanner keyboard = new Scanner(System.in);
 		int n = 0;
 		int m = 0;
 		
 		System.out.print("How many elements for the first array list: ");												//Ask user how many elements they would like to insert in the first array list.
 		n = keyboard.nextInt();																										//Stores the size of array list.
 		
 		ArrayList<Integer> input1 = new ArrayList<Integer>(n);
 		for(int i = 0; i < n; i++)																									//Loops through the array list and stores the temp value.
 		{
 			int temp = keyboard.nextInt();
 			input1.add(i, temp);
 		}
 		
 		System.out.print("How many elements for the second array list: ");
 		m = keyboard.nextInt();
 		
 		ArrayList<Integer> input2 = new ArrayList<Integer>(m);
 		for(int i = 0; i < m; i++)
 		{
 			int temp = keyboard.nextInt();
 			input2.add(i, temp);
 		}
 		
      //Display
      displayArrays(input1, input2);   
 	}
 }