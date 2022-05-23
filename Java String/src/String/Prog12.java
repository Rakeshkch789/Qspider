package String;

import java.util.Scanner;

//Program to count the number of lowercase, uppercase, digits and special symbols in a string.
public class Prog12 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s=sc.nextLine(); 
		int lower=0,upper=0,digits=0,special_characters=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				digits++;
			else
				special_characters++;
		}
		System.out.println("Number of uppercase characters: "+upper);
		System.out.println("Number of lowercase characters: "+lower);
		System.out.println("Number of digits: "+digits);
		System.out.println("Number of special characters: "+special_characters);
	}
}