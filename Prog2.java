import java.util.StringTokenizer;

class Prog2{ 
	
	public static void main(String args[])
	{
	 String s="hello dad ,cat."	;
	 String word;
	 String temp;
	 StringTokenizer st=new StringTokenizer(s,",. ");
	 while (st.hasMoreTokens())
	 {  temp="";
		word=st.nextToken(); 
		
		for(int i=word.length()-1;i>=0;i--)
		{   
			temp=temp+word.charAt(i);	
			
		}
		
		if(temp.equalsIgnoreCase(word))
		{System.out.println("Palindrome "+word);		 
	    }	
	}
	}
}
	