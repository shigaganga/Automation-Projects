//3)Given an array of integers, sort the integer values.

package JavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayIntQ3 {

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
		System.out.println("Arrays before sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
			}
		
			Arrays.sort(array);
			System.out.println();
			System.out.println("sorted numeric array is:");
			for(int j=0;j<array.length;j++) {
				System.out.print(array[j]+" ");
			}

			
		}

	}

