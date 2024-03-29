package com.dst.FirstDstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@Controller
public class UserController {
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
