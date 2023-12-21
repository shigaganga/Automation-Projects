package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int myarray1[]=new int[length];
		System.out.println("Enter the elements of array");
	
for(int i=0;i<length;i++) {
	myarray1[i]=sc.nextInt();
}
System.out.println("first array: "+Arrays.toString(myarray1));	

System.out.println("Enter the elements of second array");

int myarray2[]=new int[length];
for(int j=0;j<length;j++) {
myarray2[j]=sc.nextInt();

}

System.out.println("Second array: "+Arrays.toString(myarray2));	
int duplicates=0;
for(int i=0;i<myarray1.length;i++) {
	for(int j=0;j<myarray2.length;j++) {
		if(myarray1[i]==myarray2[j]) {
			 duplicates++;
	}
	}}
System.out.println(" no of duplicates: "+duplicates);
	}
	}
	


