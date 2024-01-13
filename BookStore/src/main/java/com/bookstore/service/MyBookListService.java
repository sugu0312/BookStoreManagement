package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.MyBookList;
import com.bookstore.repositary.MyBookListRepositary;

@Service
public class MyBookListService {

	@Autowired
	private MyBookListRepositary booklistrepo;
	
	public void saveMyBook(MyBookList booklist) {
		booklistrepo.save(booklist);
	}
	
	public List<MyBookList> getAllBooks(){
		return booklistrepo.findAll();
	}
	
	public void deleteById(int id) {
		
		booklistrepo.deleteById(id);
	}
	
	
}
