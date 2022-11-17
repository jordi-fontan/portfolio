package dukejavac3w1.caesar;

/*
 * 
 * 
 * 
 * Assignment 1: Word Play 
 * 
 * 
 *  You will write a program to transform words from a file into another form,
 *   such as replacing vowels with an asterix. 

 * Specifically, you should do the following.

 * Create a new class called WordPlay.

* 1

 * Write a method isVowel that has one Char parameter named ch. 
 * This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise. You should write a tester method to see if this method works correctly. For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.

 * 2
 * 
 * Write a method replaceVowels that has two parameters, 
 * a String named phrase and a Char named ch. 
 * This method should return a String that is the string phrase with all 
 * the vowels (uppercase or lowercase) replaced by ch. 
 * For example, the call replaceVowels(“Hello World”, ‘*’) returns the string “H*ll* W*rld”. 
 * Be sure to call the method isVowel that you wrote and also test this method.

 * Write a method emphasize with two parameters, a String named phrase and a character named ch. This method should return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by

     ‘*’ if it is in an odd number location in the string (e.g. the first character has an odd number location but an even index, it is at index 0), or

     ‘+’ if it is in an even number location in the string (e.g. the second character has an even number location but an odd index, it is at index 1).

 * For example, the call emphasize(“dna ctgaaactga”, ‘a’) would return the string “dn* ctg+*+ctg+”, and the call emphasize(“Mary Bella Abracadabra”, ‘a’) would return the string “M+ry Bell+ +br*c*d*br+”. Be sure to test this method.

 
 */



public class WordPlay 
{
	
	StringBuffer sb;
	
	/* 1

	 * Write a method isVowel that has one Char parameter named ch. 
	 * This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or 
	 * the uppercase versions) and false otherwise. 
	 * You should write a tester method to see if this method works correctly. 
	 * For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.
*/
	private static boolean isVowel(char ch)
	{
		
		
		if (!Character.isLetter(ch)) {return false;}
		else {
			char lcch = Character.toLowerCase(ch);
			if(lcch=='a' || lcch=='e' || lcch=='i' || lcch=='o'  || lcch=='u') return true;
			else return false;
			
		}
				
	}
	
	 /* 2
	 * 
	 * Write a method replaceVowels that has two parameters, 
	 * a String named phrase and a Char named ch. 
	 * This method should return a String that is the string phrase with all 
	 * the vowels (uppercase or lowercase) replaced by ch. 
	 * For example, the call replaceVowels(“Hello World”, ‘*’) returns the string “H*ll* W*rld”. 
	 * Be sure to call the method isVowel that you wrote and also test this method.
	*/
	
	
	public  String replaceVowels(String text, char ch)
	{
		
		 sb= new StringBuffer(text);
		 for(int i=0; i<sb.length();i++)
		 {
			 
			 if(isVowel(sb.charAt(i))) sb.setCharAt(i,ch);
		 }	 
			 
		
		
		
		return sb.toString();
		
	}
	
	
	
	public static void main (String args[])
	{
		// Test isVowel
		
		if(isVowel('a')) System.out.println("a is vowel");
		if(!isVowel('b')) System.out.println("b is not vowel");
		if(isVowel('A')) System.out.println("A is vowel");
		if(!isVowel('B')) System.out.println("B is not vowel");
		
		if(!isVowel('?')) System.out.println("? is not vowel");
		
		// Test replace vowels
		
		WordPlay wp= new WordPlay();
	
		String result = wp.replaceVowels("Hello World", '?')	;
		System.out.println(result);	
	}

}
