package com.atmecs.prototype;

import java.util.ArrayList;
import java.util.List;

public class Bookshop implements Cloneable{
	
	private String name;
	private List<Book> books=new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		
		for(int i=1;i<11;i++) {
			Book book=new Book();
			book.setId(i);
			book.setName("Book "+i);
			getBooks().add(book);
		}
	
	}
	
	@Override
	public String toString() {
		return "Bookshop [name=" + name + ", books=" + books + "]";
	}
	
	/*
	 Shallow Copying
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
	
	//Deep Copying
	
	@Override
	protected Bookshop clone() throws CloneNotSupportedException {
		Bookshop bs=new Bookshop();
		for(Book b:this.getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}
	
	
	
	
	
	

}
