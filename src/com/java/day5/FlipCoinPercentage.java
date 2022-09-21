package com.java.day5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercentage
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter Number of times want coin to flip: ");
		int totalFlips= s.nextInt();
		int headFlip=0;
		int tailFlip=0;
		if( totalFlips > 0)
		{
			for(int i=1; i<= totalFlips; i++)
			{
				int flipValue = r.nextInt(2);
				if(flipValue >0.5)
				{
					headFlip++;
				}
				else
				{
					tailFlip++;
				}
			}
		}
		else
		{
			System.out.println("Negative values not allowed. Enter positive value: ");
		}
		float headPercent = (headFlip * 100)/totalFlips;
		float tailPercent = (tailFlip * 100)/totalFlips;
		System.out.println("HeadPercentage: "+headPercent);
		System.out.println("TailPercentage: "+tailPercent);
		System.out.println();

	}

}
