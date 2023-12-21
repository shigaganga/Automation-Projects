package sep2023JavaBasics.Day5;

import java.util.Scanner;

public class EvenNoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Even();

	}

	
	
public static void Even(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter an even number");
	int evenNo=sc.nextInt();
	try {
	if(evenNo%2==0) {
		System.out.println("The number is even");
	}
	else {
		throw new MeDefinedException();
	}}
	catch(MeDefinedException e) {
		e.MyMessage();
		
		
	}
		
	String usrInput=getUserInput();
	if(usrInput.equalsIgnoreCase("YES")) {
		Even();
	}
}
public static String getUserInput() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Do you want to continue");
	String usrInput=sc.next();
	return usrInput;
}
}
