package com.springboot.databaseproperties.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springboot.databaseproperties.request.AddBookRequest;
import com.springboot.databaseproperties.response.AddBookResponse;
import com.springboot.databaseproperties.response.SearchBookResponse;

public interface LMSDao {
	
	public AddBookResponse addBook(AddBookRequest employee);
	public List<AddBookRequest> fetchAllBooks();
	public SearchBookResponse fetchBooksById(int bookId);
	public ResponseEntity<AddBookRequest> updateBook(AddBookRequest book);
	void deleteBook(int bookId);
}
