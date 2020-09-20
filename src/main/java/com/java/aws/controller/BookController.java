package com.java.aws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.aws.model.Book;

@RestController
@RequestMapping("bookmanagement/api/v1")
public class BookController {
	
	List<Book> listOfBooks=new ArrayList<>();
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		listOfBooks.add(book);
		return "added book successfully";
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		return listOfBooks;
	}

}
