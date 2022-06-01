package com.syntax.class10GroupProject;

import java.util.Scanner;

public class GroupProject1 {

	public static void main(String[] args) {

		int[] num=new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 integer values");
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			sum += num[i];
		}

		System.out.println(sum);
	}

}
