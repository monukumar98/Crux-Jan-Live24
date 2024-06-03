package Lec48;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 78);
		map.put("Ankit", 68);
		map.put("Kunal", 52);
		map.put("Ankita", 78);
		map.put("Kaju", 89);
		map.put("Pooja", 73);
		map.put("Anku", 67);
		map.put("Amisha", 45);
		map.put("Manoj", 68);
		map.put("Ankita", 58);
//		map.put(null, 55);
//		map.put("null", 75);
		System.out.println(map);
//		// contains
//		System.out.println(map.containsKey("Aman"));
//		System.out.println(map.containsKey("Ankit"));
//		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Ankitaa"));
//		// System.out.println(map.containsValue(68));
//		// remove
//		System.out.println(map.remove("Kamlesh"));
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Raj", 78);
		map1.put("Ankit", 68);
		map1.put("Kunal", 52);
		map1.put("Ankita", 78);
		map1.put("Kaju", 89);
		map1.put("Pooja", 73);
		map1.put("Anku", 67);
		map1.put("Amisha", 45);
		map1.put("Manoj", 68);
		map1.put("Ankita", 58);
//		map1.put(null, 55);
//		map.put("null", 75);
		System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 78);
		map2.put("Ankit", 68);
		map2.put("Kunal", 52);
		map2.put("Ankita", 78);
		map2.put("Kaju", 89);
		map2.put("Pooja", 73);
		map2.put("Anku", 67);
		map2.put("Amisha", 45);
		map2.put("Manoj", 68);
		map2.put("Ankita", 58);
//		map.put(null, 55);
//		map.put("null", 75);
		System.out.println(map2);
		System.out.println(map.size());
//		Set<String> s = map.keySet();
//		for (String k : s) {
//			System.out.print(k + " " + map.get(k)+", ");
//		}
		for (String key: map.keySet()) {
			System.out.print(key + " " + map.get(key)+", ");
		}

	}

}
