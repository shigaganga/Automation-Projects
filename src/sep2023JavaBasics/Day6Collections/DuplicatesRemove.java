package sep2023JavaBasics.Day6Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicatesRemove {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string you want to remove duplicates");
String str=sc.next();
		RemoveDupe(str);// TODO Auto-generated method stub

	}
public static void RemoveDupe(String str) {
	LinkedHashSet<Character> linkSet=new LinkedHashSet<>();
	//add each character of string in to hashset
	for(int i=0;i<str.length();i++) {
		linkSet.add(str.charAt(i));
	}
	// print the string after removing duplicate characters   
    for(Character ch :linkSet) 
    	
        System.out.print(ch);  
   
    }

}

