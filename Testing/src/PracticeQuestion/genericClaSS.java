package PracticeQuestion;

public class genericClaSS {

	public static void main(String[] args) {
		printData("Hello");
		printData(123);
		
		genericClaSS obj = new genericClaSS();
		obj.doubleData("abc");
		obj.doubleData(123);
	}
	
	static <J> void printData(J data) {
		System.out.println(data);
	}
	
	<J> void doubleData(J data) {
		System.out.println(data);
	}

}
