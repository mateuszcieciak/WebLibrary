package com.mcieciak.controller;

import com.mcieciak.model.User;
import com.mcieciak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public String getUsersPage(Model model){
        List<User> userList=userService.findAll();

        model.addAttribute("userList", userList);

        return "users";
    }
}
