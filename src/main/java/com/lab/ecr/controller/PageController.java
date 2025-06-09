package com.lab.ecr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Guest") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("info", "This app is a lab to demonstrate how to dockerized and push spring apps to ECS.");
        return "about";
    }
}
