package interviewJavaCodes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = myObj.nextInt();
		
		int rev = 0;
		
		while(n > 0) {
			
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
			
		}

		System.out.println("Reverse of given number is : " + rev);
		
	}

}
