package com.spdb.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author Yang Qi
 * @Date 2020/8/14 15:59
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor.");
    }

    public void printAge(){
        System.out.println("name is "+ student.getAge());
    }

    public void printName(){
        System.out.println("name is "+ student.getName());
    }
}
