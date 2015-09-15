/*
 * Author: Vamshi
 * Date: 08/11/2015
 * Program: 4 Word Ladder
 * Description: Given two words (start and end), and a dictionary, find the length of shortest transformation
 * sequence from start to end, such that only one letter can be changed at a
 * time and each intermediate word must exist in the dictionary. For example, given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * One shortest transformation is "hit" ->"hot" ->"dot" ->"dog" ->"cog", the program
 * should return its length 5.
 * Note: Return 0 if there is no such transformation sequence. All words have the same
 * length. All words contain only lowercase alphabetic characters.
 */

package com.programcreek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadder {

	public static void main(String[] args) {
		 String start = "hit";
		 String end = "cog";
		 List<String> dict = new ArrayList<String>(){{
			add("hot");
			add("dot");
			add("dog");
			add("lot");
			add("log"); 
		 }};
		 int transformationCount = 0;
		 String tempStart;
		 boolean programCompletedFlag = false;
		 outerloop1:
		 for (int j = 0; j < dict.size(); j++) {
			 outerloop2:
			 for (int i = 0; i < start.length(); i++) {
				 tempStart = start;
				 for(char c = 'a'; c <= 'z'; c++){
					 char[] tempStartChars = tempStart.toCharArray();
					 tempStartChars[i] = c;
					 tempStart = String.valueOf(tempStartChars);
					 if(dict.contains(tempStart)){
						 System.out.println(dict.get(j) + " - " + tempStart);
						 transformationCount++;
						 start = tempStart;
						 dict.remove(tempStart);
						 if(tempStart.equals(end)){
							 System.out.println(tempStart);
							 programCompletedFlag = true;
							 break outerloop1;
						 }
						 break outerloop2;
					 }					 
				 }
			 }
		 }
		 System.out.println(transformationCount);
	}
}
