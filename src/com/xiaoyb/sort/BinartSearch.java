package com.xiaoyb.sort;

public class BinartSearch {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 8, 10, 14 };
		System.out.println(BinartSearch.biSearch(array, 5));
	}

	public static int biSearch(int[] array, int a) {
		int lo = 0;
		int hi = array.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (array[mid] == a) {
				return mid + 1;
			} else if (array[mid] < a) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}

	// µİ¹é°æ±¾
	public static int sort(int[] array, int a, int lo, int hi) {
		if (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a == array[mid]) {
				return mid + 1;
			} else if (a > array[mid]) {
				return sort(array, a, mid + 1, hi);
			} else {
				return sort(array, a, lo, mid - 1);
			}
		}
		return -1;
	}
}
