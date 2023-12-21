package Practise;

public class PrintStudent {
public static void main(String[] args) {
	Students obj1=new Students();
	Students obj2=new Students("shiga");
	Students obj3=new Students("Arush");
	Students obj4=new Students();
	
}
}
class Students{
public Students(String name) {
	System.out.println(name);
}
public Students() {
	System.out.println("unknown");
}
}