package com.logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check whether it is prime or not:");
		int num = sc.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Number is not prime");
				break;
			} else
				System.out.println("Number is prime");
				break;
		}
		sc.close();
	}
}
