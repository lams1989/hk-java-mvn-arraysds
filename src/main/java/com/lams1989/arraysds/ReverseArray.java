package com.lams1989.arraysds;

public class ReverseArray {
	
	public static void printArray(int[]arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		
	}

	public static int[] reverseSaveArray(int[] arr) {
		int[] save = new int[arr.length];
		for (int j = save.length-1; j >= 0;) {
			for (int i = 0; i < arr.length; i++) {
				save[j] = arr[i];
				j--;
			}
		}
		return save;

	}
}
