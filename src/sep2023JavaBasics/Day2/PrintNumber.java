package sep2023JavaBasics.Day2;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern1();
pattern2();
pattern3();
	}
public static void pattern1() {
	System.out.println("first pattern");
	int count=6;
	for(int i=0;i<4;i++) {
		System.out.println(count);
		count=count+3;
	}
}
public static void pattern2() {
	System.out.println("second pattern");
	int count=1;
	for(int i=0;i<5;i++) {

		System.out.println(count);
		count=count+3;
	}
}
public static void pattern3() {
	System.out.println("Third pattern");
	int count=0;
	for(int i=0;i<5;i++) {

		System.out.println(count);
		count=count+4;
	}}}