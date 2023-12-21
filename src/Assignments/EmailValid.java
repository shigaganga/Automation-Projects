package Assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

import Day3.ScannarDemo;

public class EmailValid {

	public static boolean IsValid(String email) {
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
		Pattern pat=Pattern.compile(emailRegex);
		if(email==null) {
			return false;
		}
		return pat.matcher(email).matches();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email");
		String email=sc.nextLine();
		System.out.println(IsValid(email));
	}
}
