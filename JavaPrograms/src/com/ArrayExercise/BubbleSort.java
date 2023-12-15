package com.ArrayExercise;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = { 12, 34, 2, 5, 1, 6 };

		System.out.println("SortedArray is:" + Arrays.toString(bubbleSort(num)));
	}

	public static int[] bubbleSort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}

}
