package com.springboot.databaseproperties.response;

import org.springframework.data.annotation.ReadOnlyProperty;

public class SearchBookResponse {

	private int bookId;
	
	@ReadOnlyProperty
	private String bookName;
	
	@ReadOnlyProperty
	private String bookAuthor;

	@ReadOnlyProperty
	private String bookType;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
}
