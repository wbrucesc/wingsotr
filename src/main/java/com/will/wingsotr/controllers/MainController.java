package com.will.wingsotr.controllers;

import com.will.wingsotr.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private ItemRepository itemRepo;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("salads", itemRepo.findAllByCategory("Salad"));
        model.addAttribute("wings", itemRepo.findAllByCategory("Wing"));
        return "menu";
    }


}

