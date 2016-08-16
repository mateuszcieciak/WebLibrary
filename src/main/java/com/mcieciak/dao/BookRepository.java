package com.mcieciak.dao;

import com.mcieciak.model.Book;

import java.util.List;

/**
 * Created by Mateusz on 11.08.2016.
 */
public interface BookRepository  {
    List<Book> findAll();




}
