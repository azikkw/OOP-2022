package practice1;

import java.util.Scanner;

public class Sixth 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner ( System.in );
		
		String word1;
		
		word1 = input.next();
		
		String word2 = word1;
		
		StringBuffer word1_rev = new StringBuffer(word1);
		word1_rev.reverse();
		
		if(word2.contentEquals(word1_rev))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Polindrome");
		}
	}
}