package com.exam2SpringBoot.exam2SpringBoot.controllers;

import com.exam2SpringBoot.exam2SpringBoot.Models.VirusesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//SpringBoot assigns this class as the Controller:
@Controller
public class controller{
    @Autowired
    VirusesRepo virusesRepo;

    //ModelAndView function to view viruses table:
    @RequestMapping("/")
    public ModelAndView HomeScreen(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("viruseslist", virusesRepo.findAll());
        return model;
    }
}
