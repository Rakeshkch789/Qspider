package String;

import java.util.Scanner;

//Program to determine whether a string is pallindrome or not
public class Prog8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1="";
		String s2=s.toLowerCase();
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s2.charAt(i);
		}
		if(s2.equals(s1))
		{
			System.out.println("String is a pallindrome.");
			System.out.println("Pallindrome string is: "+s2);
		}
		else
			System.out.println("String is not a pallindrome.");
	}
}
