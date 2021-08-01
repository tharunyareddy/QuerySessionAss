package com.training.ass2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		int number = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				sum += i;
			}

		}

		if (sum == number) {
			System.out.println(number + " is Perfect Number");
		} else {
			System.out.println(number + " is not a Perfect Number");
		}

		sc.close();

	}

}
