package com.controller;

import com.group12.FastLeaning.ClassPage;
import com.service.ClassPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ClassPageService classPageService;



    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    public String searchSubmit(Model model, @Param("query") String query){
        List<ClassPage> classPages = classPageService.findBySearchQuery(query);
        model.addAttribute("ClassPages", classPages);
        model.addAttribute("query", query);
        return "index";

    }
}
