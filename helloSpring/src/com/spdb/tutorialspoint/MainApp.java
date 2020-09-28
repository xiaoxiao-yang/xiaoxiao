package com.spdb.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Yang Qi
 * @Date 2020/8/12 14:39
 * 婸
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("config/Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        obj1.getMessage1();
        obj1.getMessage2();
        HelloIndia obj2 = context.getBean("helloIndia", HelloIndia.class);
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();
        context.registerShutdownHook();
    }
}
