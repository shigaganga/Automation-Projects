package Practise;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();
int tempno=number;
int digits=0;
int sum=0;
while(tempno>0) {
	tempno=tempno/10;
	digits++;
}
System.out.println("no of digits : "+digits);
tempno=number;
while (tempno!= 0)
{
    int lastDigit = tempno % 10;
    System.out.println("lastdigit: "+lastDigit);

    int lastDigitToThePowerOfNoOfDigits = 1;

    for(int i = 1; i <= digits; i++)
    {
        lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
        //inside for loop so digits times iteration(1*3*3*3)
    }
System.out.println("lastDigitToThePowerOfNoOfDigits: "+lastDigitToThePowerOfNoOfDigits);
    sum = sum + lastDigitToThePowerOfNoOfDigits;
System.out.println("sum is"+sum);
    tempno= tempno / 10;
}

if (sum == number)
{
    System.out.println(number+" is an armstrong number");
}
else
{
    System.out.println(number+" is not an armstrong number");

}
}}