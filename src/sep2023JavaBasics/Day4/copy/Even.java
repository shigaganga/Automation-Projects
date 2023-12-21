package sep2023JavaBasics.Day4.copy;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		EvenOnly();

	}
public static void EvenOnly() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
	array[i]=sc.nextInt();
	}
System.out.println("Array elements are");{
	for(int i=0;i<n;i++) {
		System.out.print(" "+array[i]);
	}
	System.out.println("\nArray of even numbers are:");
	
	for(int i=0;i<n;i++) {
		if(array[i]%2==0){
			int arrayEven=array[i];
		System.out.print(" "+arrayEven);
	}}
}
}
}