package Practise;

import java.util.Scanner;

public class Leapyear {
	public static void main (String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter what year you want to check");
		int year=obj.nextInt();
		obj.close();
		if((((year%4==0)&&(year%100!=0))||(year%400==0))){
			System.out.println(year +"is a leap year");
		}else {
			System.out.println("Its not a leap year");
		}
	}

}
