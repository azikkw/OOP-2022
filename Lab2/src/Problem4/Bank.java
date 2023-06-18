package Problem4;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Vector;

public class Bank
{
	public static Vector <Account> accountsList = new Vector <Account>();
	
	static {
		if(new File("accounts.ser").exists()) {
			try {
				Bank.accountsList = Account.readAccounts();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else accountsList = new Vector <Account>();
	}
		
	public void createAccount() throws Exception {
		System.out.println("acc - If you want to create cl. Account\n" +
							"ca - If you want to create cl. CheckingAccount\n" +
							"sa - If you want to create cl. SavingAccount");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cl = br.readLine();
		
		if(cl.equals("acc")) {
			Account a = new Account(Integer.parseInt(br.readLine()));
			accountsList.add(a);
		}
		if(cl.equals("ca")) {
			CheckingAccount ca = new CheckingAccount(Integer.parseInt(br.readLine()));
			accountsList.add(ca);
		}
		if(cl.equals("sa")) {
			SavingAccount sa = new SavingAccount(Integer.parseInt(br.readLine()));
			accountsList.add(sa);
		}
		
		System.out.println("Your account successfully opened");
	}
	public void doOperations() throws Exception {
		System.out.println("Please enter a number of Account:\n0 - for exit");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		if(m == 0) update();
		
		for(Account a: accountsList) {
			if(m == a.getAccountNumber()) {
				System.out.println(a + "\n");
				System.out.println("d - If you want to deposit\n" +
									"w - If you want to withdraw\n" +
									"t - If you want to do transefer\n" +
									"e - If you want to exit");
				
				String k = br.readLine();
				
				if(k.equals("d")) {
					if(a instanceof CheckingAccount) {
						CheckingAccount ca = (CheckingAccount)a;
						ca.deposit(Double.parseDouble(br.readLine()));
					}
					else if(a instanceof SavingAccount) {
						SavingAccount sa = (SavingAccount)a;
						sa.deposit(Double.parseDouble(br.readLine()));
					}
					else {
						a.deposit(Double.parseDouble(br.readLine()));
					}
				}
				if(k.equals("w")) {
					if(a instanceof CheckingAccount) {
						CheckingAccount ca = (CheckingAccount)a;
						ca.withdraw(Double.parseDouble(br.readLine()));
					}
					else if(a instanceof SavingAccount) {
						SavingAccount sa = (SavingAccount)a;
						sa.withdraw(Double.parseDouble(br.readLine()));
					}
					else {
						a.withdraw(Double.parseDouble(br.readLine()));
					}
				}
				if(k.equals("t")) {
					System.out.print("Enter a number of account you want to do transfer - ");
					int t = Integer.parseInt(br.readLine());
					System.out.print("Enter a sum you want transfer - ");
					double sm = Double.parseDouble(br.readLine());
					a.transfer(sm, accountsList.elementAt(t - 1));
				}
				if(k.equals("c")) {
					update();
				}
			}
		}
	}
	public void closeAccount() throws Exception {
		System.out.println("Please enter a number of Account you want to close:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < accountsList.size(); i++) {
			if(n == accountsList.get(i).getAccountNumber()) {
				accountsList.remove(accountsList.get(i));
			}
		}
		
		System.out.println("Your account successfully closed");
	}
	public void showAccounts() {
		if(!accountsList.isEmpty()) {
			for(Account a: accountsList)
				System.out.println(a);
		}
		else System.out.println("No accounts yet, try adding one");
	}
	public void exit() throws Exception {
		Account.saveAccounts();
	}
	
	public void update() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				System.out.println("\nHello!\n\n" + 
									"1. If you want to view all Accounts\n" +
									"2. If you want to open an Account\n" +
									"3. If you want to do some operations in your Account\n" +
									"4. If you want to close your Account\n" +
									"5. If you want to exit\n");
				
				int n = Integer.parseInt(br.readLine());
				
				if(n == 1) showAccounts();
				if(n == 2) createAccount();
				if(n == 3) doOperations();
				if(n == 4) closeAccount();
				if(n == 5) {
					System.out.println("Goodbay. Have a nice day!");
					exit();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("An error has occurred! Saving resources ...");
			exit();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		new Bank().update();
	}
}