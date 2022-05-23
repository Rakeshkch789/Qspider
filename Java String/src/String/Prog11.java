package String;

import java.util.Scanner;

//Program to find the sum of numbers in a alpha numeric string.
public class Prog11 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s=sc.nextLine(); 
		int sum=0;
		String temp="0";
		for(int i=0;i<s.length();i++) {
			 char ch = s.charAt(i);
			 if (Character.isDigit(ch)) //determines whether the given character is a digit or not.
				 								//return value is boolean
	                temp += ch;
			 else
			 {
				 sum += Integer.parseInt(temp);
				 temp = "0";
			 }
		}
		System.out.print("The sum of numbers are: ");
		System.out.println(sum+Integer.parseInt(temp));
	}
}
