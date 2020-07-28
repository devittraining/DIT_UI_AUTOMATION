package interviewJavaCodes;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter First String : ");
		String str1 = myObj.nextLine();
		
		System.out.print("Enter Second String : ");
		String str2 = myObj.nextLine();
		
		int counter = 0;
		
		for(int i=0; i<str1.length(); i++) {
			
			for(int j=0; j<str2.length(); j++) {
				
				if(str1.charAt(i) == str2.charAt(j))
					counter++;
				
			}
		}

		if(counter == str1.length() || counter == str2.length())
			System.out.println("Both Strings are Same...");
		else
			System.out.println("Both Strings are NOT Same...");
		
	}

}
