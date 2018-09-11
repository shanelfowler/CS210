import java.util.Scanner;

public class PigLatin
{
	public static void main(String[] args)
	{
		//Scanner to obtain user input.
		Scanner keyboard = new Scanner(System.in);
		
		//String to store input.
		String input;
		
		//String Builder to store the pig latin.
		StringBuilder pLatin = new StringBuilder();
		
		System.out.println("This program will transform English into pig latin!");
		System.out.print("English: ");
		
		input = keyboard.nextLine();	
		
		//Tokens and Delimeters.
		String delim = "[ ]+";
		String[] tokens = input.split(delim);
		
		System.out.println();
		System.out.print("Pig Latin: ");
		
		//Loop through the array and append accordingly.
		for(int i = 0; i < tokens.length; i++)
		{
			if(tokens[i].length() == 1)
			{
				pLatin.append(tokens[i]);
				pLatin.append("ay ");	
			}	
			if(tokens[i].length() > 1)
			{
				char first = tokens[i].charAt(0);
				tokens[i] = tokens[i].substring(1);
				tokens[i] = tokens[i] + first + "ay ";
				pLatin.append(tokens[i]);	
			}	
		}	
		System.out.print(pLatin+" ");
	}
}