package Practise;


public class AreaAbstract {
	public static void main(String[] args) {
		Area obj=new Area();
		obj.CircleArea(2);
		obj.SquareArea(8);
		obj.RectangeArea(9, 6);
		
	}

}
abstract class shape{
	abstract void RectangeArea(int l,int b);
	abstract void SquareArea(int a);
	abstract void CircleArea(int r);
	double pi=3.141592;
}
 class Area extends shape{
	void RectangeArea(int l,int b) {
		System.out.println("Area of rectangle is: "+l*b);	
	}
	void SquareArea(int a) {
	System.out.println("Area of square is :"+a*a);
	}
void CircleArea(int r) {
	System.out.println("Area of circle is :"+pi*r*r);
}}