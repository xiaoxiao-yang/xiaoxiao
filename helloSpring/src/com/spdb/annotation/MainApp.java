package com.spdb.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Yang Qi
 * @Date 2020/8/14 15:36
 */


public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/BeansAnnotaion.xml");
        Profile profile = context.getBean("profile", Profile.class);
        profile.printAge();
        profile.printName();
    }

}
