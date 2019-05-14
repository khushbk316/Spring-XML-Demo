package com.stackroute.Domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanNameAware {


        private Actor actor;

        public Movie() {

        }

        public Movie(Actor actor) {

            this.actor = actor;
        }

        public Actor getActor() {
            return actor;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        @Override
        public String toString() {
            return "\nFetching Actor details from Movie class.." +
                    "\n" + actor;
        }

    public void setBeanName(String beanName) {
        System.out.println("bean name is...."+beanName);
    }
private ApplicationContext context;
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
    }
}

