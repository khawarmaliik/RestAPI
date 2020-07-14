package com.springboot.databaseproperties.request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "lms")
public class AddBookRequest {
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	private String bookType;
	
	private int count;

	public AddBookRequest(String bookName, String bookAuthor, String bookType) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
	}

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

	public String getbookAuthor() {
		return bookAuthor;
	}

	public void setbookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public AddBookRequest() {
		super();
	}
}
