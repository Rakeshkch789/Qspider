package String;

//Program to count the number of characters in a String

import java.util.Scanner;

class Prog1
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string: ");
				String s=sc.nextLine();
				int count=0;
				for(int i=0;i<s.length();i++)
					{
						if(s.charAt(i)!=' ')
							count++;
					}
				System.out.println("Number of characters present in the string are: "+count);
			}
	}