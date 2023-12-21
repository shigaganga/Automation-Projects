package Assignments;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char charArray[]=str.toCharArray();
		int count=0;
		for(int i=0;i<charArray.length;i++) {
			if((charArray[i]=='a')||(charArray[i]=='e')||(charArray[i]=='i')||(charArray[i]=='o')||(charArray[i]=='u')){
				count=count+1;
		}}
			System.out.println("no of vowels: "+count);
		
		}

	}

