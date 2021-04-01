package com.group12.FastLeaning.controller;

import com.group12.FastLeaning.model.ClassPage;
import com.group12.FastLeaning.service.ClassPageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    private ClassPageService classPageService;

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/")
    public String searchSubmit(Model model, @Param("query") String query){
        List<ClassPage> classPages = classPageService.findBySearchQuery(query);
        logger.debug("classPages List: " + Arrays.toString(classPages.toArray()));
        logger.warn("classPages List: " + Arrays.toString(classPages.toArray()));
        logger.error("classPages List: " + Arrays.toString(classPages.toArray()));
        logger.trace("classPages List: " + Arrays.toString(classPages.toArray()));
        System.out.println("classPages List: " + Arrays.toString(classPages.toArray()));
        model.addAttribute("classPages", classPages);
        model.addAttribute("query", query);
        return "index";
    }


}
