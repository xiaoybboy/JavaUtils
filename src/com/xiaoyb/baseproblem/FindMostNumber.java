package com.xiaoyb.baseproblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <p>
 * 找到一个数组中重复元素最多的数
 * </p>
 * 
 * @since 2017/7
 * @author XIAO
 *
 */
public class FindMostNumber {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 3, 4, 6, 5, 5, 9, 6, 8, 7, 4, 5, 3, 1, 8, 9, 6 };
		int most = most(nums);
		System.out.println(most);
	}

	private static int most(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		// 遍历Map
		int most = 0;
		int result = 0;
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			int key = entry.getKey();
			int val = entry.getValue();
			if (val > most) {
				most = val;
				result = key;
			}
		}
		return result;
	}
}
