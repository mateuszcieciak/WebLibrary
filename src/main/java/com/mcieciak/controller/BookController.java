package com.mcieciak.controller;

import com.mcieciak.model.Book;
import com.mcieciak.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

        List<Book> bookList = bookService.findAll();

        model.addAttribute("bookList", bookList);

        return "books";
    }

    @RequestMapping(value = "/book/create", method = RequestMethod.GET)
    public String getCreateBook(Model model) {
        model.addAttribute("book", new Book());
        return "book-create";
    }

    @RequestMapping(value = "/book/edit/{id}", method = RequestMethod.GET)
    public String getEditBook(Model model, @PathVariable Long id) {

        Book book = bookService.findById(id);
        model.addAttribute("book", book);

        // Aby nie tworzyc nowego formularza, wykorzystujemy ten do dodawania ksiazki
        return "book-create";
    }

    /* Mozna tez w ten sposob
    public String createBook(@RequestParam String title,
                             @RequestParam String author,
                             @RequestParam int available) {
        Book book = new Book(title, author, available);
        bookService.save(book);
        return "redirect:/books";
     */
    @RequestMapping(value = "/book/save", method = RequestMethod.POST)
    public String createBook(@ModelAttribute Book book) {
        bookService.save(book);
        // Poniżej wykona się cała akcja dodawania ksiązek zaimplementowana w getBooksPage, nie
        // powtarzamy kodu dzięki redirect
        return "redirect:/books";
    }

    @RequestMapping(value="/book/delete/{id}", method = RequestMethod.POST)
    public String deleteBook(@PathVariable Long id){
        bookService.delete(id);

        return "redirect/books";
    }


}




