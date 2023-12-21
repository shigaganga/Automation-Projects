package sep2023JavaBasics.Day1;

import java.util.Scanner;

public class Conversion {
public static void main(String[] args) {
	Conversion obj=new Conversion();
	obj.TypeConvert();
	
}
public void TypeConvert() {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter a float number");
	Float f1=sc.nextFloat();
	double f1d1=f1.doubleValue();
	System.out.println(f1+"after converted to double becomes: "+f1d1);
	
	
	System.out.println("\nEnter a double number");
	Double d2=sc.nextDouble();
	float d2f2=d2.floatValue();
	System.out.println(d2+"after converted to float becomes: "+d2f2);
	
	
	System.out.println("\nEnter an integer ");
	Integer I1=sc.nextInt();
	long I1L1=I1.longValue();
	System.out.println(I1+" after converted to long becomes: "+I1L1);
	
	
	System.out.println("\nEnter a long number");
	Long L2=sc.nextLong();
	int L2I2=L2.intValue();
	System.out.println(L2+" after converted to integer becomes: "+L2I2);
	
	
	
}
}