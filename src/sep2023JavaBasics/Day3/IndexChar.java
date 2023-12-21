package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class IndexChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion();
	}
public static void conversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();
		int first=str.indexOf(0);
		System.out.println("first index of given string is"+first);
		sc.close();
	}
	}


