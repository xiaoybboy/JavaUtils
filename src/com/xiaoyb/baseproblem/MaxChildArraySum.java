package com.xiaoyb.baseproblem;

/**
 * <p>
 * 求连续子数组之和的最大值
 * </p>
 * 假设现在有一个n个元素的数组，这n个元素可以是正数或者负数，数组中的连续一个或者多个元素可以组成一个连续的子数组，一个数组中有多个这种连续的
 * 子数组，求最大子数组和的最大值
 * 
 * 方法三种：
 * 
 * 1.找出所有的子数组，然后求子数组的和，在所有子数组的和中找出最大值，时间复杂度O(n^3)
 * 
 * 2.重复利用已经计算的子数组的和O(n^2)
 * 
 * 3.扫描法
 * 
 * @author XIAO
 *
 */
public class MaxChildArraySum {
	public static void main(String[] args) {
		int[] nums = { 1, -2, 4, 8, -4, 7, -1, -5 };
		int maxsum = maxSubArraySum1(nums);
		System.out.println(maxsum);

	}

	// 方法1
	private static int maxSubArraySum(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		// i和j代表nums的两个位置,k在i和j之间游动，计算从i--j的子数组的和
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int tempSum = 0;
				for (int k = i; k < j; k++) {
					tempSum += nums[k];
				}
				if (tempSum > maxSum) {
					maxSum = tempSum;
				}
			}
		}
		return maxSum;
	}

	// 方法二,重复利用已经计算的值
	private static int maxSubArraySum1(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int tempSum = 0;
			for (int j = i; j < n; j++) {
				tempSum += nums[j];
				if (tempSum > maxSum) {
					maxSum = tempSum;
				}
			}
		}
		return maxSum;
	}

	// 方法三
	private static int maxSubArraySum2(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		int tempSum = 0;
		for (int i = 0; i < n; i++) {
			tempSum += nums[i];
			if (tempSum > maxSum)
				maxSum = tempSum;
			if (tempSum < 0)// 当sum<0时，最大和连续子数组要么在A[0,...,i-1]中，要么在A[i+1,...,n-1]中。
				tempSum = 0;// 令sum=0,接下来求A[i+1,...,n-1]的最大和连续子数组
		}
		return maxSum;
	}
}
