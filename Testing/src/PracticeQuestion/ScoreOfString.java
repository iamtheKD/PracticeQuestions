package PracticeQuestion;

public class ScoreOfString {

	public static void main(String[] args) {
		String s = "happy";
		int d =0;
		for (int i = 0; i < s.length()-1; i++) {
		    int a = s.charAt(i);
		    int b = s.charAt(i+1);
		    int c = a-b;
		    if (c<0)
		    {
		    c= -c;
		    d= d+c;
		    }
		    else
		    {	d=d+c;
		    }
		}
		System.out.println(d);

	}
}
