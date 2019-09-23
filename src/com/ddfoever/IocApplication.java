package com.ddfoever;

import com.ddfoever.dao.UserDao;
import com.ddfoever.daoimpl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDaoImpl.class);
        userDao.say();
    }
}
