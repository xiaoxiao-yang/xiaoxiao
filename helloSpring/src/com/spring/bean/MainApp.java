package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Yang Qi
 * @Date 2020/7/28 19:27
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/bean/Beans.xml");
        Student stu = (Student) context.getBean("Student");
        System.out.println("The student information is: "+stu.getMassages());
    }
}
