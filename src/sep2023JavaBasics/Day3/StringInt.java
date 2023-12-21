package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class StringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
conversion();
	}
public static void conversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();
		int strInt=Integer.parseInt(str);
		System.out.println("after conversion of string in to integer"+strInt);
		sc.close();
	}
}