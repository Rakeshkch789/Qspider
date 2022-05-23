package String;

import java.util.Arrays;
import java.util.Scanner;

//Program to determine whether 2 strings are anagram or not.
//rescue & secure
public class Prog9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string: ");
		String s1=sc.nextLine();
		char[] s2=s1.toCharArray();
		Arrays.sort(s2); //sorted in ascending order
		System.out.println("Enter the 2nd string: ");
		String s3=sc.nextLine();
		char[] s4=s3.toCharArray();
		Arrays.sort(s4);
		boolean result=Arrays.equals(s2, s4);
		if(result==true)
			System.out.println("Strings are anagram.");
		else
			System.out.println("Strings are not anagram.");
	}
}
