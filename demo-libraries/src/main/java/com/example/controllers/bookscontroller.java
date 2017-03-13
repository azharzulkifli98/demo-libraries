package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by azhar on 3/11/2017.
 */
@Controller
@RequestMapping("books")
public class bookscontroller {
    //default path is /books

    static ArrayList<String> books = new ArrayList<>();

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("listing", books);
        model.addAttribute("title", "Good Books Library");
        return "books/index";
    }

    @RequestMapping(value="add", method=RequestMethod.GET)
    public String addBook(Model model) {

        model.addAttribute("title", "Add Book");
        return "books/add";
    }

    @RequestMapping(value="add", method=RequestMethod.POST)
    public String processAddBook(@RequestParam String bookName) {

        books.add(bookName);
        return "redirect:";
        //redirects to /cheese
    }
}
