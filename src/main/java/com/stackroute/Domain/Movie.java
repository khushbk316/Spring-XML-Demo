package com.stackroute.Domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Movie implements InitializingBean, DisposableBean {


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

    //overriding the method of initializingbean....

    public void afterPropertiesSet() throws Exception {
        System.out.println("we just created movie bean......");

    }

    //overriding method of destroybean.....

    public void destroy() throws Exception {
        System.out.println("bean has bean destroyed......");
    }
}

