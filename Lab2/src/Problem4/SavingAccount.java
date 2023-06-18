package Problem4;

public class SavingAccount extends Account 
{
	double interestRate;
	
	public SavingAccount(int a) {
		super(a);
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		interestAdd(sum);
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		interestRemove(sum);
	}
	
	public double interestAdd(double sum) {
		double percent = 0.01;
		
		if(interestRate == 0) interestRate = sum * percent;
		else {
			interestRate = interestRate + (sum * percent);
		}
		
		return interestRate;
	}
	public double interestRemove(double sum) {
		double percent = 0.01;
		
		if(interestRate == 0) interestRate = 0;
		else {
			interestRate = interestRate - (sum * percent);
		}
		
		return interestRate;
	}
	
	public String toString() {
		return super.toString() + ", Interest Rate: " + this.interestRate;
	}
}