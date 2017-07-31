package com.xiaoyb.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 1, 15, 7, 5, 8, 6, 14 };
		BubbleSort.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; ++i) {
			for (int j = a.length - 1; j > i; --j) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}
}
