package com.ddfoever;

import com.ddfoever.dao.UserDao;
import com.ddfoever.daoimpl.UserDaoImpl;
import com.ddfoever.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用注解的方式配置spring 容器，而且官网也是比较推荐使用的 也就是使用java config
 */
public class IocApplication {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        UserDao userDao = applicationContext.getBean("userDao",UserDaoImpl.class);
//        userDao.say();

        //通过注解的方式获取 spring 容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        User u = applicationContext.getBean(User.class);//按类型获取 如果有两个相同类型的bean 就会有问题 只能匹配其中一个
        User u = applicationContext.getBean("user1",User.class);//按照name 去获取
        System.out.println(u.toString());
    }
}
