package Assignment2;

import java.util.Scanner;

public class NumberformatException2 {

	public int numberException() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int num =5;
		try {
		num=Integer.parseInt(str);
		}
		catch(NumberFormatException ex) {
			System.out.println("please enter numbers only"+ex);
			
		}
		return(num);
	}
	public static void main(String[] args) {
		NumberformatException2 obj=new NumberformatException2();
	
	int a=	obj.numberException();
		System.out.println("digit string is: "+a);
		}
}
