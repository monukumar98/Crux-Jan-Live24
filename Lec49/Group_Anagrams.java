package Lec49;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
	System.out.println(Group_Anagrams(arr));
	}

	public static List<List<String>> Group_Anagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			String key = Gen_Key(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		List<List<String>> ans = new ArrayList<>();
		for (String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;
	}

	public static String Gen_Key(String s) {
		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int idx = ch - 'a';
			freq[idx]++; // freq[idx]=freq[idx]+1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();

	}
}
