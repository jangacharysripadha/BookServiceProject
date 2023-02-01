package com.chary.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chary.springboot.entities.Book;
import com.chary.springboot.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book getBookById(int id)
	{
		return bookRepository.findById(id).get();
	}
	
	public Book insertBook(Book book)
	{
		return bookRepository.save(book);
	}

}
