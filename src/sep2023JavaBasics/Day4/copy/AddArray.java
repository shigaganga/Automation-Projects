package sep2023JavaBasics.Day4.copy;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddArray obj=new AddArray();
obj.add();
	}
public void add() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements of array");
	int n=sc.nextInt();
	int[] array=new int[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++) {
		
		array[i]=sc.nextInt();
		
	}
	System.out.println("Array elements are:");
	int sumOfArrayElements=0;
	for(int i=0;i<n;i++) {		
		System.out.print(" "+array[i]);
		sumOfArrayElements += array[i];	
	
	}
	System.out.println("\nsum of array elments = "+sumOfArrayElements);
}
}
