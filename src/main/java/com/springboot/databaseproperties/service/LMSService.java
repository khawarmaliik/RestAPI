package com.springboot.databaseproperties.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springboot.databaseproperties.request.AddBookRequest;
import com.springboot.databaseproperties.request.DeleteBook;
import com.springboot.databaseproperties.response.AddBookResponse;
import com.springboot.databaseproperties.response.SearchBookResponse;

public interface LMSService {
	
	public AddBookResponse addBook(AddBookRequest employee);
	public List<AddBookRequest> fetchAllBooks();
	public SearchBookResponse fetchBooksById(SearchBookResponse searchBookObj);
	public void deleteBook(DeleteBook deleteBook);
	ResponseEntity<AddBookRequest> updateBook(AddBookRequest book);
}
