package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }

    @GetMapping("/impressum")
    public String impressum() {
        return "impressum";
    }
}
