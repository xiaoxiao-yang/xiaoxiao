package com.spdb.mvc;

/**
 * @Author Yang Qi
 * @Date 2020/8/17 14:54
 */
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.ModelMap;

import java.util.zip.DeflaterOutputStream;

@Controller

@RequestMapping("/hello")

public class HelloController{

    @RequestMapping(method = RequestMethod.GET)

    public String printHello(ModelMap model) {

        model.addAttribute("message", "Hello Spring MVC Framework!");

        return "hello";

    }

}
