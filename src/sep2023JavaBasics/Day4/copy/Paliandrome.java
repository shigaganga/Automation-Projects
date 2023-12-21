package sep2023JavaBasics.Day4.copy;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		Paliandrome obj=new Paliandrome();
		obj.check();

	}
	public void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if((str.toLowerCase()).equals(reverse.toLowerCase())) {
			System.out.println("The string is paliandrome");
		}else {
			System.out.println("the string is not a paliandrom");
		}
	}

}
