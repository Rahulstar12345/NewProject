package com.BikkadIT.ControlleToUI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.ControlleToUI.model.Book;

@Controller
public class BookController2 {
	@GetMapping("/Book2")
	public String bookmsg(Model model) {
		Book book = new Book();
		book.setBookid(143);
		book.setBookname("Java");
		book.setBookprice(500.00);

		Book book1 = new Book();
		book1.setBookid(133);
		book1.setBookname("C");
		book1.setBookprice(400.00);

		Book book2 = new Book();
		book2.setBookid(144);
		book2.setBookname("Python");
		book2.setBookprice(600.00);

		List<Book> l = new ArrayList();
		l.add(book);
		l.add(book1);
		l.add(book2);

		model.addAttribute("BOOK1", l);
		return "bk1";

	}

}
