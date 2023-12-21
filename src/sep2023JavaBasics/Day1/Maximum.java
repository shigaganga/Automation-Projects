package sep2023JavaBasics.Day1;

import java.util.Scanner;

public class Maximum {
public static void main(String[] args) {
	Maximum obj=new Maximum();
obj.MaximumOfTwo();
obj.MaximumOfThree();
	
}
public void MaximumOfTwo() {
	System.out.println("Enter the first number");
	Scanner sc= new Scanner(System.in);
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	if(num1>num2) {
		System.out.println("Greatest number is "+num1);
	}else {
		System.out.println("Greatest number is "+num2);
		
	}
	
}
public void MaximumOfThree() {
	System.out.println("Enter the first number");
	Scanner sc= new Scanner(System.in);
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	System.out.println("Enter the third number");
	int num3=sc.nextInt();
	if(num1>num2&&num1>num3){
		System.out.println("Greatest among three is "+num1);
	}
	if(num2>num1&&num2>num3) {
		System.out.println("Greatest among three is"+num2);
	}else {
		System.out.println("Greatest among three is"+num3);
	}
}
}

