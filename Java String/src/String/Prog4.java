package String;

import java.util.Scanner;

//Program to count total number of vowels and consonants in a string.
public class Prog4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		int vcount = 0, ccount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U')
				vcount++;
			else
				ccount++;
		}
		System.out.println("Number of vowels present in the string are: " + vcount);
		System.out.println("Number of consonant present in the string are: " + ccount);

	}

}
