package coreJavaPrograms;

public class XClassInInheritance extends YClassInInheritance{

	public static void main(String[] args) {
		
		XClassInInheritance obj = new XClassInInheritance();
		XClassMethod();
		
		obj.yClassMethod();
				
		YClassInInheritance objy = new YClassInInheritance();	
		objy.YClassInInheritance();
		objy.yClassMethod();
		
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void XClassMethod() {
		
		System.out.println("I am in X Class");
		
	}

}
