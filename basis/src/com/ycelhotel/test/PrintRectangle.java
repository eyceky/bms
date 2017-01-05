
/**
 * 打印空心矩形
 * @author eyceky
 *
 */
package com.ycelhotel.test;
import java.util.Scanner;
public class PrintRectangle{
	public static void main(String[] args) throws InterruptedException{
		int row=0;	//行
		int column=0;	//列
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入打印行数:");
		row=sc.nextInt();
		System.out.println("请输入打印列数:");
		column=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=column;j++){
				//判断是否第一行或者最后一行，是否第一列或者最后一列，是就打印*号
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
