package com.mcieciak.service.impl;

import com.mcieciak.dao.BookRepository;
import com.mcieciak.model.Book;
import com.mcieciak.service.BookService;

import java.util.List;

/**
 * Created by Mateusz on 12.08.2016.
 */
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
