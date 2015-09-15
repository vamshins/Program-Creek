/*
 * Author: Vamshi
 * Date: 08/11/2015
 * Program: 1 Rotate Array in Java
 * Description: Rotate an array of n elements to the right by k steps. For example, with n
 * = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
 * ways do you know to solve this problem?
 */


package com.programcreek;

public class RotateArray {

	public static void main(String[] args) {
		int n = 7, k = 3;
		int[] arr = new int[n];
		int[] new_arr = new int[n];
		
		// [1,2,3,4,5,6,7]
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}

		int j = k;

		// [5,6,7,0,0,0,0]
		for (int i = 0; i < 3 && j > 0; i++) {
			new_arr[i] = arr[n - j];
			j--;
		}
		
		// [5,6,7,1,2,3,4]
		for (int i = k, p = 0; i < n; i++) {
			new_arr[i] = arr[p];
			p++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(new_arr[i] + " ");
		}
	}

}
