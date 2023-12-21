package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string");
String str1=sc.nextLine();
System.out.println("Enter the second string");
String str2=sc.nextLine();
String WhiteSpaceStr1=str1.replaceAll("\\s", "");
String WhiteSpaceStr2=str2.replaceAll("\\s", "");
Boolean BoolAnagram=true;
if(WhiteSpaceStr1.length()!=WhiteSpaceStr2.length()) {
	 BoolAnagram=false;
}else {
	char CharArray1[]=WhiteSpaceStr1.toLowerCase().toCharArray();
	char CharArray2[]=WhiteSpaceStr2.toLowerCase().toCharArray();
	Arrays.sort(CharArray1);
	Arrays.sort(CharArray2);
	BoolAnagram=Arrays.equals(CharArray1,CharArray2);
}
if(BoolAnagram) {
	System.out.println("The given two strings  are anagram");
	
}else {
	System.out.println("The given two strings are not anagram");
}
	}

}
