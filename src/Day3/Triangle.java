


package Day3;

public class Triangle {
int l,b,h;
int Area;
int volume;
public float calcArea() {
	Area=b*h/2;
	return (Area);
}
public int calcVolume() {
	volume=l*b*h;
	return (volume);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle obj=new Triangle();
		obj.l=3;
		obj.b=4;
		obj.h=5;
		float area1=obj.calcArea();
		int volume1=obj.calcVolume();
		System.out.println("Area of triangle is" +area1);
		System.out.println("Volume of triangle is" +volume1);
		
		
	}

}
