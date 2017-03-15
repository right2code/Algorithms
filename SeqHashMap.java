import java.util.*;
 
public class SeqHashMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "bhendi");
		map.put("b", "cinnamon");
		map.put("c", "khanda");
		map.put("d", "aloo");
		map.put("e", "tamatr");
		System.out.println(map);
 
		Map sortedMap = sortByValue(map);
		System.out.println(sortedMap);
	}
 
	public static Map sortByValue(Map unsortedMap) {
		Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}
 
}
 
class ValueComparator implements Comparator {
	Map map;
 
	public ValueComparator(Map map) {
		this.map = map;
	}
 
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueA.compareTo(valueB);
	}
}