package com.lanqiao.bitoperation;

import java.util.Arrays;
import java.util.Random;

import com.lanqiao.util.Util;

/**
 * @author 李鹏
 * @date 2020年9月1日
 * 问题：1-1000这1000个数放在含有1001个元素的数组中，只有唯一的一个
 * 元素值重复，其他均只出现一次。每个数组元素只能访问一次，设计一个元
 * 素，将他找出来；不用辅助空间，能否设计一个算法实现？ 
 */
public class TheOnlyPair {
	public static void main(String[] args) {
		int N = 11;
		int[] arr = new int[N];
		//初始化前N-1项
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = i + 1;
		}
		//初始化第N项为一个随机数
		arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;
		//产生一个随机下标
		int index = new Random().nextInt(N);
		//交换随机下标和N - 1位置的值
		Util.Swap(arr,arr.length - 1, index);
		System.out.println(Arrays.toString(arr));
		//解法一：异或运算
		int x1 = 0;
		//求出1~N-1的连续异或
		for (int i = 1; i <= N - 1; i++) {
			x1 = x1^i;
		}
		for (int i = 0; i < arr.length; i++) {
			x1 = x1^arr[i];
		}
		System.out.println(x1);
		//解法二：开辟辅助空间
		int[] helper = new int[N];
		for (int i = 0; i < N; i++) {
			helper[arr[i]]++;
		}
		for (int i = 0; i < helper.length; i++) {
			if(helper[i] == 2) {
				System.out.println(i);
				break;
			}
		}
	}
}
