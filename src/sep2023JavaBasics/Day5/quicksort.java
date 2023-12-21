

package sep2023JavaBasics.Day5;
import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n= sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array= new int[n];
		for(int i=0;i<array.length;i++) {
		array[i]=sc.nextInt();
		}
		Qsort(array,0,array.length-1);
		for(int j:array) {
			System.out.print(j+" ");
		}
		}
public static void Qsort(int[]array,int start,int end) {
	if(end<=start)
		return;//exit if there is one element
	int pivot=partition(array,start,end);
	Qsort(array,start,pivot-1);//elements up to pivot
	Qsort(array,pivot+1,end);//elements after pivot
}

	//partion is to solve array and find pivot ie all elements left of array lesser than pivot and right is greater
public static int partition(int[]array,int start,int end) {
	int pivot=array[end];
	int i=start-1;
	for(int j=start;j<=end-1;j++) {
		if(array[j]<pivot) {//first step of patiton ,so that pivot come to 
	//middle of greater and lesser elements of pivot		
			i++;
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}//again partion 2 elements
	i++;
	int temp=array[i];
	array[i]=array[end];
	array[end]=temp;
	return i;//location of pivot

}}