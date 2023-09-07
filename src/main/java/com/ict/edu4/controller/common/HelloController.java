package com.ict.edu4.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping
    public ModelAndView getHello() {
        ModelAndView mv = new ModelAndView("index");
        String msg = "Hello Springboot MVC";
        mv.addObject("msg", msg);
        return mv;
    }
}
