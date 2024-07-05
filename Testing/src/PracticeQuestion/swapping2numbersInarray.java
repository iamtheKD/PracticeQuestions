package PracticeQuestion;

public class swapping2numbersInarray {

	public static void main(String[] args) {
		int a[] = { 12, 14, 23, 42, 28, 33, 39, 25, 45 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
