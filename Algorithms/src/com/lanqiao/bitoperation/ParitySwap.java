package com.lanqiao.bitoperation;

import java.util.Scanner;

/**
 * @author 李鹏
 * @date 2020年9月2日
 * 问题：将整数的奇偶位互换，比如9的二进制：1001变为0110
 */
public class ParitySwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//取出偶数位：10101010....
		int ou = N & 0xaaaaaaaa;
		//取出奇数位：01010101....
		int ji = N & 0x55555555;
		int res = (ou >> 1) ^ (1 << ji);
		System.out.println(res);
	}
}
