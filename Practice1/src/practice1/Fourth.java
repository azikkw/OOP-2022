package practice1;

import java.util.Scanner;

public class Fourth
{
	public static void main(String args[])
	{
		Scanner input = new Scanner ( System.in );
		
		double a, b, c;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		double D;
		
		D = b * b - 4 * a * c;
		
		if (D > 0) 
		{
		    double x1, x2;
		    x1 = (-b - Math.sqrt(D)) / (2 * a);
		    x2 = (-b + Math.sqrt(D)) / (2 * a);
		    System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		}
		else if (D == 0) 
		{
		    double x;
		    x = -b / (2 * a);
		    System.out.println("x = " + x);
		}
		else {
		    System.out.println("D < 0");
		}
	}
}