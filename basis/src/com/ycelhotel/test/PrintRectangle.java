
/**
 * ��ӡ���ľ���
 * @author eyceky
 *
 */
package com.ycelhotel.test;
import java.util.Scanner;
public class PrintRectangle{
	public static void main(String[] args) throws InterruptedException{
		int row=0;	//��
		int column=0;	//��
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ӡ����:");
		row=sc.nextInt();
		System.out.println("�������ӡ����:");
		column=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=column;j++){
				//�ж��Ƿ��һ�л������һ�У��Ƿ��һ�л������һ�У��Ǿʹ�ӡ*��
				if(i==1||i==row||j==1||j==column){
					System.out.print("*");
					Thread.sleep(100);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
