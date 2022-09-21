package com.java.day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Quotient: "+(num1/num2));
		System.out.println("Remainder: "+(num1 % num2));

	}

}
