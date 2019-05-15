package com.stackroute.Domain;

import com.stackroute.Domain.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

        public static void main(String[] args) {

            //Using Application context

            System.out.println("\n******Using Application context******");

            AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
            annotationConfigApplicationContext.register(AppConfig.class);
            annotationConfigApplicationContext.refresh();
            Movie movie=(Movie)annotationConfigApplicationContext.getBean("movie");
            Actor actor=(Actor)annotationConfigApplicationContext.getBean("actor");
            System.out.println(movie);
            System.out.println(actor);

            // Printing Actor and Movie Details

        }
    }

