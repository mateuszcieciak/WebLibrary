package com.mcieciak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mateusz on 12.08.2016.
 */

@Controller
public class MainController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getMainPage(){
        return "main";
    }
}
