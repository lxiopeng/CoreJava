package com.lanqiao.bitoperation;
/**
 * @author 李鹏
 * @date 2020年9月2日
 * 问题：数组中只有一个数出现了1次，其他的数都
 * 出现了k次，请输出只出现了1次的数
 */
public class KOccurrencesAndOneOccurrence {
	public static void main(String[] args) {
		//构造原数组
		int[] arr = {1,1,1,2,2,2,3,3,3,4,5,5,5,6,6,6};
		int len = arr.length;
		//构造二维数组存储每个数的三进制
		char[][] kRadix = new char[len][];
		//进制数位3进制
		int k = 3;
		//转成三进制之后最长的长度
		int maxLen = 0;
		//十进制转三进制
		for (int i = 0; i < arr.length; i++) {
			kRadix[i] = new StringBuilder(Integer.toString(arr[i],3)).reverse().toString().toCharArray();
			if (kRadix[i].length > maxLen) {
				maxLen = kRadix[i].length;
			}
		}
		//不进位加法
		int[] resArr = new int[maxLen];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < maxLen; j++) {
				if(j >= kRadix[i].length) {
					resArr[j] += 0;
				} else {
					resArr[j] += kRadix[i][j] - '0';
				}
			}
		}
		//结果转成十进制
		int res = 0;
		for (int i = 0; i < maxLen; i++) {
			res += Math.pow(3, i);
		}
		System.out.println(res);
	}
}
