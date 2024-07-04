package PracticeQuestion;

import java.util.Map;
import java.util.*;

public class hashMapBasic {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("us", "United States");
		map.put("en", "England");
		map.put("in", "India");
		
		map.remove("us");
		System.out.println(map);

	}

}
