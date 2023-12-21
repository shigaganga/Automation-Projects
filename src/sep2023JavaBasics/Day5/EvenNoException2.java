package sep2023JavaBasics.Day5;

import java.util.Scanner;

public class EvenNoException2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)   {

				Even();
			
		}

public static void Even()  {
	
	System.out.println("Enter an even number");
	int evenNo=sc.nextInt();
	try {
		if(evenNo%2==0) {
			System.out.println("The number is even");
		}
		else {
			throw new MeDefinedException2();
		}
		
	}catch(MeDefinedException2 e) {
		// TODO Auto-generated catch block
		e.MyMessage();
		Even();
	}
	
	
}
}