package Assignments;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
char charArray[]=str.toCharArray();
System.out.println(charArray);
boolean space=true;
for(int i=0;i<charArray.length;i++) {
	
	if(Character.isLetter(charArray[i])) {
		if(space==true) {
			charArray[i]=Character.toUpperCase(charArray[i]);
			space=false;
		}
	}
	else {
		space=true;
	
}}
str=String.valueOf(charArray);
System.out.println("Titlecased string: "+str);
}}