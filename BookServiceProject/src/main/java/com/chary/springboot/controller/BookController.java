package com.chary.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chary.springboot.entities.Book;
import com.chary.springboot.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}

	@PostMapping("/insert")
	public Book inserBook(@RequestBody Book book) {
		return bookService.insertBook(book);
	}
}
