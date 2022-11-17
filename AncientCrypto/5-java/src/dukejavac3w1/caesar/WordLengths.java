package dukejavac3w1.caesar;

import java.io.*;
import java.util.StringTokenizer;

/*
 * 
 * Assignment 1: Word lengths
You will write a program to figure out the most common word length of words from a file. To solve this problem you will need to keep track of how many words from a file are of each possible length. You should group all words of length 30 or more together, and you should not count basic punctuation that are the first or last characters of a group of characters.

Specifically, you should do the following:

Create a new class called WordLengths.

Write a void method countWordLengths that has two parameters,
 a FileResource named resource and an integer array named counts. 
 This method should read in the words from resource and count the number of words of each 
 length for all the words in resource, storing these counts in the array counts.

        - For example, after this method executes, counts[k] should contain 
        the number of words of length k.

        - If a word has a non-letter as the first or last character,
         it should not be counted as part of the word length.
          For example, the word And, would be considered of length 3 (the comma is not counted), 
          the word “blue-jeans” would be considered of length 10 
          (the double quotes are not counted, but the hyphen is). 
          Note that we will miscount some words, such as “Hello,” which will be counted as 6
           since we don’t count the double quotes but will count the comma, but that is OK 
           as there should not be many words in that category.

        - For any words equal to or larger than the last index of the counts array, 
        count them as the largest size represented in the counts array.

        - You may want to consider using the Character.isLetter method that returns true if a character is a letter, 
        and false otherwise. For example, Character.isLetter(‘a’) returns true,
         and Character.isLetter(‘-’) returns false. 

Write a void method testCountWordLengths that creates a FileResource so you can select a file,
 and creates a counts integer array of size 31.
  This method should call countWordLengths with a file and then print the number of words of each length. 
  Test it on the small file smallHamlet.txt shown below.

Write a method indexOfMax that has one parameter named values that is an integer array. 
This method returns the index position of the largest element in values.
 Then add code to the method testCountWordLengths to call indexOfMax to determine the most common 
 word length in the file. For example, calling indexOfMax after calling countWordLengths on the file smallHamlet.txt 
 should return 3.

First test your program on a small file, such as this simple file shown called smallHamlet.txt:

    Laer. My necessaries are embark'd. Farewell.

        And, sister, as the winds give benefit

Note this file has words that are:

2 words of length 2: My as

3 words of length 3: are And the

2 words of length 4: Laer give

1 word of length 5: winds

1 word of length 6: sister

1 word of length 7: benefit

2 words of length 8: embark’d Farewell

1 word of length 11: necessaries

       
 * 
 * 
 * 
 * 
 */
public class WordLengths {

	public WordLengths() {
		// TODO Auto-generated constructor stub
	}

	public int indexOfMax(int a[])
	 {
		int max=0;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
				index=i;
			}
			
			
		}	
		return index;
	 }
	
	public int[] countWordLengths(String resource,int[] counts)
	{
		StringBuffer sb=null;
	
		
		
		
		try  
		{  
		File file=new File(resource);    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		 sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)  
		{  
		sb.append(line);      //appends line to string buffer  
		sb.append("\n");     //line feed   
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		
		StringTokenizer st= new StringTokenizer(sb.toString(), " ");
		int counter=0;
		System.out.println(counter); 
		while(st.hasMoreElements())
		{
			
			counter++;
			String a=st.nextToken();
			System.out.println(a);
			
							
			int l= a.length();
			
			 /*- For any words equal to or larger than the last index of the counts array, 
		        count them as the largest size represented in the counts array.
			*/
			
			if(l>(counts.length-1)) l=counts.length-1;
			
			
			 /*- You may want to consider using the Character.isLetter method that
			  *  returns true if a character is a letter, and false otherwise. 
			     For example, Character.isLetter(‘a’) returns true, 
			     and Character.isLetter(‘-’) returns false. 
			*/
			
			char first=a.charAt(0);
			char last=a.charAt(l-1);
			
			if(!Character.isLetter(first)) {
				//System.out.println("Corrected "+a +" from " + l + " to " + (l-1));l--;
				}
			if(!Character.isLetter(last)) {
				//System.out.println("Corrected "+a +" from " + l + " to " + (l-1));l--;
				}
			
			
			// System.out.println(a + " -----> "+ l);
			if(l>0) counts[l]++;
			
		}	 
		//System.out.println(counter); 
		return counts;
	}
	
	
	public static void main(String[] args) {

			WordLengths wl=new WordLengths();
			int[] c=new int[31];
			wl.countWordLengths("C:\\sharedData\\lotsOfWords2.txt", c);
			
			
			System.out.println("\n\n Max word length is: " + wl.indexOfMax(c) );
			for(int i=0; i<c.length;i++) System.out.println(" Length= "+i+"  "+ c[i]);
			
			System.out.println("\n\n Max word length is: " + wl.indexOfMax(c) + " Number of Ocurrences: " + c[wl.indexOfMax(c)]);
	}

}
