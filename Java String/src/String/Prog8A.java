package String;

import java.util.Scanner;

public class Prog8A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		StringBuilder pal=new StringBuilder(s1);
		pal.reverse();
		String rev=pal.toString();
		if(rev.equals(s1))
			System.out.println("String is a pallindrome.");
		else
			System.out.println("String is not a pallindrome.");
	}

}
