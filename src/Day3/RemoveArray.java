package Day3;

import java.util.Arrays;

public class RemoveArray {
	static int remArr() {
		int my_array[] = {25, 14, 56, 15, 36, 56, 77};
		System.out.println("original array : "+Arrays.toString(my_array));//print 
		   int index=2;//index 2 removed
		   int re_array[] = new int[my_array.length-1] ;//new array declaration
for(int i=0,j=0;i<my_array.length;i++) {
	if(i==index) {
		continue;
	}else {
		 re_array[j++]=  my_array[i];
		 
	}
	
	
	}
System.out.println("Array after removing element: " +Arrays.toString(re_array));
return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			remArr() ; 
			   

}

			 }
			 

	

