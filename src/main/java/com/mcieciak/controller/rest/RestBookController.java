package com.mcieciak.controller.rest;


import com.mcieciak.model.Book;
import com.mcieciak.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestBookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value="/books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){
        List<Book> books = bookService.findAll();
        return books;
    }
}
