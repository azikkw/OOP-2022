package practice1;

import java.util.Scanner;

public class Third 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner ( System.in );
		
		double gpa;

		gpa = input.nextDouble();
			
		if ((50 <= gpa) && (gpa <= 54))
		{
			System.out.println("D");
		}
		else if ((55 <= gpa) && (gpa <= 59))
		{
			System.out.println("D+");
		}
		else if ((60 <= gpa) && (gpa <= 64))
		{
			System.out.println("C-");
		}
		else if ((65 <= gpa) && (gpa <= 69))
		{
			System.out.println("C");
		}
		else if ((70 <= gpa) && (gpa <= 74))
		{
			System.out.println("C+");
		}
		else if ((75 <= gpa) && (gpa <= 79))
		{
			System.out.println("B-");
		}
		else if ((80 <= gpa) && (gpa <= 84))
		{
			System.out.println("B");
		}
		else if ((85 <= gpa) && (gpa <= 89))
		{
			System.out.println("B+");
		}
		else if ((90 <= gpa) && (gpa <= 94))
		{
			System.out.println("A-");
		}
		else if ((95 <= gpa) && (gpa <= 100))
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("F");
		}
	}
}