package com.example.html_website_opgave;


import DB.DBtest;
import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WebsiteController {
    @GetMapping("/")
    public String index(@ModelAttribute Person person, Model model) {
        DBtest dBtest = new DBtest();
        System.out.println("hello");
        model.addAttribute("people", dBtest.testJDBC());
        return "index";
    }

}
