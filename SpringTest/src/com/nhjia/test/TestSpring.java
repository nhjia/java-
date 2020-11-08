package com.nhjia.test;

import com.nhjia.pojo.Category;
import com.nhjia.pojo.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        Project  p = (Project) context.getBean("p");

        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());
    }
}