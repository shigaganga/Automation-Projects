package sep2023JavaBasics.Day2;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of fibbonacci series");
		int n=sc.nextInt();
		Fibbonacci obj=new Fibbonacci();
		obj.fib(n);
		
	}
	static	int n1=0,n2=1,n3=0;
public void fib(int n) {
System.out.print(n1+" "+n2);
	for(int i=2;i<=n; i++){
		                                 //0 and 1 already printed so i=2
n3=n1+n2;
System.out.print(" "+n3+" ");
n1=n2;n2=n3;
	}
}
}