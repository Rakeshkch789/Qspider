package String;

//Program to count the number of words in a String

import java.util.Scanner;

class Prog2
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string: ");
				String s=sc.nextLine();
				int count=0;
				for(int i=0;i<s.length();i++)
					{
						if(i==0 && s.charAt(i)!=' ' || s.charAt(i)!=' ' && s.charAt(i-1)==' ')
							count++;
					}
				System.out.println("Number of words present in the string are: "+count);
			}
	}
