package sep2023JavaBasics.Day2;

import java.util.Scanner;

public class OverloadingSquareRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and bredth");
		int l=sc.nextInt();
		int b=sc.nextInt();
int AreaSquare=Area (l);
int AreaRectangle=Area(l,b);
System.out.println("Area of square is"+AreaSquare);
System.out.println("Area of rectangle is"+AreaRectangle);
	}
public static int Area(int l) {
	int area=l*l;
	return area;
}
public static int Area(int l,int b) {
	int area=l*b;
	return area;
}
}
