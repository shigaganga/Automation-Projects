package sep2023JavaBasics.Day4;

import java.util.Scanner;

public class SumToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
	}
	public static void sum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array= new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		 sum=sum+array[i];
		}
System.out.println("sum of all elements are:"+sum);
	System.out.println("New array elements after adding sum to each element");
	int total=0;
	for(int i=0;i<array.length;i++) {
		total=sum+array[i];
		System.out.println(total);
		
	}
	}}
