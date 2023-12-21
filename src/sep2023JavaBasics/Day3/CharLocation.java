package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class CharLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion();
	}
public static void conversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();
	char ch=str.charAt(2);
		System.out.println("character at position 2 is: "+ch);
		sc.close();
	}
	}


