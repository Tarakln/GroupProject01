package com.syntax.class10GroupProject;

public class GroupProject11 {

	public static void main(String[] args) {

		String[] word = { "Hi", "How", "Hi", "Are", "How", "You"};

		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equalsIgnoreCase(word[j])) {
					System.out.println(word[i] + " and " + word[j]+ "are the same.");
				}
			}
		}

	}
}