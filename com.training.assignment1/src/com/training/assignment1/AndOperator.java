package com.training.assignment1;
import java.util.Scanner;
public class AndOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest");
		}
		else if(b<a&&b<c)
		{
			System.out.println("b is smallest");
		}
		else
		{
			System.out.println("c is smallest");
		}
		sc.close();

	}

}
