package com.ycelhotel.test;
public class CountSum{
	public static void main(String[] args){
		int i=0,sum=0;
		while(i<100){
			i++;
			if(i%7==0){
				sum++;
				System.out.println(i);
			}
		}
		System.out.println("100���ڣ�7�ı����ĸ�����"+sum);
	}
}