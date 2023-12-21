package Day1;
import java.util.Scanner;
public class BiggestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first no:");
		int num1=obj.nextInt();
		System.out.println("Enter second no:");
		int num2=obj.nextInt();
		System.out.println("Enter third no:");
		int num3=obj.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("largest number is:"+num1);
		}
		if((num2>num3)&&(num2>num3)) {
			System.out.println("largest number is:"+num2);
		}
		if((num3>num2)&&(num3>num2)) {
			System.out.println("largest number is:"+num3);
		}
		obj.close();
	}

}
