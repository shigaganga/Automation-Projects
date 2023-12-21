package Practise;

import java.util.Scanner;

public  class SumDigitsRecursion {
	int sum=0; int lastdigit;
 int SumDigit(int number) {
		if(number==0) {
			return sum;
		}
		else {
			lastdigit=number%10;//to find last digit
			sum=sum+lastdigit;
			number=number/10;//to remove last digit from no
			SumDigit(number);
		}
		return(sum);
	}

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number ");
int num=sc.nextInt();
	}

}
