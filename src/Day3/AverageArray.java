package Day3;
public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,40,50,60,70,80};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
System.out.println("sum of array elements"+sum);
System.out.println("Average of array elements"+sum/n);
	}

}
