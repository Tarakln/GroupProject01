package com.syntax.class10GroupProject;

public class GroupProject9 {

	public static void main(String[] args) {

		int[] num = { 2, 15, 3500, 1, 80, 20 };
		int max = num[0];
		int min =num [0];
		

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}else if (min>num[i]) {
				min = num[i];
			}
		}
		System.out.println("The maxium number is "+max);
		System.out.println("The minimum number is "+min);
	}
}
