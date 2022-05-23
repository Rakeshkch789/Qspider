package String;

public class Practise {

	public static void main(String[] args) 
	{
		String s="rakesh";
		char s1=s.charAt(3);
		char[] s2=s.toCharArray();
		System.out.println(s1);
		System.out.println(s2);
		String s3=s.toUpperCase();
		System.out.println(s3);
		String s4=s3.toLowerCase();
		System.out.println(s4);
		String s5="rocky";
		String s6=s.concat(s5);
		System.out.println(s6);
		int s7=s5.length();
		System.out.println(s7);
		int s8=s5.indexOf(s);
		System.out.println(s8);
	}

}
