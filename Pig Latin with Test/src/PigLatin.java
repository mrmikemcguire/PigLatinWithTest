import java.util.Scanner;

public class PigLatin
	{
	static String originalText;
	
	public static void main(String[] args)
		{
		System.out.println("Please enter your word(s) to be translated: ");
		Scanner userInput = new Scanner(System.in);
		originalText = userInput.nextLine();
		userInput.close();
		originalText = originalText.toLowerCase();
	
		String regex = " ";
		String [] inputDividedIntoWords = originalText.split(regex);
		
		for(int i=0;i<inputDividedIntoWords.length;i++)
			{
			String firstLetter = inputDividedIntoWords[i].substring(0,1);
			String restOfWord = inputDividedIntoWords[i].substring(1);

			switch(firstLetter)
				{
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					System.out.println(firstLetter + restOfWord + "-" +"ay");
					break;
				case "q":
					System.out.println(restOfWord.substring(1) + "-" + firstLetter + "uay");
					break;
				default:
					System.out.println(restOfWord + "-" + firstLetter + "ay");
				}
			}
		}
	}