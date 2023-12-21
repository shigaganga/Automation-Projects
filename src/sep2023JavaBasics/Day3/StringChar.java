package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion();
	}
public static void conversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();
		char[] ch=str.toCharArray();
		System.out.println("string after converted to char array:");
		for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);}
		sc.close();
	}
	}


