package Day2;

public class SalaryCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workExp=0;
		float revisedSalary=0;
		float oldSalary=1000;
	boolean	reward=false;
if(workExp>=3 && workExp<=5) {
	revisedSalary=oldSalary+10*oldSalary/100;
	System.out.println(revisedSalary);
}else if(workExp>=6 && workExp<=9) {
	revisedSalary=oldSalary+15*oldSalary/100;
	System.out.println(revisedSalary);
}else if(workExp>=10 && workExp<=20) {
	revisedSalary=oldSalary+10*oldSalary/100;
	System.out.println(revisedSalary);
}
else {
	revisedSalary=oldSalary+25*oldSalary/100;
	System.out.println(revisedSalary);
	
}
if(reward=true) {
	revisedSalary+=1000;
}
	}


}
