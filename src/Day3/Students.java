package Day3;

public class Students {
	int roll_no;
	int phone_no;
	String address;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students obj1=new Students();
Students obj2=new Students();
obj1.name="John";
obj1.roll_no=1;
obj1.phone_no=67893;
obj1.address="1345 time square,34560,ny";

obj2.name="Sam";
obj2.roll_no=2;
obj2.phone_no=56789;
obj2.address="5678 glengate circle,5678,Nc";

System.out.println("name of first student is" +obj1.name);
System.out.println("rollno of first student is" +obj1.roll_no);
System.out.println("phone numbr of first student is"+obj1.phone_no);
System.out.println(" addressof first student is"+obj1.address);
System.out.println("name of first student is"+obj1.name);
System.out.println("roll number of first student is"+obj1.roll_no);
System.out.println("phone numberof first student is"+obj1.phone_no);
System.out.println("address of first student is"+obj1.address);

	}

}
