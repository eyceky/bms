/**
 * 专门用于练习的一个类
 */
package com.ycelhotel.test;

public class Practice {
	public static void main(String[] args){
		long sum=factorial(11);
		System.out.println(sum);
	}
	
	//循环实现二分查找方法
	public static int binarySearch(int key,int[] arr){
		int begin=0;
		int end=arr.length-1;
		while(begin<=end){
			int mid=(begin+end)/2;
			System.out.println("numbers[mid]是:"+arr[mid]);
			if(key==arr[mid]){
				System.out.println("找到了");
				System.out.println("这个数的角标是："+mid);
				break;
			}else if(key<arr[mid]){
				end=mid-1;
			}else{
				begin=mid+1;
			}
		
		}
		return -1;
	}
	
	//递归实现二分查找法
	public static int binarySearch(int[] array,int key,int beginIndex,int endIndex){
		
		if(beginIndex>endIndex){
			return -1;
		}
		int midIndex=(beginIndex+endIndex)/2;
		if(key==array[midIndex]){
			return midIndex;
		}else if(key>array[midIndex]){
			return (binarySearch(array,key,beginIndex+1,endIndex));
		}else{
			return (binarySearch(array,key,beginIndex,endIndex-1));
		}
	}
	
	
	//阶乘方法
	public static long factorial(int num){
		/*if(num==1){
			return 1;
		}*/
		return num*factorial(num-1);
	}
	
	//找出数组中的最大值
	public static int findMax(int[] array,int index){
		int max=0;
		if(max<array[index]){
			max=array[index];
		}
		return -1;
	}
}
