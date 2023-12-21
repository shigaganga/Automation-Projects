package Day3;
import java.util.Scanner;
public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first no:");
		int num1=obj.nextInt();
		System.out.println("Enter the second no:");
		int num2=obj.nextInt();
		System.out.println("Enter the third no:");
		int num3=obj.nextInt();
		int sum=num1+num2+num3;
		float avg=sum/3;
		System.out.println("sum is:"+sum);
		System.out.println("avg is:"+avg);
		

	}

}
