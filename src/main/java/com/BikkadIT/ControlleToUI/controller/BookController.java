package com.BikkadIT.ControlleToUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.ControlleToUI.model.Book;
@Controller
public class BookController {
	@GetMapping("/BookDetails")
	public ModelAndView getbookdata() {
		Book book = new Book();
		book.setBookid(143);
		book.setBookname("Java");
		book.setBookprice(500.00);

		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOK", book);
		mav.setViewName("bk");
		return mav;

	}

}
