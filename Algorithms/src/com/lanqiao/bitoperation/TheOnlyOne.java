package com.lanqiao.bitoperation;
/**
 * @author 李鹏
 * @date 2020年9月1日
 * 问题：一个数组里除了某一个数字之外，其他数字都出现了两次。编写
 * 一个程序找出这个只出现的一次的数字 
 */
public class TheOnlyOne {
	public static void main(String[] args) {
		int[] arr = {11,11,222,33,33,44,44,55,55};
		//解法一：使用异或运算的去重功能
		int x1 = 0;
		for (int i = 0; i < arr.length; i++) {
			x1 = x1 ^ arr[i];
		}
		System.out.println(x1);
	}
}
