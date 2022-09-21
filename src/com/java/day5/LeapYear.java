package com.java.day5;

import java.util.*;
public class LeapYear {

			
			static boolean isLeap(int year) {
				return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			}

			
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("enter year in 4 digit");
				int year = s.nextInt();
				/*
				 * it should not be less than 4 digit or should not be greater than 4 digit
				 * ensures the value is 4 digit
				 */
				while (year < 999 || year > 9999)
				{
					System.out.println("Invalid Input");
					System.out.println("enter year only of 4 digit");
					year = s.nextInt();
				}
				if (isLeap(year))
				{
					System.out.println(year + " is a leap year");
				} else
					System.out.println(year + " is not a leap year");
				
			}

	}


