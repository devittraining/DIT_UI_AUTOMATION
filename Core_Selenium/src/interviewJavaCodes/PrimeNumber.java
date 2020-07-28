package interviewJavaCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = myObj.nextInt();
		
		int counter = 0;
		
		for(int i=1; i<=n ; i++) {
			
			if(n%i == 0)
				counter++;
			
		}
		
		if(counter == 2)
			System.out.println(n + " is Prime Number.");
		else
			System.out.println(n + " is NOT Prime Number.");

	}

}
