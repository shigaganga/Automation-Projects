package sep2023JavaBasics.Day4.copy;

import java.util.Scanner;

public class FreequencyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumberOfChar();	
	}
	public static void NumberOfChar() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str= sc.next();
	str=str.replace(" ", "");//replace all whitespace
	while(str.length()>0)//tranversing through while loop
	{
		char ch=str.charAt(0);//character at the 0 index stored in ch
	
		System.out.println(ch+" "+countChar(str,ch));
	}
}
}