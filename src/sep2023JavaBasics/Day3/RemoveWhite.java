package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class RemoveWhite {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.next();
		RemoveWhite obj=new RemoveWhite();
	String str3=	obj.White(str);
	System.out.println("String after removing all white spaces is"+str3);
	}	
	public String White(String str) {
		 str=str.replaceAll("\\s", " ");
		//String str1=str.trim();
   return(str);
}}
