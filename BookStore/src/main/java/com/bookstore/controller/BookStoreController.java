package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.entity.BookStore;
import com.bookstore.entity.MyBookList;
import com.bookstore.service.BookStoreService;
import com.bookstore.service.MyBookListService;

@Controller
public class BookStoreController {

	@Autowired
	private BookStoreService bookservice;
	
	@Autowired
	private MyBookListService booklistservice;
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		 
		return "book_register";
	}
	
//	@GetMapping("/available_books")
//	public String getAllBooks() {
//		return "booklist";
//	}
	// after implementing get all books  
	
	/*
	 * @GetMapping("/available_books") public ModelAndView getAllBook() {
	 * 
	 * List<BookStore> blist=bookservice.getAllBooks(); ModelAndView mv=new
	 * ModelAndView(); mv.setViewName("booklist"); mv.addObject("book",blist); //
	 * return new ModelAndView("booklist","book",blist); return mv; }
	 */
	
	
	
	@GetMapping("/available_books")
	public ModelAndView getAllBook() {
		List<BookStore> list=bookservice.getAllBooks();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("booklist");
		mv.addObject("book",list);
		
		return mv;
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute BookStore bookstore) {
		
		bookservice.save(bookstore);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks(Model model) {
		
		List<MyBookList> list=booklistservice.getAllBooks();
		model.addAttribute("booklist",list);
		return "mybooks";
	}
	
	@GetMapping("/mylist/{id}")
	public String getMyList(@PathVariable ("id") int id) {
		BookStore b=bookservice.getBookById(id);
		MyBookList mb=new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
		booklistservice.saveMyBook(mb);
		return "redirect:/my_books";
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable ("id") int id, Model model) {
		BookStore b=bookservice.getBookById(id);
		model.addAttribute("bookedit",b);
		return "bookedit";
	}
	
	
}
