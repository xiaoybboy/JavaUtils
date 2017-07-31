package com.xiaoyb.baseproblem;

/**
 * <p>
 * 不同排序的方法，一次找到数组中第二大的元素
 * </p>
 * 思路：打擂法 设置两个变量，最开始Max指向第一个元素，secondMax为-1.
 * 
 * 当后面的元素大于Max时，将Max的值赋给SecondMax,后面的赋给Max.
 * 
 * 当后面的元素小于Max时，比较后面的元素与SecondMax的大小。如果大于SecondMax，则把后面的元素的值赋给SecondMax
 * 
 * @author XIAO
 *
 */
public class FindSecondMaxNum {
	public static void main(String[] args) {
		int[] nums = { 3, 35, 68, 500, 65, 98, 256, 58, 34, 289 };
		int secondMax = GetSecondMaxNum(nums);
		System.out.println(secondMax);
	}

	private static int GetSecondMaxNum(int[] nums) {
		int max = nums[0];
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
			} else {
				if (nums[i] > secondMax) {
					secondMax = nums[i];
				}
			}
		}
		return secondMax;
	}
}
