package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first string");
String str1=sc.nextLine();
System.out.println("Enter the second string");
String str2=sc.nextLine();
//remove all white space
String whitestr1 = str1.replaceAll("\\s", "");
String whitestr2=str2.replaceAll("\\s", "");
boolean BoolAnagram=true;
if(whitestr1.length()!=whitestr2.length()) {
	BoolAnagram=false;
}else {
	//changing the string to lowercase and chararray
	

char chararray1[]=whitestr1.toLowerCase().toCharArray();
char chararray2[]=whitestr2.toLowerCase().toCharArray();
//sorting both array
Arrays.sort(chararray1);//sort has no return type so it cannot assign to another array,
Arrays.sort(chararray2);//so it is sorted and name is chararray2 itself
//checking both arrays equal(return true if it is equal
BoolAnagram = Arrays.equals(chararray1, chararray2);//arrays.equals returns boolean value
    }//eg:dormitory and dirty room:school master and the class room:keep and peek
	//output
	if(BoolAnagram) {
		System.out.println("The given two strings "+str1+ " and "+str2+" are anagram");
	}else {
		System.out.println("The given two strings "+str1+" and "+str2+"are not anagram");
	}	
	}}


