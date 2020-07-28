package interviewJavaCodes;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = myObj.nextInt();
		
		int rev = 0;
		int temp = n;
		
		while(n > 0) {
			
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
			
		}

		if(temp == rev)
			System.out.println(temp + " is Palindrome Number.");
		else
			System.out.println(temp + " is NOT Palindrome Number.");
		
	}

}
