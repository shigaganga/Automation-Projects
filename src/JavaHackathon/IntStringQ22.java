
//Q22 WJP to convert int to string
package JavaHackathon;

import java.util.Scanner;

public class IntStringQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conversion();
	}
	public static void conversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=sc.nextInt();
		String numStr=Integer.toString(num);
		System.out.println("integer after converted to string is "+numStr);
				
	}

}

