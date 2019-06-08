import java.util.StringTokenizer;

class Prog{ 
	
	public static void main(String args[])
	{
	 String s="hello dad ,cat madam."	;
	 String word;
	 String temp;
	 int count=0;
	 int longestlength=0;
	 String longestPalin="";
	 StringTokenizer st=new StringTokenizer(s,",. ");
	 while (st.hasMoreTokens())
	 {  temp="";
		word=st.nextToken(); 
		System.out.println(word);
		for(int i=word.length()-1;i>=0;i--)
		{   
			temp=temp+word.charAt(i);
			
			
			
		}
		
		if(temp.contentEquals(word))
		{System.out.println("Palindrome "+word);
		 count++;
		 if(word.length()>longestlength)
		 {
			 longestlength=word.length();
			 longestPalin=word;
			 longestPalin=word;
			 
			 
		 }
		 
		 
	    }
	 
	
	}
	 System.out.println("The number of palindromes "+count);
	 System.out.println("The length of the longest palindrome "+longestlength);
	 System.out.println("The  longest palindrome is "+longestPalin);
	 
	}
}