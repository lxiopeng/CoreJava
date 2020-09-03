package com.lanqiao.util;

/**
 * @author 李鹏
 * @date 2020年9月1日
 * 工具类 
 */
public class Util {
	/**
	 * 交换数组中两个数的值
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
