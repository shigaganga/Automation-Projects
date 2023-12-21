package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemCharString();

	}
	public static void RemCharString() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the  first string");
	String str1=sc.next();
	System.out.println("Enter the character to remove");
	String ch=sc.next();
	String RemString=str1.replace(ch, "");
	System.out.println("String after removing specific character is:"+RemString);
	


}
}