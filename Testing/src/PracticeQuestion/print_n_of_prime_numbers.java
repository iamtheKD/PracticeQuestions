package PracticeQuestion;

import java.util.Scanner;

public class print_n_of_prime_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=2; i<=n; i++) {
			if(prime(i)) 
			{
				System.out.println(i+ " ");
			}
		}
	}
	static boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
