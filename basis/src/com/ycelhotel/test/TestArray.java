//����ð�������ѡ�������Ч��
package com.ycelhotel.test;

public class TestArray {
	public static void main(String[] args){
		//����ͳ�ƱȽϴ����Ĳ���
		int count=0;
		int[] arr1={3,2,5,8,1,4,10,9,6,7};
		arr1=creatArray(1,100000);
		//System.out.println("����ǰ�����飺");
		//System.out.println(Arrays.toString(arr1));
		//����ð������
		System.out.println("����ð������");
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
		//System.out.println("ð�����������飺");
		//System.out.println(Arrays.toString(arr1));
		System.out.println("ð������һ���Ƚ���"+count+"��");
		System.out.println("ð��������ʱ��"+(endTime-beginTime)+"ms");
		
		//����ѡ������
		int[] arr2={3,2,5,8,1,4,10,9,6,7};
		arr2=creatArray(1,100000);
		//System.out.println("����ѡ������");
		//System.out.println("����ǰ������");
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
		//System.out.println("ѡ�����������飺");
		//System.out.println(Arrays.toString(arr2));
		System.out.println("ѡ������һ���Ƚ���"+count+"��");
		System.out.println("ѡ��������ʱ"+(endTime-beginTime)+"ms");
		
		//�����������
		arr1=creatArray(1,100);
		//System.out.println("��ӡ���ɵ��������");
		//System.out.println(Arrays.toString(arr1));
	}
	//����ָ����Χ���ظ������������
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
