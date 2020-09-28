package com.spdb.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Yang Qi
 * @Date 2020/8/13 17:12
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/BeansDI.xml");
//        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        TextEditor textEditor4 = context.getBean("textEditor4", TextEditor.class);
//        TextEditor textEditor3 = context.getBean("textEditor3", TextEditor.class);
//        textEditor.spellCheck();
        textEditor4.spellCheck();

    }
}
