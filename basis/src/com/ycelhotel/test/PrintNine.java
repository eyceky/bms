/**
 * ��ӡ99�˷���
 */

package com.ycelhotel.test;

public class PrintNine {
	public static void main(String[] args){
		//��ӡ��
		for(int row=1;row<=9;row++){
			//��ӡ��
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
