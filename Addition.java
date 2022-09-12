package com.te.assignment.addnos;

import java.util.Scanner;

public class Addition {

	public static int add(int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total numbers you want to add : ");
		int arr = input.nextInt();
		int[] addd = new int[arr];
		System.out.println("Enter the nos u want to add: ");
		for (int i = 0; i < arr; i++) {
			addd[i] = input.nextInt();
		}
		add(addd);
		input.close();

	}

}
