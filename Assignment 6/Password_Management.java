import java.util.*;
import java.lang.Exception;

public class Password_Management
{
   public static void shuffle(StringBuilder sb, int ln)
   {
      Random rand = new Random();
      
      for(int i = ln - 1; i > 0; i++)
      {
         int swap = rand.nextInt(i);
         char tmp = sb.charAt(swap);
         sb.setCharAt(swap, sb.charAt(i));
         sb.setCharAt(i, tmp);
      }
   }
   
	public static void main(String[] args)
	{	
		//Create a string variables that hold uppercase letters, lowercase letters, numbers, and special characters.
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
							+"abcdefghijklmnopqrstuvwxyz"
							+"0123456789"
							+"+-*/?!@#$%&";								
								
		//Create a random object that will select a character within a specified range.
		Random rand = new Random();

		//Create a string builder that will hold temporary password.
      StringBuilder stb = new StringBuilder(); 
      	
      //Create the first four chars.
      char upper = str.charAt(rand.nextInt(26));
      char lower = str.charAt(rand.nextInt((51 - 26 + 1)) + 26);
      char num = str.charAt(rand.nextInt((61 - 51 + 1)) + 51);
      char spec = str.charAt(rand.nextInt(((str.length() - 61 + 1))) + 61);
      	
      //Append the first four characters.
      stb.append(upper);	 
      stb.append(lower);	 
      stb.append(num);	                      
      stb.append(spec);
       
      //Create integer to store length
      int length = rand.nextInt((12 - 8 + 1))+ 8;
     
      //Loop for the remainder.
      for(int i = 4; i < length; i++)
      {
       	char random = str.charAt(rand.nextInt(str.length()));
       	stb.append(random);
      }
      
      //Try and catch out of bounds error found in the shuffle method
      try
      {
         shuffle(stb, length);
      }
      catch(Exception e)
      {
         System.out.print("Temporary password: "+stb);
      } 
	}
}