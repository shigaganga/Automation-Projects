package sep2023JavaBasics.Day6Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Unique();
	}
public static void Unique() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string you want to remove duplicates");
	String str=sc.nextLine();
	String[] strArray=str.split("\\s+");
	Map<String, String> hOb=new HashMap<String,String>();
	for(int i=0;i<strArray.length;i++) {
		
		if(!hOb.containsKey(strArray[i]));{
			hOb.put(strArray[i], "unique");
		}
	}
	System.out.println(hOb);
}
}
