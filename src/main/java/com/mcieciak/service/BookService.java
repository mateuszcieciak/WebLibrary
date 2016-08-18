package com.mcieciak.service;

import com.mcieciak.model.Book;

import java.util.List;

/**
 * Created by Mateusz on 11.08.2016.
 */
public interface BookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Long id);
}


