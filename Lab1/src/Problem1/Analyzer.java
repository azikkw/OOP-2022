package Problem1;

import java.util.Scanner;

public class Analyzer 
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		
		Data d = new Data();
		
		int value, n;
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter number: ");
			d.addValue(value = input.nextInt());
		}
		
		System.out.println(d);
		
		d.setCnt(5);
		
		System.out.println(d.getCnt());
	}
}