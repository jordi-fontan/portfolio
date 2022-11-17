package dukejavac3w1.caesar;
/*
 * Assignment 2: Caesar Cipher
 * You will start with the Caesar Cipher algorithm you learned about in the videos,
 *  and you will make some enhancements to it, 
 *  so that it works with all letters (both uppercase and lowercase) and to 
 *  make it a little bit harder to decrypt. 
 *  Write these methods in a CaesarCipher class you can use in the next lesson.

 * Specifically, you should do the following:

 * Create a new class called CaesarCipher.

 * Write the method encrypt that has two parameters, a String named input and an int named key.
 *  This method returns a String that has been encrypted using the Caesar Cipher 
 *  algorithm explained in the videos.
 *   Assume that all the alphabetic characters are uppercase letters. For example, the call

  *        encrypt(“FIRST LEGION ATTACK EAST FLANK!”, 23)

   *   should return the string 

  *        “CFOPQ IBDFLK XQQXZH BXPQ CIXKH!”
 * 
 * 
 * */

/*
 * 
 * Write the void method testCaesar that has no parameters.
 *  This method should read a file and encrypt the complete file using the Caesar Cipher algorithm,
 *   printing the encrypted message. 
 * You may want to include the lines:


FileResource fr = new FileResource();
String message = fr.asString();
String encrypted = encrypt(message, key);
System.out.println("key is " + key + "\n" + encrypted);
Modify the encrypt method to be able to handle both uppercase and lowercase letters. 
For example, encrypt(“First Legion”, 23) should return “Cfopq Ibdflk”, 
and encrypt(“First Legion”, 17) should return “Wzijk Cvxzfe”.  
Be sure to test the encrypt method. 
 * 
 * 
 * 
 * 
 * Write the method encryptTwoKeys that has three parameters, 
 * a String named input, and two integers named key1 and key2. 
 * This method returns a String that has been encrypted using the following algorithm.
 *  Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm,
 *   starting with the first character, and key2 is used to encrypt every other character, 
 *   starting with the second character. For example, 
 *   the call encryptTwoKeys(“First Legion”, 23, 17) should return “Czojq Ivdzle”.
*  Note the ‘F’ is encrypted with key 23, 
 * the first ‘i’ with 17, 
 * the ‘r’ with 23, and the ‘s’ with 17, etc. Be sure to test this method. 
 * 
 * 
 * 
 */

public class CaesarCipher {

	
	
	public CaesarCipher() {
		// TODO Auto-generated constructor stub
	}

	
	public String encrypt(String input, int key)
	{
		
		String ualphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String shiftedAlphabet=ualphabet.substring(key) + 
				ualphabet.substring(0,key);
		StringBuilder sb = new StringBuilder(input);
		
		
		for(int i=0;i<sb.length();i++)
		{
			char currChar = sb.charAt(i);
			char currCharUpperCase=Character.toUpperCase(currChar);
			int idx = ualphabet.indexOf(currCharUpperCase);
			if(idx!=-1) {
				
				
				char newChar= shiftedAlphabet.charAt(idx);
				if(Character.isLowerCase(currChar)) newChar=Character.toLowerCase(newChar);
				sb.setCharAt(i, newChar);
			}		
		}	
		
		
		
		
		
		return sb.toString();
		
		
	
	}
	
	
	public String encryptWithTwoKeys(String input, int key1, int key2)
	{
		
		String ualphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String shiftedAlphabet1=ualphabet.substring(key1) + 
				ualphabet.substring(0,key1);
		String shiftedAlphabet2=ualphabet.substring(key2) + 
				ualphabet.substring(0,key2);
		
		
		StringBuilder sb = new StringBuilder(input);
		
		
		for(int i=0;i<sb.length();i++)
		{
			char currChar = sb.charAt(i);
			char currCharUpperCase=Character.toUpperCase(currChar);
			int idx = ualphabet.indexOf(currCharUpperCase);
			if(idx!=-1) {
				char newChar='0';
				if(i%2 == 0) {
				 newChar= shiftedAlphabet1.charAt(idx);
				
				}
				else {
					newChar= shiftedAlphabet2.charAt(idx);
				}
				if(Character.isLowerCase(currChar)) newChar=Character.toLowerCase(newChar);
				sb.setCharAt(i, newChar);
			}		
		}	
		
		
		
		
		
		return sb.toString();
		
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarCipher cc=new CaesarCipher();
		String result= cc.encrypt("FIRST LEGION ATTACK EAST FLANK! coca cola", 23);
		System.out.println(result);
	
	/*
	 * For example, encrypt(“First Legion”, 23) should return “Cfopq Ibdflk”, 
and encrypt(“First Legion”, 17) should return “Wzijk Cvxzfe”.  
	 * 
	 */
		String result2= cc.encrypt("First Legion", 23);
		System.out.println(result2);
	
		
		String result3= cc.encrypt("First Legion", 17);
		System.out.println(result3);
	/*
		For example, 
		 *   the call encryptTwoKeys(“First Legion”, 23, 17) should return “Czojq Ivdzle”.
		*  Note the ‘F’ is encrypted with key 23, 
		 * the first ‘i’ with 17, 
		 * the ‘r’ with 23, and the ‘s’ with 17, etc. Be sure to test this method. 
		 * 
	*/
		String result4= cc.encryptWithTwoKeys("First Legion", 23,17);
		System.out.println(result4);
		
		String test= "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
		System.out.println(cc.encrypt(test, 15));
		
		/*
		 * 6.
Question 6
Encrypt the following phrase with the algorithm described for using two Caesar Cipher keys, 
with key1 = 8 and key2 = 21
		 * 
		 */
		System.out.println(cc.encryptWithTwoKeys(test, 8,21));
		
	}

	
	
}
