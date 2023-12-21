package Assignments;

import java.util.Scanner;

public class StringWithoutWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
	//	String str2=str.replaceAll("\\s", " ");
		char charArray[]=str.toCharArray();
		String strWithoutSpace="";

		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=' ') {
				strWithoutSpace=strWithoutSpace+charArray[i];
			}
		}
System.out.println("Inputstring without space:  "+strWithoutSpace);
	}

}
