package com.programcreek;

import java.util.HashMap;
import java.util.Map.Entry;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "egg";
		String t = "adt";
		HashMap<Character, Character> mapStoT = null;
		HashMap<Character, Character> mapTtoS = null;
		if (s.length() == t.length()) {
			mapStoT = generateMap(s, t);
			mapTtoS = generateMap(t, s);
			System.out.println(mapStoT);
			System.out.println(mapTtoS);
			if(checkIsomorphic(mapStoT, mapTtoS, s) == checkIsomorphic(mapTtoS, mapStoT, t))
				System.out.println("They are isomorphic!");
			else
				System.out.println("They are not isomorphic!");
		} else {
			System.out.println("They are not isomorphic!");
		}
		
	}

	private static boolean checkIsomorphic(HashMap<Character, Character> mapStoT,
			HashMap<Character, Character> mapTtoS, String s) {
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if(Character.toString(s.charAt(i)).equals(Character.toString(mapTtoS.get(mapStoT.get(s.charAt(i)))))){
			} else {
				System.out.println(s.charAt(i) + ", " + mapStoT.get(s.charAt(i)) + ", " + mapTtoS.get(mapStoT.get(s.charAt(i))) + " are not equal!");
				flag = false;
				break;
			}
		}
		return flag;
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
