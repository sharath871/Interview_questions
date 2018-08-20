package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCount {
//	public static void countDup(String str) {
//
//		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
//		char[] chrs = str.toCharArray();
//		for (Character ch : chrs) {
//			if (dupMap.containsKey(ch)) {
//				dupMap.put(ch, dupMap.get(ch) + 1);
//			} else {
//				dupMap.put(ch, 1);
//			}
//		}
//		Set<Character> keys = dupMap.keySet();
//		for (Character ch : keys) {
//			if (dupMap.get(ch) > 1) {
//				System.out.println(ch + "--->" + dupMap.get(ch));
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		DuplicatesCount dcs = new DuplicatesCount();
//		dcs.countDup("sharath");
//	}
	
	public static void countDup(String str) {
		
		Map<Character, Integer> dm = new HashMap<Character, Integer>();
	         
		char[] charArray = str.toCharArray();
		
		for(Character ch:charArray) {
			if(dm.containsKey(ch)) {
				dm.put(ch,dm.get(ch)+1);
			}else {
				dm.put(ch, 1);
			}
		}
		Set<Character> keys=dm.keySet();
		for(Character ch:keys) {
			if(dm.get(ch) >1) {
				System.out.println(ch+" "+dm.get(ch));
			}
		}
		
	}
	public static void main(String[] args) {
		DuplicatesCount dc=new DuplicatesCount();
		dc.countDup("sharath");
	}
		
		
}
