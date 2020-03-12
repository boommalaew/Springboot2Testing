package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//@RestController
@Controller
public class HomeController {

//    @RequestMapping(path = "/", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
//    shortcut for @RequestMapping()
    @GetMapping("/")
//    public String home() {
    public String home(Model model, HttpServletRequest request) {
//        return "Hello, Spring Boot 2!";
        model.addAttribute("message", "Hello World");
        return "index";
    }

}
