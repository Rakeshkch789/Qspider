package String;

import java.util.Scanner;

//Program to remove all the white spaces in a string
public class Prog5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				s1=s1+s.charAt(i);
		}
       System.out.println(s1);
	}
}
