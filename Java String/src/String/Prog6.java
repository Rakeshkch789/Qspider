package String;

import java.util.Scanner;

//Program to replace the spaces in String with some specific character.
public class Prog6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				s1=s1+"$";
			else
				s1=s1+s.charAt(i);
		}
       System.out.println(s1);
	}
}
