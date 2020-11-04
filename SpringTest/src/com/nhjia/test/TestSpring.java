package com.nhjia.test;

import com.nhjia.pojo.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        Category c = (Category) context.getBean("c");

        System.out.println(c.getName());
    }
}