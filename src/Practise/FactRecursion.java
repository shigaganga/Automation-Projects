package Practise;

public class FactRecursion {
public static void main (String[] args)
{
	int num=5;
	int factorial=fact(num);
	System.out.println("Factorial of"+num+"="+factorial);
}
public static int fact(int num) {
	if(num==1) {
		
	System.out.println("factorial("+num+")=1\n");
	return 1;
}
else
{
	return num*fact(num-1);
}
	
}}