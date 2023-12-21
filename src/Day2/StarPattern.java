package Day2;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=1;i<=number;i++) {
			for(int k=i;k<=number;k++) {
				System.out.print(" ");
			}
			for( int j=1;j<=i;j++) {
				System.out.print(" *");
			}
System.out.println();
		}
for(int i=4;i>0;i--) {
		
	for(int k=i;k<=number;k++) {
	System.out.print(" ");
	}
	
	for(int j=1;j<=i;j++) {
		System.out.print(" *");
	}
	System.out.println();
}
	}

}
