package com.programcreek;

import java.util.HashMap;
import java.util.Map.Entry;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		HashMap<Character, Character> mapStoT = null;
		HashMap<Character, Character> mapTtoS = null;
		if (s.length() == t.length()) {
			mapStoT = generateMap(s, t);
			mapTtoS = generateMap(t, s);
		}
		System.out.println(mapStoT);
		System.out.println(mapTtoS);
		checkIsomorphic(mapStoT, mapTtoS);
	}

	private static void checkIsomorphic(HashMap<Character, Character> mapStoT,
			HashMap<Character, Character> mapTtoS) {
		for (int i = 0; i < mapStoT.size(); i++) {

			for (Entry<Character, Character> entry1 : mapStoT.entrySet()) {
				// System.out.println("Key : " + entry.getKey() + " Value : " +
				// entry.getValue());
				for (Entry<Character, Character> entry2 : mapTtoS.entrySet()) {
					//TODO
				}
			}
		}

	}

	private static HashMap<Character, Character> generateMap(String s1,
			String s2) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), s2.charAt(i));
		}

		return map;
	}

}
