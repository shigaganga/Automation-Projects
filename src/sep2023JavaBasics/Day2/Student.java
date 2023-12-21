package sep2023JavaBasics.Day2;

import java.util.Scanner;

import Day3.ScannarDemo;

public class Student {

			public int id;
			public String name;
			public int phoneno;
			public String country;

			
			public Student(int id,String name,int phoneno,String country) {
				this.id=id;
				this.name=name;
				this.phoneno=phoneno;
				this.country=country;
			}	
			public void printInfo() {
				System.out.println("id="+this.id);
				System.out.println("name="+this.name);
				System.out.println("phoneno="+this.phoneno);
				System.out.println("country="+this.country);
			}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name of student");
	System.out.println("Enter the id of student");
	System.out.println("Enter the phoneno of student");
	System.out.println("Enter the country of student");
	String name=sc.next();
	int id=sc.nextInt();
	int phoneno=sc.nextInt();
	String country=sc.next();
	Student obj1=new Student(id,name,phoneno,country);
	Student obj2=new Student(id,name,phoneno,country);
	Student obj3=new Student(id,name,phoneno,country);
	Student obj4=new Student(id,name,phoneno,country);
	Student obj5=new Student(id,name,phoneno,country);
	
	
	obj1.printInfo();
	obj2.printInfo();
	obj3.printInfo();
	obj3.printInfo();
	obj4.printInfo();
	
	
}
	}


