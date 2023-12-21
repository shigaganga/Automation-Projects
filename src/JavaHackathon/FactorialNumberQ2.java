//wjp to find factorial(nonrecursive method)

package JavaHackathon;

import java.util.Scanner;

public class FactorialNumberQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial();
	}
	public static void factorial() {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number to find factorial");
int n=sc.nextInt();
int fact=1;
 while(n>0) {
	 fact=fact*n;
	 n--;
}
System.out.println(fact);
	}

}
