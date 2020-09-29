package com.enosh.coolyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class PageController {

    @RequestMapping(value = "/", method = GET)
    public String index(){
        return "/build/index.html";
    }

    @RequestMapping(value = "/manifest.json", method = GET)
    public String manifest(){
        return "/build/manifest.json";
    }

    @RequestMapping(value = "/static/css/main.5ecd60fb.chunk.css", method = GET)
    public String css(){
        return "/build/static/css/main.5ecd60fb.chunk.css";
    }

    @RequestMapping(value = "/static/js/2.30644276.chunk.js", method = GET)
    public String js1(){
        return "/build/static/js/2.30644276.chunk.js";
    }

    @RequestMapping(value = "/static/js/main.4f282d28.chunk.js", method = GET)
    public String js2(){
        return "/build/static/js/main.4f282d28.chunk.js";
    }
}
