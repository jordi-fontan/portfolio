package dukejavac3w1.caesar;

public class Caesar {
	static String lalphabet="abcdefghijklmnopqrstuvwxyz";
	static String ualphabet;
	static
	{
		ualphabet=Caesar.lalphabet.toUpperCase();
		
	}
	
	String shitedAlphabet;
	private StringBuilder sb;
	public StringBuilder getSb() {
		return sb;
	}

	private int key;
	
	public Caesar(int key) {
		super();
		this.key = key;
		System.out.println("Creating object Caesar with key " + key);
		
		this.setShiftAlfabet(key);
	}

	public String encryptCaesar(String input)
	{
		
		
		
		this.sb = new StringBuilder(input);
		
		
		for(int i=0;i<sb.length();i++)
		{
			char currChar = sb.charAt(i);
			char currCharLowerCase=Character.toLowerCase(currChar);
			int idx = ualphabet.indexOf(currCharLowerCase);
			if(idx!=-1) {
				
				
				char newChar= this.shitedAlphabet.charAt(idx);
				if(Character.isUpperCase(currChar)) newChar=Character.toUpperCase(newChar);
				sb.setCharAt(i, newChar);
			}		
		}	
		
		
		
		
		
		return sb.toString();
		
		
	}
	
	public void setShiftAlfabet(int key)
	{
		shitedAlphabet=ualphabet.substring(key) + 
				ualphabet.substring(0,key);
		//System.out.println("Shifted Alphabet : "+ shitedAlphabet);
		
	}

public int getKey() {
		return key;
	}

public static void main(String agrs[])
{
	String test= "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
	Caesar c1=new Caesar(13);
	Caesar c2=new Caesar(21);
	
	c2.encryptCaesar(c1.encryptCaesar(test));
	
	System.out.println("First Encryption with key " + c1.getKey() + " : " +c1.getSb());
	System.out.println("Second Encryption (over already Encrypted Message ) with key " + c2.getKey() + " : " +c2.getSb());
}



}
