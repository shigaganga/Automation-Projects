package Practise;

class Name {

 private String name="shiga";
 private  int age=35;
	private String country="India";
	private char Grade='B';
	
 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return Grade;
	}

	public String getName() {
	return name;
}
public void setName(String name) {
	this.name =name;
}

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
	
}
public class Person{
	public static void main(String[] args) {
		Name obj=new Name();
		obj.setName("Arush");
		obj.setCountry("Usa");
		obj.setAge(10);
		System.out.println(obj.getName());
		System.out.println(obj.getCountry());
		System.out.println(obj.getAge());
		System.out.println(obj.getGrade());
		
		
		
	} 
}