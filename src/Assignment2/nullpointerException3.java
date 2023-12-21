package Assignment2;

import java.util.Scanner;

public class nullpointerException3 {
	public  String nullUpperCase() {
		String UpStr="";
		String str=null;
		try {
	UpStr=str.toUpperCase();
		}
		catch(NullPointerException ex) {
			System.out.println("do not give  variable as null :"+ex);
		}
	
		return(UpStr);
	}
public static void main(String[] args) {
	nullpointerException3 obj=new nullpointerException3();
String str2=obj.nullUpperCase();
System.out.println("Uppercased string is: "+str2);
	
}
}
