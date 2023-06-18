package Problem4;

public class CheckingAccount extends Account
{
	int cnt = 0;
	final static int freeTransactions = 3;
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public void deposit(double sum) {
		double balance = sum - deductFee(sum);
		super.deposit(balance);
		cnt += 1;
	}
	public void withdraw(double sum) {
		double balance = sum + deductFee(sum);
		super.withdraw(balance);
		cnt += 1;
	}

	public double deductFee(double sum) {
		
		double percent = 0.02;
		double value = 0;
		
		if(cnt > freeTransactions) {
			value = sum * percent;
		}
		else {
			value = 0;
		}
		
		return value;
	}
	
	public int getCnt() {
		return cnt;
	}
}