package com.lanqiao.bitoperation;
/**
 * @author 李鹏
 * @date 2020年9月2日
 * 问题：给定一个介于0和1之间的实数，如（0.625），类型位double,打印
 * 它的二进制表示（0.101，因为小数点后的二进制分别表示0.5，0.25，0.125
 * .......）,如果该数字无法精确的用32位以内的二进制表示，则打印“ERROR”
 */
public class BinaryFloatNumber {
	public static void main(String[] args) {
		double num = 0.625;
		StringBuilder sb = new StringBuilder("0.");
		while(num != 0) {
			double n = num * 2;
			//如果num*2大于1，sb追加1，num*2-1
			if (n >= 1) {
				sb.append("1");
				num = n - 1;
			} else {
				//如果num*2小于一，num=num*2，sb追加0
				sb.append("0");
				num = n;
			}
			//长度超过32位，退出
			if (sb.length() > 34) {
				System.out.println("ERROR");
				break;
			}
		}
		System.out.println(sb);
	}
}
