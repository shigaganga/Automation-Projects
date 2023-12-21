package Assignments;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String longestword="";
		int longestWordLength=0;
	String strArray[]=str.split("\\s");
for(int i=0;i<strArray.length;i++) {

	int length=strArray[i].length();
	if(length>longestWordLength) {
		longestWordLength=length;
		longestword=strArray[i];
			
		}
	}
System.out.println("longest word is : "+longestword);
System.out.println("longest word length is: "+longestWordLength);
}
	}


