package Assignment2;

public class ArithemeticException1 {

		void Divide(int a,int b) {
			int result;
			try {
				result=a/b;
				
				System.out.println("Result is"+result);
			}
			catch(ArithmeticException ex) {
				
				System.out.println("should avoid divide by 0"+ex);
			}

	}
		public static void main(String[] args) {
			ArithemeticException1 obj=new ArithemeticException1();
			obj.Divide(1, 0);
		}

}
