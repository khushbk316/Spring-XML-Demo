package com.stackroute.Domain.config;

import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfigurations {

        @Bean(name="movie")
        public Movie getMovieBean()
        {
            return new Movie(new Actor("Prabhas","male",40));
        }

        @Bean(name="actor")
        public Actor getBeanActor()
        {
            return new Actor("Shah","male",30);
        }
    }

