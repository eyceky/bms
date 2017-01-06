package com.ycelhotel;
import java.util.Scanner;
/**
 * 图书管理类
 * 存放管理的一些方法
 * @author eyceky
 *
 */
public class Manager {
	Scanner sc=new Scanner(System.in);
	//用于存放Book类的数组
	Book[] books=new Book[10]; 
	/**
	 *流程控制
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
				System.out.println("输入错误，请重新输入");
				continue;
			}
		}
	}
	
	/**
	 * 显示菜单
	 */
	public void displayMenu(){
		String[] menus={
				"**********欢迎使用*********",
				"**********请选择操作********",
				"1.查看图书 2.增加图书 3.删除图书",
				"4.修改图书 5.退出系统",
				"*************************"
		};
		for(int i=0;i<menus.length;i++){
			System.out.println(menus[i]);
		}
	}
	
	/**
	 * 查看图书
	 */
	public void displayBook(){
		for(int i=0;i<books.length;i++){
			if(books[i]==null){
				System.out.println("系统中还没有图书");
				break;
			}
			System.out.print("书名："+books[i].name+"  ");
			System.out.print("作者："+books[i].author+"  ");
			System.out.print("出版社："+books[i].publisher+"  ");
			System.out.print("价格："+books[i].price);
			System.out.println();
		}
	}
	
	/**
	 * 增加图书
	 */
	public void addBook(){
		int inventory=0;
		int empty=0;
		//查看书库的库存
		for(int index=0;index<books.length;index++){
			if(books[index]!=null){
				inventory++;
			}
		}
		empty=books.length-inventory;
		if(empty==0){
			System.out.println("书库已满");
		}else{
			System.out.println("书库中有"+inventory+"本书");
			System.out.println("还可以存放"+empty+"本书");
			Book book=new Book();
			System.out.println("请输入书名：");
			book.name=sc.next();
			System.out.println("请输入作者：");
			book.author=sc.next();
			System.out.println("请输入出版社：");
			book.publisher=sc.next();
			System.out.println("请输入价格：");
			book.price=sc.nextDouble();
			for(int index=0;index<books.length;index++){
				if(books[index]==null){
					books[index]=book;
					break;
				}
			}
		}
	}
	
	/**
	 * 删除图书
	 */
	public void deleteBook(){
		System.out.println("请输入需要删除图书的书名：");
		String bookName=sc.next();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i].name)){
				books[i]=null;
			}
		}
	}
	
	/**
	 * 修改图书
	 */
	public void updateBook(){
		System.out.println("请输入需要修改图书的书名：");
		String bookName=sc.next();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i].name)){
				System.out.println("请输入书名：");
				books[i].name=sc.next();
				System.out.println("请输入作者：");
				books[i].author=sc.next();
				System.out.println("请输入出版社：");
				books[i].publisher=sc.next();
				System.out.println("请输入价格：");
				books[i].price=sc.nextDouble();
			}
		}
	}
	
}
