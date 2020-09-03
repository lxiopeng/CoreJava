package com.lanqiao.bitoperation;

import java.util.Scanner;

/**
 * @author 李鹏
 * @date 2020年9月2日
 * 问题：用一条语句判断一个整数是不是2的整数次方
 */
public class PowerTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if((N & (N - 1)) == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
