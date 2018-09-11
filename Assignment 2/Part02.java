import java.util.Random;

 public class Part02
 {
 	public static void main(String[] args)
 	{
 		int [] arrayNum = new int[20];													      //Creates an array of 20 elements to store the random generated numbers.
 		Random randNum = new Random();													      //Creates a random object that will eventually have a range of 1 - 6.
 		int minNum = 1;																	         //Creates a variable to hold a default minimum.
 		int maxNum = 6;																	         //Creates a variable to hold a default maximum.
 		boolean inRun = false;															         //Creates a variable to hold the default false value.
 		   
 		/**
 		 *This for-loop will go through the array and assign a random
 		 *value to each subscript to be used later on. They will be
 		 *compared to each other to determine whether or not values
 		 *in the initial subscript are equal to the preceding value.
 		 */
 		 for(int i = 0; i < arrayNum.length; i++)
 		 {
 		 	int tempValue = randNum.nextInt(maxNum - minNum + 1) + minNum;				//Sets the a random number to tempValue.
 		 	arrayNum[i] = tempValue;													         //Stores each value into the array using tempValue.			
 		 }
       
       //For each valid index i in the array.
       for(int i = 1; i < arrayNum.length-1; i++)
       {
         if(inRun)
         {
            if(arrayNum[i] != arrayNum[i-1])
            {
               System.out.print(")");
               inRun = false;
            
               if(arrayNum[i] == arrayNum[i+1])
               {
                  System.out.print("(");
                  inRun = true;
               }
            }
         }
         else																		
 		 	{
 		 		 if(arrayNum[i] == arrayNum[i+1])
 		 		 {
 		 			 System.out.print("(");
 		 			 inRun = true;
             }
 		 	} 
         System.out.print(arrayNum[i]+" ");
       }   
       if(inRun)
         System.out.print(") ");		 		
 	}
 }