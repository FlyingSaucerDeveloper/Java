package com.flyingsaucer.BasicStringManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class JavaSubStrings {

	public static void main(String[] args) {

		System.out.print("Enter a String : ");

		Scanner sc = new Scanner(System.in);
		String userString = sc.next();

		JavaSubStrings obj1 = new JavaSubStrings(); // to call a non static method, the instance of the class is
													// required.

		List<Character> allChars = obj1.getChars(userString);

		System.out.println(allChars.toString());

		System.out.println("All the characters in the " + userString + " are: " + allChars.toString());

		System.out.println(
				"All the Unique characters in the " + userString + " are: " + getUniqueChars(userString).toString());

		System.out.println("The Middle character(s) in the " + userString + " is(are): "
				+ middleCharacters(userString).toString());

		System.out.print("Alternate Character Sequence: ");
		alternateCharacterSequence(userString);

	}

	private List<Character> getChars(String s) {

		List<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {

			charList.add(s.charAt(i));

		}

		return charList;
	}

	private static List<Character> getUniqueChars(String s) {

		List<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {

			charList.add(s.charAt(i));

		}

		Set<Character> charSet = new TreeSet<Character>(); // Sorts the set in the ascending order, if we use the
															// Hashset then there will be no order, but time complexity
															// will be O(1)

		for (Character character : charList) {
			charSet.add(character);
		}

		charList = new ArrayList<Character>(charSet);

		return charList;
	}

	private static List<Character> middleCharacters(String s) {

		List<Character> charList = new ArrayList<Character>();

		if (s.length() % 2 == 0) {
			int midpoint1 = s.length() / 2;
			int midpoint2 = (s.length() / 2) + 1;

			charList.add(s.charAt(midpoint1 - 1));
			charList.add(s.charAt(midpoint2 - 1));

			return charList;

		}

		int midpoint = s.length() / 2;
		charList.add(s.charAt(midpoint));

		return charList;
	}

	private static void alternateCharacterSequence(String s) {

		for (int i = 0; i < s.length(); i = i + 2) {
			System.out.print(s.charAt(i) + "\s");
		}

	}

}
