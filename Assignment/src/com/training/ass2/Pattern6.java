package com.training.ass2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		int n = sc.nextInt();

		int k = 1;
		
		System.out.println("Number Pattern :");

		for (int i = 0; i < n; i++) {
			String pattern = "";
			for (int j = 0; j < n; j++) {
				pattern = pattern + k + " ";
				k += 1;
			}
			System.out.println(pattern);
		}

		sc.close();

	}

}
