package sep2023JavaBasics.Day6Collections;

import java.util.ArrayList;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Merge();
	}
public static void Merge() {
	ArrayList<String>list1=new ArrayList<>();
	
	list1.add("shiga");
	list1.add("ganga");
	list1.add("arush");
	list1.add("kanmani");
	list1.add("shaju");
	System.out.println("Arraylist1: "+list1);//print arraylist
	ArrayList<String>list2=new ArrayList<>();
	list2.add("nimi");
	list2.add("kuttu");
	list2.add("kunju");
	list2.add("chinju");
	list2.add("thanvi");
	System.out.println("Arraylist2: "+list2);//print arraylist
	list1.addAll(list2);
	System.out.println("After combining two array elements: "+list1);
	
	
}
}
