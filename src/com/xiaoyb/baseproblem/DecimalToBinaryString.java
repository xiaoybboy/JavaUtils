package com.xiaoyb.baseproblem;

/**
 * <p>
 * 十进制转换成二进制的字符串
 * </p>
 * 思路：对2反复取余，得到的结果反向
 * 
 * @author XIAO
 *
 */
public class DecimalToBinaryString {
	public static void main(String[] args) {
		int n = 8;
		StringBuilder builder = new StringBuilder();// 二进制字符串
		while (n != 0) {
			if (n % 2 == 1) {
				builder.append("1");
			} else {
				builder.append("0");
			}
			n /= 2;
		}
		System.out.println(builder.reverse().toString());
	}
}
