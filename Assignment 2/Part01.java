import java.util.Scanner;
import java.text.DecimalFormat;
 
 public class Part01
 {
 
 /**
 Method that determinwas if the number is valid.
 @param the number being passed.
 return true or false.
 */	
  public static boolean isValid(int n)                                                                         //Determines the validity of n.
  {   
      if(n >= 0)
         return true;
      else
         return false;
  }
  
  /**
   *This method will calculate the percentage then return it.
   *Used later in the main method in order to show each element's
   *percentage of the sum.
   @param the number and the sum of the numbers added.
   return the percentage.
   */
  public static double percNum(int n, int sum)
  {
  	double numPercentage = Math.floor(n * 100) / sum;							
 	
  	return numPercentage;
  }
  
   public static void main(String[] args)
   {
      /**
      *Created a scanner variable that will allow users to put in their input.
      *Also, the int variable will act as a temporary storage to be used in
      *future methods. By default, I have set the value of numInput to zero so
      * it is not null.
      */
      Scanner keyboard = new Scanner(System.in);
      int numInput = 0;
      int tempValue = 0;
      DecimalFormat fMat = new DecimalFormat("0.000");															            //Rounds to three decimal places.														
      
      System.out.println("How many numbers will you enter?");
      numInput = keyboard.nextInt();                                                                         	//Allows the user's initial selection of how many numbers they will enter.
      
      int [] numArray;
      
      if(isValid(numInput))
      {
         /**
         *This if statement will set the size of the array to the user's choice
         *as long as numInput is valid. Afterwards, it will loop through the array
         *to store each value into the array to be used later.
         */
         numArray = new int[numInput];
         System.out.println("Enter " +numInput +" integer(s):");
         
         int numTotal = 0;                                                                                  	//Eventually, all of the elements in the array will be tallied and store here.                                                 
         for(int i = 0; i < numArray.length; i++)                                                           	//For-loop will allow each value to be stored to an element of the array.
         {
           tempValue = keyboard.nextInt();
           numArray[i] = tempValue;
           
           numTotal += numArray[i];																				                  //Tallies up the sum.
         }
         System.out.println("The sum is "+numTotal +".");
         System.out.println("The numbers are: ");
         
         for(int i = 0; i < numArray.length; i++)
         	System.out.println(numArray[i] +" " +fMat.format(percNum(numArray[i], numTotal)) +"% of the sum.");
      }
      else
         System.out.println("Thank you for using my program. Good-bye.");
             
   }
 }
 
 
 