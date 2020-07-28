package interviewJavaCodes;

import java.util.Scanner;

public class DuplicateCharactersFromString {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = myObj.nextLine();
		
		char[] a = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(a[i] == a[j])
					System.out.println(a[j]);
				
			}
		}

	}

}