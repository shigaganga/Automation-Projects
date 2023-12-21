package Practise;

public class Pattern3 {
	public void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j<=5;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
public static void main(String[] args) {
	Pattern3 obj=new Pattern3();
	obj.pattern();
}
}
