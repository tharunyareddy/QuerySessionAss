package com.training.assignment2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Enter number");

		for (int i = 0; i < number; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		sc.close();

	}

}
