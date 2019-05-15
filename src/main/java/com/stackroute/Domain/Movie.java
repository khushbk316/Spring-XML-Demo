package com.stackroute.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {


        private Actor actor;

        public Movie() {

        }
        @Autowired
        public Movie(Actor actor) {
            actor.setName("sharukh");
            actor.setGender("male");
            actor.setAge(40);
           System.out.println("hi");
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
    }

