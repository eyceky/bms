package com.ycelhotel;

/**
 * 实体类，书
 * @author eyceky
 *
 */
public class Book {
	//书名
	private String name;
	//作者
	private String author;
	//出版社
	private String publisher;
	//价格
	private double price;
	
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
