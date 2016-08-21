package com.mcieciak.controller;

import com.mcieciak.model.Book;
import com.mcieciak.model.Rent;
import com.mcieciak.model.User;
import com.mcieciak.service.BookService;
import com.mcieciak.service.RentService;
import com.mcieciak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;

@Controller
public class RentController {

    @Autowired
    private RentService rentService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/rents", method = RequestMethod.GET)
    public String getRentsPage(Model model, Principal principal) {

//        Alternatywa gdy nie uzyjemy principal jako argumentu getRentsPage
//        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
//        authentication.getPrincipal();

        String email = principal.getName();
        User user = userService.findByEmail(email);

        List<Rent> rentList = rentService.findByUser(user);
        model.addAttribute("rentList", rentList);

        return "rents";
    }

    @RequestMapping(value = "/rent/book/{bookId}", method = RequestMethod.GET)
    public String rentBook(@PathVariable Long bookId, Principal principal) {

        Book book = bookService.findById(bookId);
        User user = userService.findByEmail(principal.getName());

        Rent rent = new Rent(book, user);
        book.setAvailable(book.getAvailable()-1);
        bookService.save(book);
        rentService.save(rent);

        return "redirect:/rents";
    }
}
