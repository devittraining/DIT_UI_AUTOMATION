package coreJavaPrograms;

public class ConstructorTest {

	/*
		// Default Constructor
		public ConstructorTest() {
		
		}
	*/
	
	  int x;  // Create a class attribute
	static int y2 = 1;

	  // Create a class constructor for the ConstructorTest class
	  public ConstructorTest() {
	    x = 5;  // Set the initial value for the class attribute x
	  }
	  
	  // Parameterized Constructor
	  public ConstructorTest(int y1) {
		System.out.println(y1);
		this.y2 = y1;
		
	  }

	  public static void main(String[] args) {
	    
		ConstructorTest myObj1 = new ConstructorTest(); 
	    // Create an object of class ConstructorTest (This will call the constructor)
	    
	    System.out.println("Constructor with NO Argument : " + myObj1.x); // Print the value of x
	    System.out.println(y2);
	    int m = 10;
	    ConstructorTest myObj2 = new ConstructorTest(m);
	    
	    System.out.println("Constructor with Argument : " + myObj2.y2); // Print the value of x
	    
	  }

}
