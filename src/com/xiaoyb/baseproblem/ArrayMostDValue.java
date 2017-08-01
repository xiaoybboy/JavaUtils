package com.xiaoyb.baseproblem;

/**
 * <p>
 * 求数组中顺向差值的最大值，只能从前往后比,时间不能倒流
 * </p>
 * 
 * @author XIAO
 *
 */
public class ArrayMostDValue {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 62, 86, 36, 56, 24, 63, 8, 6, 89, 45 };
		int mostDValue = getMostDValue(nums);
		System.out.println(mostDValue);
	}

	private static int getMostDValue(int[] nums) {
		int mostDValue = 0;// 数组中最大差值
		int minNum = nums[0];// 数组中最小的数
		// 循环时，同时寻找最小值和最大差值
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < minNum) {
				minNum = nums[i];
			}
			if (nums[i] - minNum > mostDValue) {
				mostDValue = nums[i] - minNum;
			}
		}
		return mostDValue;
	}

}
