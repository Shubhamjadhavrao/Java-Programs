package com.ArrayExercise;

public class DublicatesFind {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,4};
		int res = findDublicates(arr);
		System.out.println("Dublicates elements is:"+res);
	}
	

	public static int findDublicates(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i != j) {
					count++;
					break;
				}
			}
		}
		return count/2;
	}

}
