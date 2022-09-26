package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookExample;
import vn.com.vti.springexam.mapper.BookMapper;

@Controller
@RequestMapping("/bookList")
public class BookListController {

	@Autowired
	private BookMapper bookMapper;

	@RequestMapping("/index")
	public String index(Model model) {
		BookExample bookExample = new BookExample();
		bookExample.setOrderByClause("book.book_id");
		List<Book> bookList = bookMapper.selectByExample(bookExample);

		model.addAttribute("bookList", bookList);
		return "book/bookList";

	}

}
