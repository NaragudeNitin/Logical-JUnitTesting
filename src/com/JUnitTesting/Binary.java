package com.JUnitTesting;

import java.util.Scanner;

public class Binary {
	
	static void getBinary(int [] binary, int id) {
		for (int i = id-1 ; i >= 0; i--) {
			System.out.print(binary[i]+ " ");
		}
	}
	static void converBinary(int num) {
		int [] binary = new int[23];
		int id=0;
		while(num>0) {
			binary[id++]=num%2;
			num=num/2;
		}
		getBinary(binary, id);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number to convert into binary: ");
		int num = sc.nextInt();
		converBinary(num);
		sc.close();
	}
}
