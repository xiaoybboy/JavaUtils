package com.xiaoyb.sort;

public class QuickSort {
	/**
	 * ���ҳ����ᣨĬ�������λlow������numbers�������������λ��
	 * 
	 * @param numbers
	 *            ����������
	 * @param low
	 *            ��ʼλ��
	 * @param high
	 *            ����λ��
	 * @return ��������λ��
	 */
	public static int getMiddle(int[] numbers, int low, int high) {
		int key = numbers[low]; // ����ĵ�һ����Ϊ����(key)
		while (low < high) {
			while (low < high && numbers[high] > key) {
				high--;
			}
			numbers[low] = numbers[high];// ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && numbers[low] < key) {
				low++;
			}
			numbers[high] = numbers[low]; // �������ļ�¼�Ƶ��߶�
		}
		numbers[low] = key; // �����¼��β
		return low; // ���������λ��
	}
}
