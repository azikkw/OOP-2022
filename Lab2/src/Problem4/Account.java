package Problem4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Account implements Serializable
{
	private double balance;
	private int accNumber;
	
	public Account() {}
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		if(balance == 0) balance = sum;
		else {
			balance = balance + sum;
		}
		System.out.println("Deposit to the account " + accNumber + ": " + sum + 
							" , Your new balance: " + balance);
	}
	public void withdraw(double sum) {
		if(balance == 0) System.out.println("You don't have any money on your balance number - " + getAccountNumber());
		else {
			balance = balance - sum;
		}
		System.out.println("Withdrawn from the account " + accNumber + ": " + sum + 
							" , Your remains: " + balance);
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other) {
		other.balance = other.balance + amount;
		balance = balance - amount;
		
		System.out.println("Withdrawn from the account " + accNumber + ": " + amount + 
							" , Remains: " + balance + 
							" -> Account " + other.accNumber + " received: " + amount + 
							" , Available: " + other.balance);
	}
	
	static Vector <Account> readAccounts() throws Exception {
		
		FileInputStream fis = new FileInputStream("accounts.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Vector<Account> accountsList = (Vector<Account>)ois.readObject();
		
		fis.close();
		ois.close();
		
		return accountsList;
	}
	static void saveAccounts() throws Exception {
		
		FileOutputStream fos = new FileOutputStream("accounts.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Bank.accountsList);
		fos.close();
		oos.close();
	}
	
	public String toString() {
		return "Account number " + this.accNumber + ", Balance: " + this.balance;
	}
	public final void print() {
		System.out.println(toString());
	}
}



//public void deposit(double sum) {
//	
//	if(balance == 0) balance = sum - CheckingAccount.deductFee(sum);
//	else {
//		balance = balance + (sum - CheckingAccount.deductFee(sum));
//	}
//	
//	CheckingAccount.cnt += 1;
//}
//public void withdraw(double sum) {
//	
//	if(balance == 0) System.out.println("You don't have any money on your balance number - " + getAccountNumber());
//	else {
//		balance = balance - (sum + CheckingAccount.deductFee(sum));
//	}
//	
//	CheckingAccount.cnt += 1;
//}