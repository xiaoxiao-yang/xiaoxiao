package com.spdb.annotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * @Author Yang Qi
 * @Date 2020/8/14 9:22
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }
}
