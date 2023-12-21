package sep2023JavaBasics.Day3;

import java.util.Scanner;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caps();

	}
	public static void Caps() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.next();
	//	char[] charArrayString=str.toCharArray();
	//	for(int i=0;i<=charArrayString.length;i++) {
		
			String words[]=str.split("\\");
			String Newword="";
			for(String i:words) {
				String first=i.substring(0,1);
				String afterfirst=i.substring(1);
				Newword+=first.toUpperCase()+afterfirst+"";
				System.out.println(Newword.trim());
				
		}
	}

}
