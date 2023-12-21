package Day3;

public class Rectangle {
	int l;
	int b;
	int area;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
public int Area() {
	int area=l*b;
	return(area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle obj1=new Rectangle(4,5);
 int A1= obj1.Area();
 Rectangle obj2=new Rectangle(5,8);
 int A2=obj2.Area();
 System.out.println("Area of first rectangle is"+A1);
 System.out.println("Area of second rectangle is"+A2);
 


	}

}
