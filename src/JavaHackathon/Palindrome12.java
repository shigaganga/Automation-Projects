
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?

package JavaHackathon;

import java.util.Scanner;

public class Palindrome12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringPalindrome();
IntegerPalindrome();
	}


	public static void StringPalindrome() {
			
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
	public static void IntegerPalindrome() {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the IntegerNo");
int num=sc.nextInt();
	int reverseNum=0;int temp=num;
while(temp>0) {
	int remainder=temp%10;
	reverseNum=reverseNum*10+remainder;
	temp=temp/10;
}
if(num==reverseNum)
	System.out.println("The number is palindrome");
else 
	System.out.println("The given numbr is not palindrome");
}
	}

	



