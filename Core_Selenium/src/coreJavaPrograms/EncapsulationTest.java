package coreJavaPrograms;


/*

	The whole idea behind encapsulation is to hide the implementation details from users. 
	If a data member is private it means it can only be accessed within the same class. 
	No outside class can access private data member (variable) of other class.

	However if we setup public getter and setter methods to update 
	(for example void setSSN(int ssn))and read (for example  int getSSN()) 
	the private data fields then the outside class can access those private data fields via public methods.

	This way data can only be accessed by public methods thus making the private fields and 
	their implementation hidden for outside classes. 
	That’s why encapsulation is known as data hiding. Lets see an example to understand this concept better.


	Advantages of encapsulation
	It improves maintainability and flexibility and re-usability: 
	for e.g. In the above code the implementation code of void setEmpName(String name) and String getEmpName() 
	can be changed at any point of time. Since the implementation is purely hidden for outside classes 
	they would still be accessing the private field empName using 
	the same methods (setEmpName(String name) and getEmpName()). 
	Hence the code can be maintained at any point of time without breaking the classes that uses the code. 
	This improves the re-usability of the underlying class.
	The fields can be made read-only (If we don’t define setter methods in the class) 
	or write-only (If we don’t define the getter methods in the class). 
	For e.g. If we have a field(or variable) that we don’t want to be changed 
	so we simply define the variable as private and instead of set and get both 
	we just need to define the get method for that variable. 
	Since the set method is not present there is no way an outside class can modify the value of that field.
	User would not be knowing what is going on behind the scene. 
	They would only be knowing that to update a field call set method and to read a field call get method 
	but what these set and get methods are doing is purely hidden from them.
	
	Encapsulation is also known as “data Hiding“.
	
	To get getter() & setter() methods - press - ALT + SHIFT + S - then press R

*/

class EncapsulationDemo{

	private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
 
}
public class EncapsulationTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
 
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}