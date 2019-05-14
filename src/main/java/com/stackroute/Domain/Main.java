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


            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie = (Movie) context.getBean("movie");

            System.out.println(movie);
            Movie movie1 = (Movie) context.getBean("movie1");

            System.out.println(movie1);
            Movie movie2 = (Movie) context.getBean("movie2");

            System.out.println(movie2);
            System.out.println(movie==movie1);

        }
    }

