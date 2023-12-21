
//4)Given an array of integers check the Palindrome of the series.
package JavaHackathon;

import java.util.Scanner;

public class PaliandromeQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
palindrm();
	}
public static void palindrm() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int[] array=new int[n];
	System.out.println("Enter the elements of array");
	int i;
	for( i=0;i<n;i++) {
		array[i]=sc.nextInt();}
		System.out.print(array[i]);
		  
	    for (int j= 0; j <= n / 2 && n != 0; j++) 
	    { 
	        if (array[j] != array[n - j- 1]) //first and last element
	        { 
	           
	          System.out.println("Array is not palindrome");
	        } 
	    
	  
	    else {
	    	System.out.println("Array is palindrome");
	    }
	   
	} 
	}}


