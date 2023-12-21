//Q17.  //WJP to find total number of integers, uppercase and lowercase character in the give string
package JavaHackathon;

import java.util.Scanner;

public class NoOfUpperLowerIntQ17 {
	public static void main(String[] args) {
		check();
	}


public static void check() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	int uppercase=0;
	int lowercase=0;
	int num=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>'A'&&ch<'Z')
			uppercase++;
		if(ch>'a'&&ch<'z')
			lowercase++;
		if(ch>'1'&&ch<'9')
			num++;
	}
	System.out.println("total no of uppercases of this string: "+uppercase);
	System.out.println("total no of lowecases of this string: "+lowercase);
	System.out.println("total no of integer numbers of this string: "+num);
	
}}