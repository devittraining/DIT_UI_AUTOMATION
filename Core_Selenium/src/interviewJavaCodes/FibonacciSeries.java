package interviewJavaCodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		int counter = 10;
		
		System.out.print(n1 + ", " + n2);
		
		while(counter>0) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(", " + n3);
			
			counter--;
			
		}
		
	}

}
