package coreJavaPrograms;

public class BasicJavaProgram {

	static int static_class_variable;

	public static void otherMethod() {
		
		static_class_variable = 100;
		System.out.println("Static Class Variable from Other Method : " + static_class_variable);
	
	}
	
	public static void main(String[] args) {
		
		/*
		
		public static void main(String args[])
		public – we can call this method from outside the class
		static – No need to create object
		void – nothing return
		main – name of the method
		String args[] – command line argument that are passed as String

		Access Modifiers
			Private (default)
			Protected
			Public
		 
		*/
		
		/*
		 
		VARIABLES: 
			It is the name of which value that can be changed
			Static Variables
				Class variables
				Associated with the class
				Common for all instances
				We can use it without object
			Instance Variables
				It has its own separate copy
			Local Variables
				Declared inside the method
				Scope only inside the method
		
		Datatypes:
			Define the values that variable can take
				byte, short, int, long – whole numbers
				float, double – fractional numbers
				char – characters 
				String - words, sentence
				Boolean – true / false

		Literals:
			Fixed value that we assigned to variable
			Example – int a == 10; a=10.50, a='x', a="hello, how are you?"
			
			Int a = 10;
			
			a == 20;
			
		Operators:
			It is a characters that represent an action
			Example: =, ==, !=, >, <, >=, <=

		*/

		double local_main_variable = 10.15; // Literal
		static_class_variable = 10; // Assigning Value to Variable
		
		System.out.println("Local Variable from Main Method : " + local_main_variable);
		System.out.println("Static Class Variable form Main Method : " + static_class_variable);
		
		otherMethod();
	}
	


}