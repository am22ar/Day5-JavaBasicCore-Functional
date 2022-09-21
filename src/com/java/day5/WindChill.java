package com.java.day5;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Farhanite: ");
		double t = sc.nextDouble();
		System.out.println("Enter Wind Speed in miles/hour: ");
		double v = sc.nextDouble();
		if(Math.abs(t)>50 || v < 120 || v > 3)
		{
			double w = 35.74 + 0.62158 * t + (0.4275  * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill: "+ w);
		}

	}

}
