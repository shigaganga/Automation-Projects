package Practise;

public class EqualityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrayone[]= {1,3,5,7,9,11};
int arraytwo[]= {1,3,5,7,9,11};
boolean equalornot=true;//built in method Arrays.equal()
//sop("Arrays.equal(arrayone,arraytwo))//true
if(arrayone.length==arraytwo.length) {
	for(int i=0;i<arrayone.length;i++) {
		if(arrayone[i]!=arraytwo[i]) 
			equalornot=false;}
	}
}else {
	equalornot=false;
}
if(equalornot) {
	System.out.println("two arrays are equal");
}else {
	System.out.println("They are not equal");
}
	}

}
