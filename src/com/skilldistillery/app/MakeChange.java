package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the price of the item: ");
		double price = scanner.nextDouble();
		
		System.out.println("Please enter how much cash was tendered for the sale--bills over 20 dollars will not be accepted!");
		double payment = scanner.nextDouble();
		scanner.close();
		
		double change = price - payment;
		change = - change;
		
		if (price > payment) {
			System.out.println("I am sorry but you did not pay the full amount!");
		}
		
		else if(price == payment) {
			System.out.println("Thank you for your purchase. You have given exact change. Have a great day.");
		}
		
		else {
			
			System.out.println("Amount: "+price+", Tendered:  "+payment+", Result: ");
			
			do{while(change >= 20.0) {
				int twenties = (int)change / 20;
				change = change % 20;
					System.out.print(twenties+" twenty dollar bill, ");
			}
			while(change >= 10.0) {
				int tens = (int)change / 10;
				change = change % 10;
				System.out.print(tens+" ten dollar bill, ");
			}
			while(change >= 5.0) {
				int fives = (int)change / 5;
				change = change % 5;
				System.out.print(fives+" five dollar bill, ");
			}
			while(change >= 1.0) {
				int singles = (int)change / 1;
				change = change % 1;
				System.out.print(singles+" one dollar bill, ");
			}
			while(change >= .25) {
				double quarters = change / .25;
				change = change % .25;
				System.out.print((int)quarters+" quarter, ");
			}
			while(change >= .10) {
				double dimes = change / .10;
				change = change % .1;
				System.out.print((int)dimes+" dimes, ");
			}
			while(change >= .05) {
				double nickels =(int)(change * 100 / 5);
				change = change % .05;
				System.out.print((int)nickels+" nickel, ");
			}
			while(change >= .01) {
				change = change+.001;
				int pennies = (int)(change *100 / 1);
				change = change % .01;
				System.out.print(pennies+" pennies");
			}
			System.out.print(".");
			break;
			
		}while(change!=0);
		}
	}
}