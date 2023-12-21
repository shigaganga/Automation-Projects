package sep2023JavaBasics.Day4;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maximum();
	}
public static void maximum() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int[] array= new int[n];
	for(int i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
System.out.println("Array elements are:");
int maximumValue=array[0];
for(int i=0;i<n;i++) {
	System.out.print(" "+array[i]);
	if(array[i]>maximumValue) {
		maximumValue=array[i];
	}}
System.out.println("\nmaximum value:"+maximumValue);

	}
}

