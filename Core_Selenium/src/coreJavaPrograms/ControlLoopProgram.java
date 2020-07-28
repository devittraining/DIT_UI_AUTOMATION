package coreJavaPrograms;

public class ControlLoopProgram {

	public static void main(String[] args) {
		
		/*
		
			WHILE Loop:
				First check the condition then go into the loop and perform tasks
			DO WHILE Loop:
				First performs task and then check the condition
				At least once tasks are performed
				
				
			loop(a>10){
				-------------
				------------
				-------------
				a=9;
			}	
		 
		*/
		
		int i, j, k;
		
		// ********************* FOR LOOP *********************
		
		System.out.println("FOR LOOP Output: ");
		
		for(i=1; i<=5; i++) {
			System.out.println(i + " output ");
		}

		// ********************* WHILE LOOP *********************
		
		System.out.println("\t" + "WHILE LOOP Output: ");
		
		j = 1;
		while(j<=5) {
			System.out.print(j + "");
			j++;
		}
		
	
		// ********************* DO-WHILE LOOP *********************
		
		System.out.println("\n" + "DO-WHILE LOOP Output: ");
		
		k = 6;
		do {
			System.out.print(k + " ");
			k++;
		}
		while(k<=5);

	}

}
