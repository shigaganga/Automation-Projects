package Day1;
import java.util.Scanner;
public class ArithematicScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first no");
		float num1=obj.nextFloat();
		System.out.println("Enter the second no");
		float num2=obj.nextFloat();
		float sum=num1+num2;
		float multiplication=num1*num2;
		float sub=num1-num2;
		System.out.println("addition of two numbers is"+sum);
		System.out.println("multiplication of two numbers is"+multiplication);
		System.out.println("substraction of two numbers is"+sub);

	}

}
