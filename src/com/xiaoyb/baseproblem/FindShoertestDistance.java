package com.xiaoyb.baseproblem;

/**
 * <p>
 * 有一个数组，数组中包含重复元素，给出两个数n1和n2，求这两个数在数组中的最小距离
 * </p>
 * 
 * <p>
 * 思路:n1和n2的距离最小时，n1和n2一定在相邻的位置，不可能跨越另一个n1或者n2
 * </p>
 * 
 * @since 2017/7
 * @author XIAO
 *
 */
public class FindShoertestDistance {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 9, 8, 4, 2, 3, 5, 4, 7, 6, 8, 9, 6, 2, 5, 3, 7, 8, 6, 9, 10 };
		int shortestDis = getShortestDistance(nums, 6, 9);
		System.out.println(shortestDis);

	}

	private static int getShortestDistance(int[] nums, int n1, int n2) {
		if (nums == null) {
			return Integer.MAX_VALUE;
		}
		int indexN1 = -1;
		int indexN2 = -1;
		int shortestDis = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == n1) {
				indexN1 = i;
				if (indexN2 != -1) {
					shortestDis = Math.min(shortestDis, Math.abs(indexN1 - indexN2));
				}
			} else if (nums[i] == n2) {
				indexN2 = i;
				if (indexN1 != -1) {
					shortestDis = Math.min(shortestDis, Math.abs(indexN1 - indexN2));
				}
			}
		}
		return shortestDis;
	}
}
