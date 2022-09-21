package com.java.day5;

/*
 * Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 * 
 * */

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Power: ");
		int num = s.nextInt();
		if( num>=0 && num<=31)
		{
			/* (Math)inbuilt function to calculate power
			 * (int) type of data to be input
			 * */ 
			int power = (int) Math.pow(2, num);
			System.out.println("Power of 2 ^ "+num+" is "+power);
			
			for(int i=0; i<=num; i++)
			{
				int power2 =(int) Math.pow(2, i);
				System.out.println("Power of 2 ^ "+i+" is "+power2);	
			}
		}
		else
		{
			System.out.println("Enter Range less than 32 and try again");
		}
	}

}


