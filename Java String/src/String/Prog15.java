package String;

import java.util.Scanner;

//Program to find the duplicate characters in a string.
public class Prog15 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		System.out.println("The duplicate characters in the string are: ");
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j] && s1[i]!=' ')
				{	
					count++;
					s1[j]='0';
		        }
			}
			if(count>1&&s1[i]!='0')
				System.out.println(s1[i]);
		}		
	}
}