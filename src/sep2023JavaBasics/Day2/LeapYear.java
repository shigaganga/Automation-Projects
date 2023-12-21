package sep2023JavaBasics.Day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LeapYear obj=new LeapYear();
obj.leap();
	}
public void leap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	int year=sc.nextInt();
	if(year%100==0) {
		if(year%400==0) {
		System.out.println("year"+year+"is a century year and a leap year");
	}else {
		System.out.println("year "+year+" is a century year not a leap year");
	}}
	else {
		if(year%4==0) {
			System.out.println("year"+year+"is a leap year");
		}else {
			System.out.println("year"+year+"is not a leap year");
		}
	
}}}

