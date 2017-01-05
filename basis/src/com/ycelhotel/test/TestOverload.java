package com.ycelhotel.test;

public class TestOverload {
	public static void main(String[] args){
		int num1=66;
		int num2=79;
		int num3=88;
		System.out.println(num1+","+num2+"之中较大的是："+max(num1,num2));
		System.out.println(num1+","+num2+","+num3+"之中较大的是："+max(num1,num2,num3));
	}
	//比较两个整形的大小
	public static int max(int num1,int num2){
		return num1>num2?num1:num2;
	}
	//比较三个整形的大小
	public static int max(int num1,int num2,int num3){
		int temp=num1>num2?num1:num2;
		return temp>num3?temp:num3;
	}
	//比较两个浮点数的大小
	public static double max(double num1,double num2){
		return num1>num2?num1:num2;
	}
	
}
