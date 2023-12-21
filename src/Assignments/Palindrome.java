package Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
	String reverse="";
for(int i=str.length()-1;i>=0;i--) {
	reverse=reverse+str.charAt(i);
}
if((str.toLowerCase()).equals(reverse.toLowerCase())) {
	System.out.println("The string is palindrome");
}else {
	System.out.println("The given string is not palindrome");
}
	}

}
