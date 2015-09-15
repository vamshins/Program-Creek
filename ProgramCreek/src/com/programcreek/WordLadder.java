/*
 * Author: Vamshi
 * Date: 09/14/2015
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

import java.util.ArrayList;
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
		 System.out.println(start);
		 if(dict.size() == 0) {
			 transformationCount++;
			 start = end;
		 }
		 outerloop1:
		 while(dict.size() > 0) {
			 outerloop2:
			 for (int i = 0; i < start.length(); i++) {
				 tempStart = start;
				 for(char c = 'a'; c <= 'z'; c++){
					 // Replace character at position 'i' with 'c'
					 char[] tempStartChars = tempStart.toCharArray();
					 tempStartChars[i] = c;
					 tempStart = String.valueOf(tempStartChars);
					// If it equals end string, then stop the program.
					 if(tempStart.equals(end)){
						 System.out.println(end);
						 programCompletedFlag = true;
						 transformationCount++;
						 break outerloop1;
					 } else if(dict.contains(tempStart)){
						// If the dictionary contains the string, increase count, remove it from dictionary.
						 transformationCount++;
						 start = tempStart;
						 System.out.println(tempStart);
						 dict.remove(tempStart);
						 
						 break outerloop2;
					 }					 
				 }
			 }
		 }
		 System.out.println(transformationCount);
	}
}
