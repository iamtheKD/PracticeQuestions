package PracticeQuestion;

import java.util.Scanner;

public class checkStringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		checkStringPalindrome s = new checkStringPalindrome();
		boolean c = s.palindrom(A);
		if (c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	boolean palindrom(String a) {
		int j = a.length() - 1;
		for (int i = 0; i < j; i++, j--) {
			if (a.charAt(i) != a.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
