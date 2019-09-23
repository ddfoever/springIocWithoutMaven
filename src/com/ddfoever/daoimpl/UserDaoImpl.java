package com.ddfoever.daoimpl;

import com.ddfoever.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("hi spring ioc");
    }
}
