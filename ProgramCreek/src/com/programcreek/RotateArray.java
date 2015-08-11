package com.programcreek;

public class RotateArray {

	public static void main(String[] args) {
		int n = 10, k = 3;
		int[] arr = new int[n];
		int[] new_arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}

		int j = k;

		for (int i = 0; i < 3 && j > 0; i++) {
			new_arr[i] = arr[n - j];
			j--;
		}
		
		for (int i = k, p = 0; i < n; i++) {
			new_arr[i] = arr[p];
			p++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(new_arr[i] + " ");
		}
	}

}
