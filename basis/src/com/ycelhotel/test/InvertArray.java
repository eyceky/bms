/**
 * ��ת����
 */
package com.ycelhotel.test;

public class InvertArray {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9};
		//��ӡԭ����
		System.out.println("ԭ����");
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("}");
		//��ʼ��ת
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
		//��ӡ��ת�������
		System.out.println("��ת����");
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
