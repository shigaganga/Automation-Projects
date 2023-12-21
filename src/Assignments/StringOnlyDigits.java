package Assignments;

import java.util.Scanner;

public class StringOnlyDigits {
	public static boolean digitStringCheck(String s){
		if(s == null){
			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
			
		}
		
	
return true;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		boolean result=digitStringCheck(str);
		System.out.println(result);

	}

	}
