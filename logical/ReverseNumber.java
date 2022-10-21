package com.logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		
		int reverse=0;
		System.out.println("number is:" + num);
		for ( ; num!=0 ; num=num/10) {
			int remender=num%10;
			reverse =reverse*10+remender;
		}
		System.out.println("reverse of number is: "+reverse);
		sc.close();
	}
}
