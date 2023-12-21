package Practise;


public class Encapsneed {
public static void main(String[] args) {
	Encapsulate obj=new Encapsulate();
	obj.setA(101);
	obj.setB(102);
	//obj.setA(23);
	//obj.setB(10);
	
	System.out.println(obj.add(obj.getA(),obj.getB()));
}
}
class Encapsulate{
	private int a=0,b=0;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		if(a>99) {
		this.a = a;}
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		if(b>99) {
		this.b = b;}
	}
	public int add(int a,int b) {
		return a+b;
	}
}
