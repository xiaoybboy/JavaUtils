package com.xiaoyb.baseproblem;

/**
 * <p>
 * 1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现一次．
 * 每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空间， 能否设计
 * </p>
 * 思路：异或操作，相同为0，不同为1.
 * 
 * @author XIAO
 *
 */
public class FindUiqueSameNum {
	public static void main(String[] args) {
	}

	// 1。全部的数据的和减去1-N的和，即为所求重复元素
	private static int getUniqueSameNum(int[] nums) {
		int sumN = (1 + 1000) * 1000 / 2;
		int sumAll = 0;
		for (int i = 0; i < nums.length; i++) {
			sumAll += nums[i];
		}
		return sumAll - sumN;
	}

	// 2.异或
	/**
	 * 根据异或法的计算方式，每两个相异的数执行异或运算之后，结果为1；每两个相同的数异或之后，结果为0，任何数与0异或，结果仍为自身。所以数组a[N]中的N个数异或
	 * 结果与1至N-1 异或的结果再做异或，得到的值即为所求。
	 * 
	 * 设重复数为A，其余N-2 个数异或结果为B，N个数异或结果为A^A^B，1 至N-1
	 * 异或结果为A^B，由于异或满足交换律和结合律，且X^X=0,0^X=X，
	 * 
	 * 则有(A^B)^(A^A^B)=A^B^B=A.
	 */
	private static int getUniqueSameNum2(int[] nums) {
		int i;
		int result = 0;
		for (i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		for (i = 1; i < nums.length; i++) {
			result ^= i;
		}
		return result;
	}

}
