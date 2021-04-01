package com.controller;

import com.group12.FastLeaning.ClassPage;
import com.service.ClassPageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SearchController {
    Logger logger = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    private ClassPageService classPageService;

    @GetMapping("/")
    public String main(){
        return "index";
    }


    @RequestMapping("/")
    public String searchSubmit(Model model, @Param("query") String query){
        List<ClassPage> classPages = classPageService.findBySearchQuery(query);
        logger.debug(Arrays.toString(classPages.toArray()));
        logger.warn(Arrays.toString(classPages.toArray()));
        logger.error(Arrays.toString(classPages.toArray()));
        logger.trace(Arrays.toString(classPages.toArray()));
        model.addAttribute("classPages", classPages);
        model.addAttribute("query", query);
        return "index";
    }


}
