package PracticeQuestion;

import java.util.Scanner;

public class addingStringWithSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int a = A.length() + B.length();
		System.out.println(a);
		if (A.length() < B.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		addingStringWithSpace ss = new addingStringWithSpace();
		String finalString = ss.appendString(A, B);
		System.out.println(finalString);

	}

	public String appendString(String A, String B) {
		String[] Aa = A.split("\\s+");
		String[] Bb = B.split("\\s+");
		StringBuilder bf = new StringBuilder();
		StringBuilder cf = new StringBuilder();
		for (String bc : Aa) {
			if (bc.length() > 0) {
				bf.append(bc.substring(0, 1).toUpperCase()).append(bc.substring(1).toLowerCase()).append(" ")
						.toString();
			}
		}
		for (String cc : Bb) {
			if (cc.length() > 0) {
				cf.append(cc.substring(0, 1).toUpperCase()).append(cc.substring(1).toLowerCase()).append(" ")
						.toString();
			}
		}
		String jj = bf.toString().trim();
		String kk = cf.toString().trim();
		return jj + " "+kk;

	}
}