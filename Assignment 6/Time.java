 import java.util.Scanner;
 
 public class Time
 {
 	public static void main(String[] args)
 	{
 		//Scanner object to obtain user input.
 		Scanner keyboard = new Scanner(System.in);
 		
 		//String variable to store user input temporarily.
 		String time;
 		
 		//Display for user to enter their desired time.
 		System.out.print("Enter time: ");
 		time = keyboard.nextLine();
 		
 		//Tokens and delimeters.
 		String delim = "[: ]+";
 		String[] tokens = time.split(delim);
 		
 		//Convert string minutes into integer.
 		int min = Integer.parseInt(tokens[1]);
 		
 		//Convert string hours into integer.
 		int hr = Integer.parseInt(tokens[0]);
 		
 		//If-statement to check minutes and hours.
 		if(min > 59 && hr > 12)
 		{	
 			System.out.println("Input: "+hr+":"+min+" "+tokens[2]);
 			System.out.println("Output: Bad input format.");
 		}
 		
 		int temp = 1;
 		int conv = 13;
 		
 		if(hr <= 12 && min <= 59 && tokens.length == 3)
 		{	
 			System.out.println();
 			System.out.println("Input: "+hr+":"+min+" "+tokens[2]);
 			//If-statment when minutes and hours are valid.
 			if((tokens[2].toUpperCase().equals("PM") && hr < 12) || (tokens[2].toUpperCase().equals("AM") && hr < 12))
 			{
 				//While statement that updates the 24-hr equivalent.
 				while(temp < hr)
 				{
 					temp++;
 					conv++;
 				}
 			
 				//Display
 				System.out.println("Output: "+conv+":"+min+" "+tokens[2]);
 			}
 			else if(tokens[2].toUpperCase().equals("AM") && min >= 0 && hr == 12)
 			{
 				conv = 0;
 				System.out.println("Output: 0"+conv+":"+min+" "+tokens[2]);
 			}
 			else
 			{
 				//Display
 				System.out.print("Output: "+hr+":"+min+" "+tokens[2]);
 			}
 		}
 		//Else user does not specify whether AM or PM
 		else
 		{
 			System.out.println();
 			System.out.println("Input: "+hr+":"+min);
 			
 			if(min >= 0 && hr == 12)
 			{
 				conv = 0;
 				System.out.println("Output: 0"+conv+":"+min+" am");
 			}
 			else
 				System.out.println("Output: 0"+hr+":"+min+" am");
 		}		
 	}
 }