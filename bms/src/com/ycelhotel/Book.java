package com.ycelhotel;

/**
 * ʵ���࣬��
 * @author eyceky
 *
 */
public class Book {
	
	private String name;			//����
	private String author;			//����
	private String publisher;		//������
	private double price;			//�۸�
	
	Book(){
		
	}
	Book(String name,String author,String publisher,double price){
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	public String getPublisher(){
		return this.publisher;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return this.price;
	}
}
