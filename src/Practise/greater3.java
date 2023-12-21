package Practise;

import java.util.Scanner;

public class greater3 {
	public void greater() {
	System.out.println("please enter 3 numbers");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	int largest,smallest,secondLargest;
	if((num1>num2)&&(num1>num3)) {
	largest=num1;
		System.out.println("first greatest number is: "+largest);}
		else if(num2>num3) {
			largest=num2;
			System.out.println("first greatest number is: "+largest);}
		else {
			largest=num3;
			System.out.println("first greatest number is: "+largest);}
if((num1<num2)&&(num1<num2)) {
	smallest=num1;
	 System.out.println("smallest of 3 is: "+smallest);}

else if(num2<num3) {
	smallest=num2;

System.out.println("smallest of 3 is: "+smallest);}
else {
	smallest=num3;
	System.out.println("smallest among 3 numbers is: "+smallest);
}
	secondLargest=num1+num2+num3-largest-smallest;
	System.out.println("second largest among 3 number is: "+secondLargest);
		
	}
	public static void main(String[] args) {
		greater3 obj=new greater3();
		obj.greater();
	
		
		
	}

}
