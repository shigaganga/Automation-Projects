package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseEqual();
	}
	public static void CaseEqual() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  first string");
		String str1=sc.next();
		System.out.println("Enter the  Second string");
		String str2=sc.next();
		Boolean ComparedString=str1.equalsIgnoreCase(str2);
	System.out.println("Two strings are compared and its return value:"+ComparedString);
		
	}

}
