package com.springboot.databaseproperties.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.databaseproperties.dao.LMSDao;
import com.springboot.databaseproperties.request.AddBookRequest;
import com.springboot.databaseproperties.request.DeleteBook;
import com.springboot.databaseproperties.response.AddBookResponse;
import com.springboot.databaseproperties.response.SearchBookResponse;

@Service
public class LMSServiceImpl implements LMSService {

	
	@Autowired
	LMSDao empDao;
	
	@Override
	public AddBookResponse addBook(AddBookRequest book) {
		// TODO Auto-generated method stub
		return empDao.addBook(book);
	}

	@Override
	public List<AddBookRequest> fetchAllBooks() {
		// TODO Auto-generated method stub
		return empDao.fetchAllBooks();
	}

	@Override
	public SearchBookResponse fetchBooksById(SearchBookResponse searchBooks) {
		// TODO Auto-generated method stub
		return empDao.fetchBooksById(searchBooks.getBookId());
	}

	@Override
	public void deleteBook(DeleteBook deleteBook) {
		empDao.deleteBook(deleteBook.getBookId());
		
	}

	@Override
	public ResponseEntity<AddBookRequest> updateBook(AddBookRequest book) {
		// TODO Auto-generated method stub
		return empDao.updateBook(book);
	}
}
