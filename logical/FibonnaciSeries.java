package com.logical;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int num1=0, num2=1, num3, count=10;
		System.out.print(num1 + " " + num2);
		for(int i=2;i<count;++i) {
			num3=num2+num1;
			System.out.print(" "+ num3);
			num1=num2;
			num2=num3;
		}
	}
}
