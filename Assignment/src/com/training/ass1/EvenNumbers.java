package com.training.ass1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value of n : ");

		int n = sc.nextInt();

		System.out.println("Even Numbers from 1 to " + n);

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
