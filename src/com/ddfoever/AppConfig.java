package com.ddfoever;

import com.ddfoever.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="user2")
    public User getUser(){
        User u = new User();
        u.setId(12);
        u.setName("i am a bean2");
        return u;
    }
    @Bean(name="user1")
    public User getUser1(){
        User u = new User();
        u.setId(11);
        u.setName("i am a bean1");
        return u;
    }
}
