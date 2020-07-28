package coreJavaPrograms;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		/*
		
		SWITCH Case:
			If we have number of options / choices and 
			if we need to perform different tasks for each choices then we used Switch Case
		BREAK Statement:
			Normally used in Switch Case, but it is optional
		
		*/
		
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Enter Week Day's Number: ");

	   int day_number = myObj.nextInt();  // Read user input
	
		switch (day_number) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
	}

}
