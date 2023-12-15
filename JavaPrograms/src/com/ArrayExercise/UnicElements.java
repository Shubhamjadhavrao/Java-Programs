package com.ArrayExercise;

import java.util.Arrays;

public class UnicElements {
	public static void main(String[] args) {
		int[] arr = { 20, 2, 3, 45, 60, 90 };
		FindUnicElements(arr);
	}

	public static void FindUnicElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				if (arr[i] == arr[j]) {
					break;
				}
		}

		int i = 0;
		int j = 0;
		if (i == j)
			System.out.println("UnicElement is:" + arr[i]);
	}

}
