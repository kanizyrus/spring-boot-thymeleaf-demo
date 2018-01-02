package me.kanizyrus.springbootthymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    /* @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET) */
    @GetMapping("/")
    private String getIndex() {
        /* Redirect to Thymeleaf template by the name of index.html. */
        return "index";
    }

    @GetMapping("/international")
    public String getInternationalPage() {
        return "international";
    }
}
