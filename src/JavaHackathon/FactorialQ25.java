//Q28. WJP to find factorial of a number using recursion
package JavaHackathon;

import java.util.Scanner;

public class FactorialQ25 {

		public static void main(String[] args) {
			System.out.println("Enter the number to find the factorial");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
		int fact=factorial(num);
		System.out.println("factorial of "+num+ " is:"+fact);
		}
	public static int factorial(int num) {
	if(num==1) {
		//System.out.println("factorial of "+num+ " is=1");
		return 1;
		
		}else {
			return num*factorial(num-1);
		}
		
	}
	}
	


