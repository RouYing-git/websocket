package com.example.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class clientController {
//renhongying
    @GetMapping("/client")
    public ModelAndView client(){
        return new ModelAndView("client");
    }
    //hahaha
}
