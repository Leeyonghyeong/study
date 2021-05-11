package test;

import java.util.HashMap;
import java.util.Map;

public class StreamTest {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("test1", "1");
		map.put("test2", "2");
		map.put("test3", "3");
		map.put("test4", "4");
		
		map.forEach((key, value) -> System.out.println("key : " + key + ", value : " + value));
		
		
	}

}
