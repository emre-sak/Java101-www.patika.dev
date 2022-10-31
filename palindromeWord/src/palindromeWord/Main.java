package palindromeWord;

import java.util.Scanner;

public class Main {

	public static boolean isPalindrome(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equals(reverse)) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome word.");
		} else {
			System.out.println(str + " palindrome is not a word.");
		}

	}

}
