package com.ycelhotel;
import java.util.Scanner;
/**
 * ͼ�������
 * ��Ź����һЩ����
 * @author eyceky
 *
 */
public class Manager {
	//���ڴ��Book�������
	Book[] books=new Book[10]; 
	/**
	 *���̿���
	 */
	public void flow(){
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();
		displayMenu();
		while(true){
			switch(select){
			case 1:
				displayBook();
				break;
			case 2:
				
				default:
			}
			sc.close();
		}
	}
	
	/**
	 * ��ʾ�˵�
	 */
	public void displayMenu(){
		String[] menus={
				"**********��ӭʹ��*********",
				"**********��ѡ�����********",
				"1.�鿴ͼ�� 2.����ͼ�� 3.ɾ��ͼ��",
				"4.�޸�ͼ�� 5.�˳�ϵͳ",
				"*************************"
		};
		for(int i=0;i<menus.length;i++){
			System.out.println(menus[i]);
		}
	}
	
	/**
	 * �鿴ͼ��
	 */
	public void displayBook(){
		for(int i=0;i<books.length;i++){
			if(books[i]==null){
				System.out.println("ϵͳ�л�û��ͼ��");
				break;
			}
			System.out.print("������"+books[i].name+"  ");
			System.out.print("���ߣ�"+books[i].author+"  ");
			System.out.print("�����磺"+books[i].publisher+"  ");
			System.out.print("�۸�"+books[i].price);
			System.out.println();
		}
	}
	
	/**
	 * ����ͼ��
	 */
	public void addBook(){
		int count=0;
		for(int i=0;i<books.length;i++){
			if(books[i]==null){
				count++;
			}
		}
		if(count==0){
			System.out.println("�������");
		}else{
			System.out.println("�����Դ��"+count+"����");
			Scanner sc=new Scanner(System.in);
			Book book=new Book();
			System.out.println("������������");
			book.name=sc.next();
			System.out.println("���������ߣ�");
			book.author=sc.next();
			sc.close();
		}
	}
}
