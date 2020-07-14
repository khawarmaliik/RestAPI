package com.springboot.databaseproperties.response;

public class AllBooksResponse {
	
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookType;

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		this.bookId = bookId;
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookName) {
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
