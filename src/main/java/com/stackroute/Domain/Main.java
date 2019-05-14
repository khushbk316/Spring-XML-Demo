package com.stackroute.Domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

        public static void main(String[] args) {

//Application context.........

            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

            Movie movie2 = (Movie) context.getBean("movie2");
            System.out.println("using applicationcontext....");
            System.out.println(movie2);


        }
    }

