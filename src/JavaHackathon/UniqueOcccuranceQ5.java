//Q5.	Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

package JavaHackathon;

import java.util.Scanner;

public class UniqueOcccuranceQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void unique() {

	    
	        int n, x, count = 0, i = 0;
	       Scanner sc= new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(i = 0; i < n; i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        System.out.print("Enter the element of which you want to count number of occurrences:");
	        x = sc.nextInt();
	        for(i = 0; i < n; i++)
	        {
	            if(a[i] == x)
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of Occurrence of the Element:"+count);
	    }
	}


