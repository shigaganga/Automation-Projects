//Q21. WJP to convert string to int

package JavaHackathon;

import java.util.Scanner;

public class StringIntQ21 {
	public static void main(String args[]) {

	conversion();
}
public static void conversion() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	int num=Integer.parseInt(str);
	System.out.println("String after converted to integer is "+num);
			
}

}
