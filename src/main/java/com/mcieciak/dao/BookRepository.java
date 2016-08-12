package com.mcieciak.dao;

import com.mcieciak.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mateusz on 11.08.2016.
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findByAuthor(String author);

    List<Book> findByAvailableLessThan(int available);


}
