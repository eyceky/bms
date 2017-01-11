package com.ycelhotel;

/**
 * 实体类，书
 * @author eyceky
 *
 */
public class Book {
	
	private String name;			//书名
	private String author;			//作者
	private String publisher;		//出版社
	private double price;			//价格
	
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
