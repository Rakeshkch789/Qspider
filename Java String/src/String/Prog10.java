package String;

import java.util.Scanner;

//Program to find minimum and maximum occurring character in a string.
public class Prog10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1=sc.nextLine();    // string input from user
		String s2=s1.toLowerCase(); // convert the string into lower case characters
		char[] s3=s2.toCharArray(); // convert string to array
		char[] s4=new char[s2.length()]; //new array creation
		int min,max;
		char minChar=s2.charAt(0),maxChar=s2.charAt(0);
		for(int i=0;i<s3.length;i++)
			{
			s4[i]=1;
				for(int j=i+1;j<s3.length;j++)
				{
					if(s3[i]==s3[j] && s3[i]!=' '&& s3[i]!='0')
					{	
						s4[i]++;
					    s3[j]=0;
					}
				}
		    }
			min=max=s4[0];
			for(int i=0;i<s4.length;i++)
			{
				if(min>s4[i] && s4[i]!='0')
				{
					min=s4[i];
					minChar=s3[i];
				}	
			if(max<s4[i])
				{
					max=s4[i];
					maxChar=s3[i];
				}
			}
		System.out.println("Minimum occurring character: "+minChar);
		System.out.println("Minimum occurring character: "+maxChar);
		}
	}
