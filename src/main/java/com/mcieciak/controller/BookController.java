package com.mcieciak.controller;

import com.mcieciak.model.Book;
import com.mcieciak.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Mateusz on 11.08.2016.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooksPage(Model model) {

        List<Book> bookList= bookService.findAll();
        model.addAttribute("bookList", bookList);

        return "books";
    }

    @RequestMapping(value = "/book/create", method = RequestMethod.GET)
    public String getCreateBook() {
        return "book-create";
    }

}
