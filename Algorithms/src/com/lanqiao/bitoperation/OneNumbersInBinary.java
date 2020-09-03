package com.lanqiao.bitoperation;

import java.util.Scanner;

/**
 * @author 李鹏
 * @date 2020年9月1日
 * 问题：请实现一个函数，输入一个整数，输出该二进制表示中1的个数。例
 * 如：9的二进制表示为1001，有2位是1
 */
public class OneNumbersInBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//输出N的二进制数
		System.out.println(Integer.toString(N,2));
		//解法一：1每次左移一位和原数做与运算，原数不变，
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if((N & (1<<i)) == (1<<i)) {
				count++;
			}
		}
		System.out.println(count);
		//解法二：原数每次无符号右移以为，与1做与运算，1不变
		count = 0;
		for (int i = 0; i < 32; i++) {
			if(((N >>> i) & 1) == 1) {
				count++;
			}
		}
		System.out.println(count);
		//解法三：每次消除最低位的1，直到原数为0退出循环
		count = 0;
		while(N != 0) {
			N = (N & (N - 1));
			count++;
		}
		System.out.println(count);
	}
}
