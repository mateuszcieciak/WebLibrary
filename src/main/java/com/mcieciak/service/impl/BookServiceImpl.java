package com.mcieciak.service.impl;

import com.mcieciak.dao.BookRepository;
import com.mcieciak.model.Book;
import com.mcieciak.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mateusz on 12.08.2016.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
