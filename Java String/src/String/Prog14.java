package String;

import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s=sc.nextLine();
		String s1=s.toUpperCase();
		System.out.println(s1);
	}
}