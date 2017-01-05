//测试冒泡排序和选择排序的效率
package com.ycelhotel.test;

public class TestArray {
	public static void main(String[] args){
		//用于统计比较次数的参数
		int count=0;
		int[] arr1={3,2,5,8,1,4,10,9,6,7};
		arr1=creatArray(1,100000);
		//System.out.println("排序前的数组：");
		//System.out.println(Arrays.toString(arr1));
		//进行冒泡排序
		System.out.println("进行冒泡排序：");
		long beginTime=System.currentTimeMillis();
		for(int i=0;i<arr1.length-1;i++){
			for(int j=0;j<arr1.length-1-i;j++){
				count++;
				if(arr1[j]>arr1[j+1]){
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}	
		}
		long endTime=System.currentTimeMillis();
		//System.out.println("冒泡排序后的数组：");
		//System.out.println(Arrays.toString(arr1));
		System.out.println("冒泡排序一共比较了"+count+"次");
		System.out.println("冒泡排序用时："+(endTime-beginTime)+"ms");
		
		//进行选择排序
		int[] arr2={3,2,5,8,1,4,10,9,6,7};
		arr2=creatArray(1,100000);
		//System.out.println("进行选择排序");
		//System.out.println("排序前的数组");
		//System.out.println(Arrays.toString(arr2));
		count=0;
		beginTime=System.currentTimeMillis();
		for(int i=0;i<arr2.length-1;i++){
			for(int j=i+1;j<arr2.length;j++){
				count++;
				if(arr2[i]<arr2[j]){
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		endTime=System.currentTimeMillis();
		//System.out.println("选择排序后的数组：");
		//System.out.println(Arrays.toString(arr2));
		System.out.println("选择排序一共比较了"+count+"次");
		System.out.println("选择排序用时"+(endTime-beginTime)+"ms");
		
		//测试随机数组
		arr1=creatArray(1,100);
		//System.out.println("打印生成的随机数组");
		//System.out.println(Arrays.toString(arr1));
	}
	//生成指定范围不重复随机数的数组
	public static int[] creatArray(int min,int max){
		if(max<min){
			return null;
		}
		int size=max-min+1;
		int[] array=new int[size];
		int index=0;
		while(index<size){
			int number=(int)(Math.random()*(max-min+1)+min);
			//System.out.print("number:"+number+",");
			boolean flag=true;
			for(int i=0;i<=index;i++){
				if(array[i]==number){
					flag=false;
					break;
				}
			}
			if(flag){
				array[index]=number;
				index++;
			}
		}
		
		return array;
		
	}
}
