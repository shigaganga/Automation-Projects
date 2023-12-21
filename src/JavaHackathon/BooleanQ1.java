//Q1 consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true    
package JavaHackathon;

import java.util.Scanner;

public class BooleanQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BooleanCheck();
	}
public static void BooleanCheck() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a is true or false");
	Boolean a=sc.nextBoolean();
	System.out.println("Enter b is true or false");
	Boolean b=sc.nextBoolean();
	System.out.println("Enter c is true or false");
	Boolean c=sc.nextBoolean();
	
	int count=0;
	if(a) 
		count++;
	if(b)
		count++;
	if(c)
		count++;
	if(count>=2) {
		System.out.println("Atleast two booleans variables are true,condition is valid ");
	}else {
		System.out.println("Atleast two variables are not true");
	}
}
}
