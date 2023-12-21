package sep2023JavaBasics.Day6Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Intersection();
	}
	public static void Intersection() {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr1=new ArrayList<>();//create arraylist of name arr1
		ArrayList<Integer> arr2=new ArrayList<>();
		System.out.println("How many values you want to enter");
		int n=sc.nextInt();
		System.out.println("please enter the values of first arraylist");
		for(int i=0;i<n;i++) {
			arr1.add(sc.nextInt());
		}
		System.out.println("First arraylist:");
		for(int value:arr1) {  
		System.out.println(value);
		//for(int i=0;i<arr1.size();i++){
        //System.out.println(arr1.get(i));}
		}
		System.out.println("Enter second arraylist elements");
		for(int i=0;i<n;i++) {
			arr2.add(sc.nextInt());
		}
		System.out.println("second arraylist:");
		for(int value:arr2) {  
		System.out.println(value);
		}
		arr1.retainAll(arr2);//retains common elements in the arraylist,retained in thearraylist itself
		System.out.println("Intersection of two arraylist: "+arr1);
		
	}
	
	

}
