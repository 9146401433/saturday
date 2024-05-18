package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgram {
	public static void main(String[] args) {
		String str = "akanksha";
		
		usingStringlogic(str);
		usingMap(str);
		usingJava8(str);
		
	}
	
	private static void usingJava8(String str) {
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("---------------Using Java 8------------------");
		for(Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey() + " : "+me.getValue());
		}
		
		System.out.println("---------------Print Key ASC Order Java 8------------------");
		List<Map.Entry<Character, Long>> maList = new ArrayList<>(map.entrySet());
		maList.sort((e1,e2)-> e1.getKey().compareTo(e2.getKey()));
		for(Map.Entry me : maList) {
			System.out.println(me.getKey() + " : "+ me.getValue());
		}
		
		List<Map.Entry<Character, Long>> mapList = new ArrayList<>(map.entrySet());
		mapList.sort((v1, v2) -> v1.getValue().compareTo(v2.getValue()));
		for(Map.Entry me : maList) {
			System.out.println(me.getKey() + " : "+ me.getValue());
		}		
		
	}

	private static void usingMap(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		Map<Character, Integer> map1 = new HashMap<>();
		char ch[] = str.toCharArray();
		for(Character c : ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int count = map.get(c);
				map.put(c, count+1);
			}
			
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		System.out.println("-------------------Using Map-------------");
		for(Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		System.out.println("-------------------Using Map2-------------");
		for(Map.Entry me : map1.entrySet()) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
	}

	public static void usingStringlogic(String str) {
		int count[] = new int[200];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		System.out.println("-------------------Using Logic-------------");
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int find = 0;
			for(int j=0; j<=i; j++) {
				if(str.charAt(i)== str.charAt(j)) {
					find++;
				}
			}
			if(find == 1) {
				System.out.println(ch + " : "+ count[ch]);
			}
		}
	}
}
