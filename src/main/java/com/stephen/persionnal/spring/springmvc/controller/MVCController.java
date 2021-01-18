package com.stephen.persionnal.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MVCController {

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user","zhangsan");
        modelAndView.setViewName("sucess");
        return modelAndView;
    }
}
