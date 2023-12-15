package com.ArrayExercise;

import java.util.Arrays;

public class ReversedArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		System.out.println("ReversedArray is:"+Arrays.toString(reversedArray(array)));
		
		
	}

	public static int[] reversedArray(int[] array) {
		int[] reversedArray = new int[array.length];
		int count=0;
		for(int i=array.length-1;i>=0;i--) {
			reversedArray[count]=array[i];
			count++;
		}
		return reversedArray;
	}

	

}
