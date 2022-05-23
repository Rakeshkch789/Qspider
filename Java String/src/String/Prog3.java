package String;

import java.util.Scanner;

////Program to count the total number of punctuation characters in a String

public class Prog3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='!'||s.charAt(i)==' '||s.charAt(i)=='"'||s.charAt(i)=='?'||s.charAt(i)=='-'||s.charAt(i)==';')
				count++;
		}
		System.out.println("Number of punctuation present in the string are: "+count);

	}

}
//
