package com.ycelhotel;
import java.util.Scanner;
/**
 * 图书管理类
 * 存放管理的一些方法
 * @author eyceky
 *
 */
public class Manager {
	//用于存放Book类的数组
	Book[] books=new Book[10]; 
	/**
	 *流程控制
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
		int count=0;
		for(int i=0;i<books.length;i++){
			if(books[i]==null){
				count++;
			}
		}
		if(count==0){
			System.out.println("书库已满");
		}else{
			System.out.println("还可以存放"+count+"本书");
			Scanner sc=new Scanner(System.in);
			Book book=new Book();
			System.out.println("请输入书名：");
			book.name=sc.next();
			System.out.println("请输入作者：");
			book.author=sc.next();
			sc.close();
		}
	}
}
