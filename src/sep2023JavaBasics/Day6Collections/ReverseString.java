package sep2023JavaBasics.Day6Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringReverse();
	}
public static void StringReverse() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	char[] str1= str.toCharArray();
	ArrayList<Character>list=new ArrayList<Character>();
	int i=0;
	Iterator<Character> itr=list.iterator();
	while(itr.hasNext()) {
		list.add(str1[i]);
	}
	Collections.reverse(list);
	int size=list.size();//size of arraylist
	System.out.println("Reversed string:");
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(list.get(i));
	}
}
}
