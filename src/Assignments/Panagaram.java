package Assignments;

import java.util.Scanner;

public class Panagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str= sc.nextLine();
boolean pangram=isPanagram(str.toLowerCase());
if(pangram) {
	System.out.println("The given string is panagram");
}else {
	System.out.println("The given string is not panagram");
}

	}
private static boolean isPanagram(String str) {
	boolean panagramFlag=true;
	if(str.length()<26) {
		panagramFlag= false;
		return panagramFlag;
	}else {
		for(char ch='a';ch<='z';ch++) {
			if(str.indexOf(ch)<0) {
				panagramFlag= false;
				return panagramFlag;
			}
			
		}
		
	}
	return panagramFlag;
}
}
