package Assignments;

import java.util.Scanner;

public class VowelReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
char stringArray[]=str.toCharArray();
for(int i=0;i<stringArray.length;i++) {
	if(stringArray[i]=='a'|| stringArray[i]=='e'|| stringArray[i]=='i'||stringArray[i]=='o'||stringArray[i]=='u') {
	
	str = str.replace(stringArray[i], 'x');
	}

	}
System.out.println(str);
}}

