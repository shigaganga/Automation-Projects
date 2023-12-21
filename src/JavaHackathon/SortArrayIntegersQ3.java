//3)Given an array of integers, sort the integer values.

package JavaHackathon;

import java.util.Scanner;

public class SortArrayIntegersQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Arrays before bubble sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<=array.length-1;j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
				if(array[j-1]==array[j]) {
					array[j]=temp;
				}
			
				}}
		}
		System.out.println(" Array after bubble sorting");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}	
		}

	
public static void BubbleSort(int[]array) {
	
	int temp=0;
	for(int i=0;i<array.length;i++) {
		for(int j=1;j<=array.length-1;j++) {
			if(array[j-1]>array[j]) {
				temp=array[j-1];
			if(array[j-1]==array[j]) {
				array[j]=temp;
			}
		
			}}
	}
	System.out.println(" Array after bubble sorting");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}	
}}

