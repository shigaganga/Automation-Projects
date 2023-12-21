package Practise;

public class methodOverload {
public static void main(String[] args) {
	Programming obj=new Programming();
	Programming obj2=new Programming("java is a programming language");
	
}
}
class Programming{
	Programming(){
		System.out.println("I love programming language");
	}
	Programming(String msg){
		System.out.println(msg);
	}
}