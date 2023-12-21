package Practise;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(("Enter the number"));
	int num=sc.nextInt();
int tempno=num;
	int sum=0;
	int lastdigit=0;
	while(tempno!=0) {
	lastdigit=tempno%10;
	sum=sum+lastdigit;
	tempno=tempno/10;
	}
	
	System.out.println("sum of digits is : "+sum);
	}

}
