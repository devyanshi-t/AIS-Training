import java.util.Scanner;
public class Prog1 {

   public  static void main(String args[])
		{
			String arr[]=new String[5];
			String temp;
			String temp2="";
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Input 5 strings");
			for(int i=0;i<5;i++)//input the values from user
			{
				
				arr[i]=sc.next();
			}
			for(int i=0;i<arr.length;i++)
			{
			    temp=arr[i];
			    StringBuffer sb=new StringBuffer(temp);
			    temp2=new String(sb.reverse());
			    if(temp2.contentEquals(temp))
			    {	count++;
			    System.out.println(" Found a palindrome "+temp);
			    }
			    
			   
			    
			}
			System.out.println("Count of palindrome strings = " +count);
			
		}
			
			
			
		
}