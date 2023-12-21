package sep2023JavaBasics.Day5;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n= sc.nextInt();
		System.out.println("Enter the array elements");
		int[] a= new int[n];
		for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		Sequential(0, n-1, key, a);
		
	}
	public static void Sequential(int low,int high,int key,int[] a) {
		int i;
		for(i=low;i<=high;i++) {
			if(a[i]==key) {
			System.out.println("The element is present in the list");
			break;
		}}//if and for loop closed
	if(i>high)
		System.out.println("The element is not present in the list");
	

}}