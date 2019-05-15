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
import org.springframework.stereotype.Component;

@Component
public class Main {

        public static void main(String[] args) {


            AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
            context.register(AppConfig.class);
            context.refresh();
            Movie movie= (Movie) context.getBean("movie");
//            Actor actor= (Actor) context.getBean("actor");
            System.out.println(movie);
//            System.out.println(actor);

        }
    }

