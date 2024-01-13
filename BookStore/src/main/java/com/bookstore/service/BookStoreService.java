package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.BookStore;
import com.bookstore.repositary.BookStoreRepo;

@Service
public class BookStoreService {

	@Autowired
	private BookStoreRepo bookstorerepo;
	
	public void save(BookStore bookstore) {
		bookstorerepo.save(bookstore);
	}
	
	public List<BookStore> getAllBooks(){
		return bookstorerepo.findAll();
	}
	
	public BookStore getBookById(int id) {
		
		return bookstorerepo.findById(id).get();
	}
}
