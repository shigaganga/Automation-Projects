package Practise;

import java.util.Scanner;

public class MultiplicationTable {
	public static int multi() {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int multip=1;
		for(int i=1;i<=10;i++) {
			multip=num*i;
			System.out.println(i+" * "+num+" = " +multip);
	
		}
		return(multip);
	}
public static void main(String[] args) {
	multi();

}
}
