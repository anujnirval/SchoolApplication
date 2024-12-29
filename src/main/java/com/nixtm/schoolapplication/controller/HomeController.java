package com.nixtm.schoolapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"","/","/home"})
    public String displayHomePage(Model model) {
        model.addAttribute("title", "School Application");
        model.addAttribute("username","ANUJ NIRVAL");
        return "home.html";
    }
}
