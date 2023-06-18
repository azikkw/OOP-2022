package practice1;

import java.util.Scanner;

public class Second
{
	public static void main(String args[])
	{
		Scanner input = new Scanner ( System.in );
		
		double a;
		a = input.nextDouble();

		double area, perimetr, diagonal;
		
		area = a * a;
		perimetr = a * 4;
		diagonal = Math.sqrt(2) * a;
		
		System.out.println(area + "\n" + perimetr + "\n" + diagonal);
	}
}