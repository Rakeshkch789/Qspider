package String;
//Program to find reverse of a String (using StringBuilder class)
import java.util.Scanner;

public class Prog7A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
//		sb.append(s);
		sb.reverse();
		System.out.println("Reverse of the string is: "+sb);
	}
}
