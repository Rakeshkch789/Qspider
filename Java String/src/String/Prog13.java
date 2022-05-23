package String;

import java.util.Scanner;

//Program to conver uppercase to lowercase
public class Prog13 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		System.out.println(s1);
	}
}
