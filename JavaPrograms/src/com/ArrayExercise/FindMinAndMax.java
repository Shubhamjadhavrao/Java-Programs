package com.ArrayExercise;

public class FindMinAndMax {
	public static void main(String[] args) {

		int[] arr = { 12, 23, 45, 67, 78, 90 };

		int max = findMax(arr);
		int min = findMin(arr);

		System.out.println("Max Value is :" + max);
		System.out.println("Min value is :" + min);
	}
	
	public static int findMax(int[] arr) {
		int max =arr [0];
		for(int num : arr) {
			if(num > max) {
				max=num;
			}
		}
	
		return max;
	}

	public static int findMin(int[] arr) {
		int min =arr[0];
		for (int num : arr) {
			if (num > min) {
				min = num;
			}

		}

		return min;
	}


}
	

