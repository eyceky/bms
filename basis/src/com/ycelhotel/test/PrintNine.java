/**
 * 打印99乘法表
 */

package com.ycelhotel.test;

public class PrintNine {
	public static void main(String[] args){
		//打印行
		for(int row=1;row<=9;row++){
			//打印列
			for(int col=1;col<=row;col++){
				System.out.print(col+"*"+row+"="+col*row);
				if(col!=row){
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
