package PracticeQuestion;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 163;
		PrimeNumber kd = new PrimeNumber();
		boolean abc = kd.prime(n);
		if (abc) {
			System.out.println("This is a prime number");
		} else
			System.out.println("Not a prime number");
	}

	boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
