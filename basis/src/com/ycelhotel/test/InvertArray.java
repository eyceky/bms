/**
 * 反转数组
 */
package com.ycelhotel.test;

public class InvertArray {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9};
		//打印原数组
		System.out.println("原数组");
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("}");
		//开始反转
		int begin=0;
		int end=arr.length-1;
		int temp=0;
		do{
			temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			begin++;
			end--;
		}while(begin<end);
		//打印反转后的数组
		System.out.println("反转数组");
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
}
