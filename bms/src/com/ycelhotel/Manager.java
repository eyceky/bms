package com.ycelhotel;
import java.util.Scanner;
/**
 * ͼ�������
 * ��Ź����һЩ����
 * @author eyceky
 *
 */
public class Manager {
	private int inventory=0;
	Scanner sc=new Scanner(System.in);
	//���ڴ��Book�������
	Book[] books=new Book[10];
	
	/**
	 *���̿���
	 */
	public void flow(){
		while(true){
			displayMenu();
			int select=sc.nextInt();
			switch(select){
			case 1:
				displayBook();
				continue;
			case 2:
				addBook();
				continue;
			case 3:
				deleteBook();
				continue;
			case 4:
				updateBook();
				continue;
			case 5:
				sc.close();
				System.exit(0);
			default:
				System.out.println("�����������������");
				continue;
			}
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
			if(books[i]!=null){
				System.out.print("������"+books[i].getName()+"  ");
				System.out.print("���ߣ�"+books[i].getAuthor()+"  ");
				System.out.print("�����磺"+books[i].getPublisher()+"  ");
				System.out.print("�۸�"+books[i].getPrice());
				System.out.println();
			}else{
				System.out.println("ϵͳ�л�û��ͼ��");
				break;
			}
		}
	}
	
	/**
	 * ����ͼ��
	 */
	public void addBook(){
		int inventory=0;
		int empty=0;
		//�鿴���Ŀ��
		for(int index=0;index<books.length;index++){
			if(books[index]!=null){
				inventory++;
			}
		}
		empty=books.length-inventory;
		if(empty==0){
			System.out.println("�������");
		}else{
			System.out.println("�������"+inventory+"����");
			System.out.println("�����Դ��"+empty+"����");
			Book book=new Book();
			System.out.println("������������");
			book.setName(sc.next());
			System.out.println("���������ߣ�");
			book.setAuthor(sc.next());
			System.out.println("����������磺");
			book.setPublisher(sc.next());
			System.out.println("������۸�");
			book.setPrice(sc.nextDouble());
			for(int index=0;index<books.length;index++){
				if(books[index]==null){
					books[index]=book;
					break;
				}
			}
		}
	}
	
	/**
	 * ɾ��ͼ��
	 */
	public void deleteBook(){
		System.out.println("��������Ҫɾ��ͼ���������");
		String bookName=sc.next();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i].getName())){
				books[i]=null;
			}
		}
	}
	
	/**
	 * �޸�ͼ��
	 */
	public void updateBook(){
		System.out.println("��������Ҫ�޸�ͼ���������");
		String bookName=sc.next();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i].getName())){
				System.out.println("������������");
				books[i].setName(sc.next());
				System.out.println("���������ߣ�");
				books[i].setAuthor(sc.next());
				System.out.println("����������磺");
				books[i].setPublisher(sc.next());
				System.out.println("������۸�");
				books[i].setPrice(sc.nextDouble());
			}
		}
	}
}
