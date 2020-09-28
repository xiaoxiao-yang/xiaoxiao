package com.spdb.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Yang Qi
 * @Date 2020/8/18 11:13
 */

@Controller
public class WebControllerRedirect {

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }
}
