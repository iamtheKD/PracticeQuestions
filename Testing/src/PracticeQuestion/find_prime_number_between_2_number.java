package PracticeQuestion;

import java.util.Scanner;

public class find_prime_number_between_2_number {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("First Number:");
		int m = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Second Number:");
		int n = sc2.nextInt();
		System.out.println("Prime number between "+m+" & "+n+" are");
		for (int i = m; i <= n; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean prime(int n) {
		boolean isprime = true;
		if (n <= 1) {
			isprime=false;
			return isprime;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return isprime;	
	}

}
