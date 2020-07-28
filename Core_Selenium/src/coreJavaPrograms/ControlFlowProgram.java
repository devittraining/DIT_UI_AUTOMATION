package coreJavaPrograms;

public class ControlFlowProgram {

	public static void main(String[] args) {
		
		/*
		
		Control Flow Statements
			When we need to execute bunch of statements based on condition 
			then we need Control Flow Statement
				If statement
				Nested If (If inside If)
				If – Else
				If – Else – If
		 
		*/

		int first_variable = 1;
		int second_variable = 5;
		int third_variable = 10;
		
	/*
		if(condition) {
			---------------
			----------------
			--------------
			if(condition){
				--------------
				-------------
			}
		}
		else{
			---------------
			---------------
		}
		
	*/	
		
		
		
		
		
		// ***************** If Statement *****************
		System.out.println("\n\n");
		if(first_variable > second_variable) {
			System.out.println("First Variable is greater than Second Variable");
		}
		
		// ***************** Nested If Statement *****************
		System.out.println("\n\n");
		if(first_variable > second_variable) {
			
			System.out.println("First Variable is greater than Second Variable");
			
			if(second_variable > third_variable)
				System.out.println("Second Variable is greater than Third Variable");
			
		}
		
		
		// ***************** If - Else Statement *****************
		System.out.println("\n\n");
		if(first_variable > second_variable)
			System.out.println("First Variable is greater than Second Variable");
		else
			System.out.println("Second Variable is greater than First Variable");
		
		
		// ***************** If - Else - If Statement *****************
		System.out.println("\n\n");
		if(first_variable > second_variable)
			System.out.println("First Variable is greater than Second Variable");
			else 
			{
				System.out.println("Second Variable is greater than First Variable");
		
				if(second_variable > third_variable)
					System.out.println("Second Variable is greater than Third Variable");	
			}
	}

}
