package PracticeQuestion;

public class noOfOccurenecOfSubstring {

	public static void main(String[] args) {
		String s = "The code was first published as a standard in 1967. it was subsequently updated and published as ANSI X3.4-1968, then as ANSI X3.4-1977, and finally as ANSI X3.4-1986. Since it is a seven-bit code, it can at the most represent 128 characters. it currently defines 95 printable characters including 26 upper case letters (A to Z), 26 lower case letters, 10 numerals (0 to 9), and 33 special characters including mathematical symbols, punctuation marks, and space characters. They represent text in, telecommunications equipment, and devices. These include numbers, upper and lowercase English letters, functions, punctuation symbols, and some other symbols.";
		String j = "The";
		int i =0;
		int index = s.indexOf(j);
		while (index != -1) {
	        i++;
	        index = s.indexOf(j, index + 1);
	    }
		System.out.println("Number of occurence of"+j+" is "+i);
	}
}
