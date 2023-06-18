package practice1;

import java.util.Scanner;

public class Fifth 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner ( System.in );
		
		double balance, percent;
		
		balance = input.nextDouble();
		percent = input.nextDouble();
		
		balance = balance + (balance * (percent / 100));
		
		System.out.print(balance);
	}
}