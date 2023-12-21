package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class ArrayString {
public static void main(String[] args) {
	ArrayString obj=new ArrayString();
	obj.conversion();

}
public void conversion()
{
	System.out.println("Enter the size of array");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	String[] array=new String[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++) {
	array[i]=sc.next();}
	System.out.println("\nArray before coversion");
	for(int i=0;i<n;i++) {
System.out.print(array[i]+" ");
	}
	System.out.println("\n Array after conversion into string");
	for(int i=0;i<n;i++) {
		String str=array[i].toString();
		System.out.print(str+" ");
		
	}
}
}