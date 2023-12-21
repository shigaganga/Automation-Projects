package Practise;

abstract class BankAccount {
abstract void deposit();

abstract void withdraw();
}
class CheckingAccount extends BankAccount{
	void deposit() {
		System.out.println("An amount of 1000$ deposited in this account");
	}
	void withdraw() {
		System.out.println("50$ is withdrawn from this account");
	}
}
class SavingsAccount extends BankAccount implements Interest,InterestRate{
	void deposit() {
		System.out.println("your total savings is 3000$");
	}
	void withdraw() {
		System.out.println("50$ is withdrawn from this account");
	}
	@Override
	public void CalculateInterest() {
		System.out.println("Total interest is increased");
		
	}
	@Override
	public void CalculateInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Interest rate is 10%");
	}
}
interface Interest{
	abstract void CalculateInterest() ;
}

interface InterestRate{
	abstract void CalculateInterestRate() ;
}
public class DemoAbstarct{
public static void main(String args[]) {
	 BankAccount obj1=new CheckingAccount();
	 obj1.deposit();
	 obj1.withdraw();
	 SavingsAccount obj2=new SavingsAccount();
	 obj2.deposit();
	 obj2.withdraw();
	 obj2.CalculateInterest();
	 obj2.CalculateInterestRate();
	 
	 
}}