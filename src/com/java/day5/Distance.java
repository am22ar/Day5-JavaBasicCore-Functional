package com.java.day5;

import java.util.*;
public class Distance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x = s.nextInt();
		System.out.println("Enter value of y: ");
		int y = s.nextInt();
		calculate(x,y);
		
	}
	
	
	static void calculate(int x , int y)
	{
		/**
		 * Function to calculate the value of distance
		 * 
		 * @param x value of x axis
		 * @param y value of y axis
		 */
		double distance = Math.pow((x * x + y * y), 0.5);
		System.out.println("Distance :"+distance);
	}
}
