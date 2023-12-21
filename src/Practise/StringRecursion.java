package Practise;
import java.util.Scanner;
public class StringRecursion {

	public static void main( String[] args) {
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter the string that you want to reverse");
String name=sc.next();
System.out.println(RecursiveMethod(name));
sc.close();
		
}
	public static String RecursiveMethod(String name) {
		if((null==name)||(name.length()<=1)){
			return name;
		}
		
			return RecursiveMethod(name.substring(1))+name.charAt(0);
		
	}
}