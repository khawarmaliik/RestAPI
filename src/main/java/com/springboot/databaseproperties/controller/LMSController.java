package com.springboot.databaseproperties.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.databaseproperties.request.AddBookRequest;
import com.springboot.databaseproperties.request.DeleteBook;
import com.springboot.databaseproperties.response.AddBookResponse;
import com.springboot.databaseproperties.response.SearchBookResponse;
import com.springboot.databaseproperties.service.LMSService;


@RestController
@RequestMapping("/lms/")
public class LMSController {

	@Autowired
	LMSService empService;

	@PostMapping("add")
	@ResponseBody
	public AddBookResponse createEmployee(@RequestBody AddBookRequest book) {
		return empService.addBook(book);
		}
	
	@PostMapping(value = "all")
	public List<AddBookRequest> listAllBooks(){
		return empService.fetchAllBooks();
	}
	
	@PostMapping(value = "search") 
	public SearchBookResponse getEmployeeById (@RequestBody SearchBookResponse searchBook)
	{
		SearchBookResponse searchBookObj = empService.fetchBooksById(searchBook);
		if(searchBook != null) {
			return empService.fetchBooksById(searchBookObj);
		}
		 return new SearchBookResponse();
	    }
	
	@PostMapping(value = "delete")
	public void deleteAnEmployee(@RequestBody DeleteBook deleteBook) {
		empService.deleteBook(deleteBook);
	}
	
	@PutMapping("update")
	public ResponseEntity<AddBookRequest> update(@RequestBody AddBookRequest book){
				return empService.updateBook(book);
				}
	
	@GetMapping("list")
	public String listEmployees(Model theModel) {
		List<AddBookRequest> books = empService.fetchAllBooks();
		theModel.addAttribute("books", books);
		return "book-list";
		}
	@RequestMapping("new")
	public String index() {
		return "index";
	}
	
	}