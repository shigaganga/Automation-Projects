package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {	
	conversion();
}
public static void conversion() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str= sc.next();
	String[] words=str.split("\\s+");
	int count=words.length;
	System.out.println("number of words"+count);
	sc.close();
}
}
