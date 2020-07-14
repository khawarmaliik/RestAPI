package com.springboot.databaseproperties.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.databaseproperties.repository.BookRepository;
import com.springboot.databaseproperties.request.AddBookRequest;
import com.springboot.databaseproperties.response.AddBookResponse;
import com.springboot.databaseproperties.response.SearchBookResponse;

@Service
public class LMSDaoImpl implements LMSDao {

	@Autowired
	BookRepository bookRepo;
	int count=0;
	
	@Override
	public AddBookResponse addBook(AddBookRequest book) {
		// TODO Auto-generated method stub
		AddBookResponse addbookResponse = new AddBookResponse();
		book = bookRepo.save(book);
		addbookResponse.setbookId(book.getbookId());
		book.setCount(count++);
		System.out.println(count);
		return addbookResponse;
	}

	@Override
	public List<AddBookRequest> fetchAllBooks() {
		// TODO Auto-generated method stub
		return (List<AddBookRequest>) bookRepo.findAll();
	}

	@Override
	public SearchBookResponse fetchBooksById(int bookId) {
		// TODO Auto-generated method stub
		SearchBookResponse searchBookObj = new SearchBookResponse();
		AddBookRequest book =  bookRepo.findById(bookId).orElseThrow(null);
		searchBookObj.setBookId(book.getbookId());
		searchBookObj.setBookName(book.getbookName());
		searchBookObj.setBookAuthor(book.getbookAuthor());
		searchBookObj.setBookType(book.getBookType());
		return searchBookObj;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		AddBookRequest book = new AddBookRequest();
		book.setCount(count--);
		System.out.println(count);
		bookRepo.deleteById(bookId);
	}

	@Override
	public ResponseEntity<AddBookRequest> updateBook(AddBookRequest book) {
//		AddbookloyeeRequest bookloyee = new AddbookloyeeRequest();
		return bookRepo.findById(book.getbookId())
				.map(newBook -> {
					newBook.setbookName(book.getbookName());	
					newBook.setbookAuthor(book.getbookAuthor());
					newBook.setBookType(book.getBookType());
					AddBookRequest updated = bookRepo.save(newBook);
					return ResponseEntity.ok().body(updated);
				}).orElse(ResponseEntity.notFound().build());
	}
}
