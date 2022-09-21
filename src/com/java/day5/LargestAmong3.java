package com.java.day5;

import java.util.Scanner;

public class LargestAmong3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		GreatestNum(num1,num2,num3);
	}
	static void GreatestNum(int num1, int num2, int num3)
	{
		if((num1 > num2) && (num1 > num3) )
			System.out.println(num1+ " Number1 is greatest");
		else if(num2 > num3)
			System.out.println(num2+ " Number2 is greatest");
		else
			System.out.println(num3+ " Number3 is greatest");
	}
}
