package sep2023JavaBasics.Day2;

import java.util.Scanner;

public class BubblesortArray {

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
bubble(array);

}

public static void bubble(int[] array) {
	System.out.println(" Array after bubble sorting");
	int temp=0;
	int i;int j;
	int n=array.length;
	for( i=0;i<n;i++) {
		for( j=1;j<=(n-1);j++) {
			if(array[j-1]>array[j]) {
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}}
				System.out.print(array[i]+" ");
				}}}