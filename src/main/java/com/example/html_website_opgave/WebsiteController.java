package com.example.html_website_opgave;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class WebsiteController {

    @org.springframework.stereotype.Controller
    public class SomethingController {
        @GetMapping("/")
        public String index() {
            return "index";
        }
    }
}
