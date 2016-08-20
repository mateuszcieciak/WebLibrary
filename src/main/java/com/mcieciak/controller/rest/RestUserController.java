package com.mcieciak.controller.rest;

import com.mcieciak.model.User;
import com.mcieciak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestUserController {

    @Autowired
    private UserService userService;

    // Te ponizsze adnotacje powoduja, ze odpowiedz nie bedzie w formie widoku, lecz zwroci dane
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        List<User> users = userService.findAll();
        return users;
    }

}
