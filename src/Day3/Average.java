package Day3;
import java.util.Scanner;
public class Average {
public float Calculate(int num1,int num2,int num3) {
	float avg=(num1+num2+num3)/3;

	System.out.println("The average of three numbers is:"+avg);
	return(avg);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Input first number:");
		int a=reader.nextInt();
		System.out.println(" Enter the second number:");
        int b=reader.nextInt();
        System.out.println(" Enter  third number:");
        int c=reader.nextInt();
        Average obj=new Average();
        float average=obj.Calculate(a,b,c);
        
	}


}1
