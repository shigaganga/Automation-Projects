package sep2023JavaBasics.Day1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwapWithVariable();
SwapWithoutVariable();
	}
public static void SwapWithVariable() {
	System.out.println("Swaping with third variable"); 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number num1 =");
	int num1=sc.nextInt();
	System.out.println("Enter second number num2 =");
	int num2=sc.nextInt();
	int temp;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("after swaping num1 ="+num1);
	System.out.println("after swapping num2 ="+num2);
}

public static void SwapWithoutVariable() {
	System.out.println("Swaping without third variable"); 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number num1 =");
	int num1=sc.nextInt();
	System.out.println("Enter second number num2 =");
	int num2=sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("after swaping num1 ="+num1);
	System.out.println("after swapping num2 ="+num2);
}
}