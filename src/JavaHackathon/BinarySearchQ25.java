
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
package JavaHackathon;

import java.util.Scanner;

public class BinarySearchQ25 {
		public static void main(String[] args) {
			// TODO Auto-generated method stu
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the length of the array");
			int n= sc.nextInt();
		
			int[] arr=new int[n];
			System.out.println("Enter the array elements in ascending order");//othrwise sort
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the key element");
			int key=sc.nextInt();
	Binary(0,n-1,key,arr);
		}
		public static void Binary(int first,int last,int 
				key,int[] arr) {
			int mid = (first + last)/2;  //mid
			   while( first <= last ){  
			      if ( arr[mid] < key ){  
			        first = mid + 1;  //key is present in the right side   
			      }else if ( arr[mid] == key ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      }else{  //arr[mid]>key//key in the leftside
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
		}
		

	}


