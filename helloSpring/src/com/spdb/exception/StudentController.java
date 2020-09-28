package com.spdb.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Yang Qi
 * @Date 2020/8/18 13:43
 */

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value="/addStudent", method = RequestMethod.GET)
    @ExceptionHandler({SpringException.class})
    public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){

        if(student.getAge()<10){
            throw new SpringException("the age is too small.");
        }else{
            model.addAttribute("age", student.getAge());
        }
        if(student.getName().length()<5){
            throw new SpringException("the name is too short.");
        }else{
            model.addAttribute("name", student.getName());
        }
        model.addAttribute("id", student.getId());
        return "result";
    }
}
