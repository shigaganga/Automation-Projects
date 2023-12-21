package Day3;

public class ArrayIndex {
	public static int findIndex(int arr[],int t) {
		if(arr==null) {return(-1);	
	}
		int i=0;
		while(i<arr.length) {
			if(arr[i]==t) {
				return i;
			}else {
				i=i+1;
			}}
			return(-1);
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,25,56,77,48,49,34,23,17};
		System.out.println("Index position of 48 is:"+findIndex(arr,48));
		System.out.println("Index position of 23 is:"+findIndex(arr,23));


	}

}
