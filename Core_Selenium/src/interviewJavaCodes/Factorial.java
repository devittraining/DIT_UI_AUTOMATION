package interviewJavaCodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = myObj.nextInt();
		
		int fact = 1;
		
		while(n > 1) {
			
			fact = fact * n;
			n--;
			
		}

		System.out.println("Factorial of given number is : " + fact);
		
	}

}
