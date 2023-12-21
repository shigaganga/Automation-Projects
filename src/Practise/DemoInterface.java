package Practise;

public class DemoInterface {
	public static void main(String[] args) {
		
	
	logger obj1=new consoleLogger();
	logger obj2=new FileLogger();
	
	obj1.log("shiga");
	obj2.log("shaju");

}}
interface logger{
	abstract void log(String message);
}
class consoleLogger implements logger{
public	void log(String message) {
		String str="Hello";
		System.out.println(str+" "+message);
	}
}
class FileLogger implements logger{
public	void log(String message) {
		String str2="How are you";
		System.out.println(str2+" "+message);
	}
}