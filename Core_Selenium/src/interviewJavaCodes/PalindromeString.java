package interviewJavaCodes;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = myObj.nextLine();
		
		String temp = str;
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
			rev = rev + str.charAt(i);
		
		if(str.equals(rev))
			System.out.println(temp + " is Palindrome String.");
		else
			System.out.println(temp + " is NOT Palindrome String.");

	}

}
