package interviewJavaCodes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = myObj.nextInt();
		
		int rev;
		int temp = n;
		int arm = 0;
		
		while(n > 0) {
			
			rev = n % 10;
			arm = arm + (rev*rev*rev);
			
			n = n / 10;
			
		}
		
		if(temp == arm)
			System.out.println(temp + " is Armstrong Number.");
		else
			System.out.println(temp + " is NOT Armstrong Number.");
	
	}

}
